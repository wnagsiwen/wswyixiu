package com.zykj.wswyixiu.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by zykj on 2017/4/8.
 */

public class MyApp extends Application {
    private Context context;
    public void onCreate() {
        super.onCreate();
        this.context = context;

    }
}
