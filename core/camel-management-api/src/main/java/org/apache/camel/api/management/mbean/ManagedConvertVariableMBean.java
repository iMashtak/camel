/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.api.management.mbean;

import org.apache.camel.api.management.ManagedAttribute;

public interface ManagedConvertVariableMBean extends ManagedProcessorMBean {

    @ManagedAttribute(description = "The variable name")
    String getName();

    @ManagedAttribute(description = "If the result should be stored in another variable")
    String getToName();

    @ManagedAttribute(description = "The java type to convert to")
    String getType();

    @ManagedAttribute(description = "To use a specific charset when converting")
    String getCharset();

}
