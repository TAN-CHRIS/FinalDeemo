package com.example.chris.finaldeemo;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.qmuiteam.qmui.util.QMUIStatusBarHelper;

public class MainNaviActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_navi);

        //沉浸式状态栏
        QMUIStatusBarHelper.translucent(this);

        //modify the text font
        TextView eyekeeper = findViewById(R.id.eye_keeper);
        TextView checkin = findViewById(R.id.check_in);
        TextView login = findViewById(R.id.log_in);
        Typeface typeface = Typeface.createFromAsset(getAssets(),"font/HanYiYanKaiW-2.ttf");
        eyekeeper.setTypeface(typeface, typeface.BOLD_ITALIC);
        checkin.setTypeface(typeface, typeface.BOLD_ITALIC);
        login.setTypeface(typeface, typeface.BOLD_ITALIC);
    }

    public void GoTOLogIn(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void GoToMedia(View view){
        Intent intent = new Intent(this, MediaPlayerActivity.class);
        startActivity(intent);
    }

    public void GoToCheckIn(View view){
        Intent intent = new Intent(this, CheckInActivity.class);
        startActivity(intent);
    }
}
