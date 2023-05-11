/*
 * Copyright The OpenTelemetry Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package io.opentelemetry.javaagent.instrumentation.akkahttp.server;

import akka.http.javadsl.model.HttpHeader;
import akka.http.javadsl.model.HttpResponse;
import akka.http.javadsl.model.headers.RawHeader;
import io.opentelemetry.javaagent.bootstrap.http.HttpServerResponseMutator;
import java.util.ArrayList;
import java.util.List;

final class AkkaHttpResponseMutator implements HttpServerResponseMutator<HttpResponse> {

  private final List<HttpHeader> headers = new ArrayList<>();

  @Override
  public void appendHeader(HttpResponse response, String name, String value) {
    headers.add(RawHeader.create(name, value));
  }

  List<HttpHeader> getHeaders() {
    return headers;
  }
}
