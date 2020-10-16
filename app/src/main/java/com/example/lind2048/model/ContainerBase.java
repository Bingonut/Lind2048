package com.example.lind2048.model;

import android.util.Log;

import java.util.Random;

public class ContainerBase {
    public static final String TAG = "ContainerBase";
    protected int containerSize;
    protected LatticeType[][] container;
    protected Random random;

    ContainerBase()
    {

    }

    protected int bumpUp(){
        Log.d(TAG, "Do bump up.");
        return 0;
    }

    protected int bumpDown(){
        Log.d(TAG, "Do bump down.");
        return 0;
    }

    protected int bumpLeft(){
        Log.d(TAG, "Do bump left.");
        return 0;
    }

    protected int bumpRight(){
        Log.d(TAG, "Do bump right.");
        return 0;
    }

    protected int produceNewValue()
    {
        Log.d(TAG, "Produce new value in lattice.");
        return 0;
    }

    protected int cleanContainer()
    {
        Log.d(TAG, "Clean container.");
        return 0;
    }
}
