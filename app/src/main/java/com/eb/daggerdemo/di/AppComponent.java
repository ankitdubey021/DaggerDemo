package com.eb.daggerdemo.di;

import com.eb.daggerdemo.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(MainActivity clazz);
}
