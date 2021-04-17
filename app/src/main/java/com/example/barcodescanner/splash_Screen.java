package com.example.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static java.lang.Thread.sleep;

public class splash_Screen extends AppCompatActivity {
    ImageView splashImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        splashImage=(ImageView)findViewById(R.id.amal_Solution);
        Animation myanim= AnimationUtils.loadAnimation(this,R.anim.my_animation);
        splashImage.startAnimation(myanim);

        Thread myThread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(5000);
                    startActivity(new Intent(splash_Screen.this,MainActivity.class));
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        myThread.start();
    }


}