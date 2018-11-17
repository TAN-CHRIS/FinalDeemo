package com.example.chris.finaldeemo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.qmuiteam.qmui.util.QMUIStatusBarHelper;

import org.w3c.dom.Text;

public class CheckInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_in);

        //沉浸式状态栏
        QMUIStatusBarHelper.translucent(this);

        TextView textView = findViewById(R.id.button2);
        TextView textView2 = findViewById(R.id.textView2);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"font/HanYiYanKaiW-2.ttf");
        textView.setTypeface(typeface, typeface.BOLD_ITALIC);
        textView2.setTypeface(typeface,Typeface.BOLD);

    }
}
