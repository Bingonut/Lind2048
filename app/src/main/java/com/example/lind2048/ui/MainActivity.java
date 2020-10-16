package com.example.lind2048.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lind2048.R;
import com.example.lind2048.model.ClassicContainer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ClassicContainer classicContainer = new ClassicContainer();

    }
}