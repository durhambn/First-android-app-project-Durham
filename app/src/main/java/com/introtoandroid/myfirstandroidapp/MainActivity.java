package com.introtoandroid.myfirstandroidapp;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String DEBUG_TAG="MyFirstAppLogging";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(DEBUG_TAG, "In the onCreate() method of the MyFirstAndriodAppActivity Class");

        //forceError();
    }

    public void forceError(){
        if(true){
            throw new Error("Whoops");
        }
    }
}
