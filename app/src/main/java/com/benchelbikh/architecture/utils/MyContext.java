package com.benchelbikh.architecture.utils;



import android.app.Application;
import android.util.Log;

import com.benchelbikh.architecture.buisness.TarifService;



public class MyContext extends Application {

    private TarifService ds ;


    public MyContext() {
        ds = new TarifService();

    }

    public TarifService getDs() {
        return ds;
    }
}