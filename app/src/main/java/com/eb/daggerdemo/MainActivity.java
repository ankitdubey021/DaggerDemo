package com.eb.daggerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.eb.daggerdemo.di.ApiInterface;
import com.eb.daggerdemo.di.App;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        App.getAppComponent().inject(this);


        Log.e("my retrofit",apiInterface.toString());
    }
}
