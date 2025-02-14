/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.instrumentation.awssdk.v2_2;

import static java.util.Collections.emptyList;

import io.opentelemetry.instrumentation.api.instrumenter.http.HttpClientAttributesGetter;
import java.util.List;
import javax.annotation.Nullable;
import software.amazon.awssdk.core.interceptor.ExecutionAttributes;
import software.amazon.awssdk.http.SdkHttpRequest;
import software.amazon.awssdk.http.SdkHttpResponse;

class AwsSdkHttpAttributesGetter
    implements HttpClientAttributesGetter<ExecutionAttributes, SdkHttpResponse> {

  @Override
  public String getUrlFull(ExecutionAttributes request) {
    SdkHttpRequest httpRequest =
        request.getAttribute(TracingExecutionInterceptor.SDK_HTTP_REQUEST_ATTRIBUTE);
    return httpRequest.getUri().toString();
  }

  @Override
  public String getMethod(ExecutionAttributes request) {
    SdkHttpRequest httpRequest =
        request.getAttribute(TracingExecutionInterceptor.SDK_HTTP_REQUEST_ATTRIBUTE);
    return httpRequest.method().name();
  }

  @Override
  public List<String> getRequestHeader(ExecutionAttributes request, String name) {
    SdkHttpRequest httpRequest =
        request.getAttribute(TracingExecutionInterceptor.SDK_HTTP_REQUEST_ATTRIBUTE);
    List<String> value = httpRequest.headers().get(name);
    return value == null ? emptyList() : value;
  }

  @Override
  public Integer getStatusCode(
      ExecutionAttributes request, SdkHttpResponse response, @Nullable Throwable error) {
    return response.statusCode();
  }

  @Override
  public List<String> getResponseHeader(
      ExecutionAttributes request, SdkHttpResponse response, String name) {
    List<String> value = response.headers().get(name);
    return value == null ? emptyList() : value;
  }
}
