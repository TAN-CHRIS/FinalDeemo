package com.example.chris.finaldeemo;

import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.VideoView;

import com.qmuiteam.qmui.util.QMUIStatusBarHelper;

public class MediaPlayerActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);

        //沉浸式状态栏
        QMUIStatusBarHelper.translucent(this);

        //获取界面上的VideoView组件
        videoView= findViewById(R.id.videoView01);
        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/raw/res"));
        videoView.start();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

            @Override
            public void onPrepared(MediaPlayer mp) {
                mp.start();
                mp.setLooping(true);
            }

        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction()== MotionEvent.ACTION_UP){
            finish();
        }
        return true;
    }
}
