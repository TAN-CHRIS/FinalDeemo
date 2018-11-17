package com.example.chris.finaldeemo;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.qmuiteam.qmui.util.QMUIStatusBarHelper;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //沉浸式状态栏
        QMUIStatusBarHelper.translucent(this);

        //modify the text font
        TextView textView = findViewById(R.id.textView);
        TextView buttonText = findViewById(R.id.button);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"font/HanYiYanKaiW-2.ttf");
        textView.setTypeface(typeface, typeface.BOLD_ITALIC);
        buttonText.setTypeface(typeface, typeface.BOLD_ITALIC);
    }

    public void GoToNavi(View view){
        Intent intent = new Intent(this, MainNaviActivity.class);
        startActivity(intent);
    }
}
