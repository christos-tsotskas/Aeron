/*
 * Copyright 2014 Real Logic Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.real_logic.aeron;

import uk.co.real_logic.agrona.concurrent.UnsafeBuffer;

/**
 * Management wrapper for a buffer that can be closed to the underlying resource can be released.
 */
interface ManagedBuffer extends AutoCloseable
{
    /**
     * Get the managed buffer.
     *
     * @return the managed buffer.
     */
    UnsafeBuffer buffer();

    /**
     * Close the resources underlying the buffer.
     */
    void close();
}
