package com.kk.testlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kk.testlibmodule.TT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TT.toast(this);
    }
}