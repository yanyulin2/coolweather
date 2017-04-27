package com.coolweather.android.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String addrss, Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(addrss).build();
        client.newCall(request).enqueue(callback);
    }
}
