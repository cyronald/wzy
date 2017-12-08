/*
 * Copyright 2016 jeasonlzy(廖子尧)
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
package com.firstvrp.okrx.adapter;

import com.firstvrp.okgo.adapter.AdapterParam;
import com.firstvrp.okgo.adapter.Call;
import com.firstvrp.okgo.adapter.CallAdapter;
import com.firstvrp.okgo.model.Response;

import rx.Single;

/**
 * ================================================
 * 作    者：jeasonlzy（廖子尧）Github地址：https://github.com/jeasonlzy
 * 版    本：1.0
 * 创建日期：2017/5/26
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class SingleResponse<T> implements CallAdapter<T, Single<Response<T>>> {
    @Override
    public Single<Response<T>> adapt(Call<T> call, AdapterParam param) {
        ObservableResponse<T> body = new ObservableResponse<>();
        return body.adapt(call, param).toSingle();
    }
}
