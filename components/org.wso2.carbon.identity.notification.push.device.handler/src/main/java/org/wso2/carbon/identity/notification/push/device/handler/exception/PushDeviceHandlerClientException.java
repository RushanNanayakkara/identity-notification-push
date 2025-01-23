/*
 * Copyright (c) 2025, WSO2 LLC. (http://www.wso2.com).
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
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

package org.wso2.carbon.identity.notification.push.device.handler.exception;

/**
 * Push device handler client exception.
 */
public class PushDeviceHandlerClientException extends PushDeviceHandlerException {

    private static final long serialVersionUID = -4591179881980553381L;

    public PushDeviceHandlerClientException(String message) {

        super(message);
    }

    public PushDeviceHandlerClientException(String errorCode, String message) {

        super(errorCode, message);
    }

    public PushDeviceHandlerClientException(String message, Throwable cause) {

        super(message, cause);
    }

    public PushDeviceHandlerClientException(String errorCode, String message, Throwable cause) {

        super(errorCode, message, cause);
    }
}
