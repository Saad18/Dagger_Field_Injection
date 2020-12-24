package com.saad.dagger_field_injection;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    @Inject
    public Car(Engine engine, Wheels wheels) {
    }

    public void drive(){

        Log.d(TAG, "drive...");

    }
}
