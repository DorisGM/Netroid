/*
 * Copyright (C) 2015 Vince Styling
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vincestyling.netroid;

public abstract class Listener<T> implements IListener<T> {
    public void onPreExecute() {
    }

    public void onFinish() {
    }

    public void onError(NetroidError error) {
    }

    public void onCancel() {
    }

    public void onNetworking() {
    }

    public void onUsedCache() {
    }

    public void onRetry() {
    }

    public void onProgressChange(long fileSize, long downloadedSize) {
    }
}