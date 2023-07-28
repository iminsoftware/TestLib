package com.mtk.testlib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mtk.mylibrary.EasyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EasyToast.show(this,"mylibrary");
    }
}