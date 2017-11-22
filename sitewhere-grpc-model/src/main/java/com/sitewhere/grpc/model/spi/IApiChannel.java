/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.grpc.model.spi;

import java.util.concurrent.TimeUnit;

/**
 * Common interface for GRPC channels that handle API calls.
 * 
 * @author Derek
 */
public interface IApiChannel {

    /**
     * Wait the default amount of time for API to become available.
     * 
     * @throws ApiNotAvailableException
     */
    public void waitForApiAvailable() throws ApiNotAvailableException;

    /**
     * Wait for a maximum amount of time for the API to become available. Displays
     * 'waiting' messages to log after a specified delay.
     * 
     * @param duration
     * @param unit
     * @param logMessageDelay
     * @throws ApiNotAvailableException
     */
    public void waitForApiAvailable(long duration, TimeUnit unit, long logMessageDelay) throws ApiNotAvailableException;
}