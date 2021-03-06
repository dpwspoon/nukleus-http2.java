/**
 * Copyright 2016-2017 The Reaktivity Project
 *
 * The Reaktivity Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.reaktivity.nukleus.http2.internal.routable.stream;

class Settings
{
    static final int DEFAULT_HEADER_TABLE_SIZE = 4096;
    static final boolean DEFAULT_ENABLE_PUSH = true;
    static final int DEFAULT_MAX_CONCURRENT_STREAMS = 100;
    static final int DEFAULT_INITIAL_WINDOW_SIZE = 65_535;
    static final int DEFAULT_MAX_FRAME_SIZE = 16_384;

    int headerTableSize = DEFAULT_HEADER_TABLE_SIZE;
    boolean enablePush = DEFAULT_ENABLE_PUSH;
    int maxConcurrentStreams = DEFAULT_MAX_CONCURRENT_STREAMS;
    int initialWindowSize = DEFAULT_INITIAL_WINDOW_SIZE;
    int maxFrameSize = DEFAULT_MAX_FRAME_SIZE;
    long maxHeaderListSize;
}
