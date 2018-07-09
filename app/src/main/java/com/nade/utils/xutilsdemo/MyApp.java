package com.nade.utils.xutilsdemo;

import android.app.Application;

import org.xutils.x;

/**
 * 作者: Nade_S on 2018/7/9.
 */

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);

    }
}
