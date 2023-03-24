/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.cn.taildir.taildir;

import com.google.common.base.Preconditions;
import org.apache.catalina.LifecycleState;

public abstract class AbstractSource  {

  private String name;

  private LifecycleState lifecycleState;

  public AbstractSource() {
    lifecycleState = LifecycleState.INITIALIZED;
  }

  public synchronized void start() {
    lifecycleState = LifecycleState.STARTED;
  }
  public synchronized void stop() {
    lifecycleState = LifecycleState.STOPPED;
  }
  public synchronized LifecycleState getLifecycleState() {
    return lifecycleState;
  }
  public synchronized void setName(String name) {
    this.name = name;
  }
  public synchronized String getName() {
    return name;
  }

  public String toString() {
    return this.getClass().getName() + "{name:" + name + ",state:" + lifecycleState + "}";
  }
}
