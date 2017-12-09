package com.insta.minorius.insta;

import android.app.Application;
import android.util.Log;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Minorius on 08.12.2017.
 */

public class App extends Application {

    public static final int views_count = 67;

    private static final String BASE_URL = "https://api.inrating.top/";

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public static Retrofit getRest() {
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static void myLog(Object o){
        Log.d("MyLog", ""+o);
    }

}
