package com.example.downloaddemo.app;

import android.app.Application;

import com.zhy.http.okhttp.OkHttpUtils;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initOkHttpClient();
    }
    private void initOkHttpClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                        .connectTimeout(10000L, TimeUnit.MILLISECONDS) //链接超时
                        .readTimeout(10000L,TimeUnit.MILLISECONDS) //读取超时
                        .build(); //其他配置

                OkHttpUtils.getInstance(okHttpClient);
            }
}
