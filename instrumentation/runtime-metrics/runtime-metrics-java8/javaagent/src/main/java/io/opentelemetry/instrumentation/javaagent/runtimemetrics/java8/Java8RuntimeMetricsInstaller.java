/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.instrumentation.javaagent.runtimemetrics.java8;

import com.google.auto.service.AutoService;
import io.opentelemetry.api.GlobalOpenTelemetry;
import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.instrumentation.runtimemetrics.java8.BufferPools;
import io.opentelemetry.instrumentation.runtimemetrics.java8.Classes;
import io.opentelemetry.instrumentation.runtimemetrics.java8.Cpu;
import io.opentelemetry.instrumentation.runtimemetrics.java8.GarbageCollector;
import io.opentelemetry.instrumentation.runtimemetrics.java8.MemoryPools;
import io.opentelemetry.instrumentation.runtimemetrics.java8.Threads;
import io.opentelemetry.instrumentation.runtimemetrics.java8.internal.JmxRuntimeMetricsUtil;
import io.opentelemetry.javaagent.extension.AgentListener;
import io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk;
import io.opentelemetry.sdk.autoconfigure.spi.ConfigProperties;
import java.util.ArrayList;
import java.util.List;

/** An {@link AgentListener} that enables runtime metrics during agent startup. */
@AutoService(AgentListener.class)
public class Java8RuntimeMetricsInstaller implements AgentListener {

  @Override
  public void afterAgent(AutoConfiguredOpenTelemetrySdk autoConfiguredSdk) {
    ConfigProperties config = autoConfiguredSdk.getConfig();

    boolean defaultEnabled = config.getBoolean("otel.instrumentation.common.default-enabled", true);
    if (!config.getBoolean("otel.instrumentation.runtime-metrics.enabled", defaultEnabled)
        || Double.parseDouble(System.getProperty("java.specification.version")) >= 17) {
      return;
    }
    OpenTelemetry openTelemetry = GlobalOpenTelemetry.get();
    List<AutoCloseable> observables = new ArrayList<>();
    observables.addAll(BufferPools.registerObservers(openTelemetry));
    observables.addAll(Classes.registerObservers(openTelemetry));
    observables.addAll(Cpu.registerObservers(openTelemetry));
    observables.addAll(MemoryPools.registerObservers(openTelemetry));
    observables.addAll(Threads.registerObservers(openTelemetry));
    observables.addAll(GarbageCollector.registerObservers(openTelemetry));
    Thread cleanupTelemetry =
        new Thread(
            () -> {
              JmxRuntimeMetricsUtil.closeObservers(observables);
            });
    Runtime.getRuntime().addShutdownHook(cleanupTelemetry);
  }
}
