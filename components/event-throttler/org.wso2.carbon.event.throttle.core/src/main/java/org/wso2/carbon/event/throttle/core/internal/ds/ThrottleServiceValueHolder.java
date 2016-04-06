/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.wso2.carbon.event.throttle.core.internal.ds;

import org.wso2.carbon.ndatasource.core.DataSourceService;
import org.wso2.carbon.event.throttle.core.internal.CarbonThrottlerService;

/**
 * Value holder class for OSGi references
 */
public final class ThrottleServiceValueHolder {
    private static DataSourceService dataSourceService;
    private static CarbonThrottlerService throttlerService;

    private ThrottleServiceValueHolder() {
    }

    public static void registerThrottlerService(CarbonThrottlerService service){
        throttlerService = service;
    }

    public static CarbonThrottlerService getThrottlerService(){
        return throttlerService;
    }

    public static DataSourceService getDataSourceService() {
        return dataSourceService;
    }

    public static void setDataSourceService(DataSourceService dataSourceService) {
        ThrottleServiceValueHolder.dataSourceService = dataSourceService;
    }
}