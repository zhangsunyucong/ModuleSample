package com.yucong.zhang.baselibrary;

import android.app.Application;

/**
 * Created by zhang on 2017/6/20.
 */

public abstract class BaseApplication extends Application {
    public static BaseApplication app;
    public static BaseApplication getInstance() {
        return app;
    }
    protected static boolean isDebug = true;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        initSDK();
    }

    public abstract void initSDK();
}
