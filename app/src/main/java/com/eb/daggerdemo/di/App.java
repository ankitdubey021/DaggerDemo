package com.eb.daggerdemo.di;

import android.app.Application;

public class App extends Application {

    private static  AppComponent appComponent;
    public static AppComponent getAppComponent(){
        return appComponent;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent=buildComponent();

    }

    protected AppComponent buildComponent(){
        return
                DaggerAppComponent.builder()
                        .appModule(new AppModule())
                        .build();
    }
}
