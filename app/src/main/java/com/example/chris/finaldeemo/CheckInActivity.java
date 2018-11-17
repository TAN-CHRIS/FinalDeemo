package com.example.chris.finaldeemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qmuiteam.qmui.util.QMUIStatusBarHelper;

public class CheckInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);

        //沉浸式状态栏
        QMUIStatusBarHelper.translucent(this);



    }
}
