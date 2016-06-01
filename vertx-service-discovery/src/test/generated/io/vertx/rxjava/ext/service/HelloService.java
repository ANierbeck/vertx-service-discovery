/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.rxjava.ext.service;

import java.util.Map;
import rx.Observable;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

/**
 * @author <a href="http://escoffier.me">Clement Escoffier</a>
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link io.vertx.ext.service.HelloService original} non RX-ified interface using Vert.x codegen.
 */

public class HelloService {

  final io.vertx.ext.service.HelloService delegate;

  public HelloService(io.vertx.ext.service.HelloService delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  public void hello(JsonObject name, Handler<AsyncResult<String>> resultHandler) { 
    delegate.hello(name, resultHandler);
  }

  public Observable<String> helloObservable(JsonObject name) { 
    io.vertx.rx.java.ObservableFuture<String> resultHandler = io.vertx.rx.java.RxHelper.observableFuture();
    hello(name, resultHandler.toHandler());
    return resultHandler;
  }


  public static HelloService newInstance(io.vertx.ext.service.HelloService arg) {
    return arg != null ? new HelloService(arg) : null;
  }
}
