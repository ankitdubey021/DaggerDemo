package com.eb.daggerdemo.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class AppModule {

    @Provides
    @Singleton
    public ApiInterface getRetrofitService(Retrofit retrofit){
        return retrofit.create(ApiInterface.class);
    }

    @Singleton
    @Provides
    public Retrofit provideRetrofit(){
        return new Retrofit.Builder()
                .baseUrl("https:www.google.co.in")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
