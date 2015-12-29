package com.demo.architecturedemo;

import android.app.Application;
import android.content.Context;

import com.demo.architecturedemo.Service.ServiceFactory;
import com.demo.architecturedemo.Service.impl.DefaultServiceFactory;

public class GameApplication extends Application {

    private ServiceFactory mServiceFactory;

    private static GameApplication sInstance;

    @Override
    public void onCreate() {
        super.onCreate();

        sInstance = this;

        mServiceFactory = new DefaultServiceFactory();
    }

    public static Context getContext() {
        return sInstance.getApplicationContext();
    }

    public static ServiceFactory getServiceFactory() {
        return sInstance.mServiceFactory;
    }

}
