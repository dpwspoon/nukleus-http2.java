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
package org.reaktivity.nukleus.http2.internal;

import org.reaktivity.nukleus.Configuration;
import org.reaktivity.nukleus.ControllerBuilder;
import org.reaktivity.nukleus.ControllerFactorySpi;

public final class Http2ControllerFactorySpi implements ControllerFactorySpi<Http2Controller>
{
    @Override
    public String name()
    {
        return "http2";
    }

    @Override
    public Class<Http2Controller> kind()
    {
        return Http2Controller.class;
    }

    @Override
    public Http2Controller create(
        Configuration config,
        ControllerBuilder<Http2Controller> builder)
    {
        int window = InternalSystemProperty.WINDOW_SIZE.intValue();
        int maximumSlots = InternalSystemProperty.MAXIMUM_SLOTS.intValue();

        Context context = new Context();
        context.readonly(true)
               .window(window)
               .maximumSlots(maximumSlots)
               .conclude(config);

        return new Http2Controller(context);
    }

}
