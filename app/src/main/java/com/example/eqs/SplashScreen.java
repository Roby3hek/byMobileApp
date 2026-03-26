package com.example.eqs;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGTH = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        ImageView auto1 = (ImageView) findViewById(R.id.imageView38);
        ImageView auto2 = (ImageView) findViewById(R.id.imageView50);
        ImageView el1 = (ImageView) findViewById(R.id.imageView40);
        ImageView el2 = (ImageView) findViewById(R.id.imageView51);
        ImageView rem1 = (ImageView) findViewById(R.id.imageView43);
        ImageView rem2 = (ImageView) findViewById(R.id.imageView48);
        ImageView him1 = (ImageView) findViewById(R.id.imageView42);
        ImageView him2 = (ImageView) findViewById(R.id.imageView53);
        ImageView san1 = (ImageView) findViewById(R.id.imageView46);
        ImageView serv = (ImageView) findViewById(R.id.imageView47);
        TextView Service = (TextView) findViewById(R.id.textView39);
        ImageView logo = (ImageView) findViewById(R.id.imageView49);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
        Animation anim = null;
        Animation anim2 = null;
        Animation anim3 = null;
        anim = AnimationUtils.loadAnimation(this, R.anim.mytrans);
        anim2 = AnimationUtils.loadAnimation(this, R.anim.myscale);
        anim3 = AnimationUtils.loadAnimation(this, R.anim.myrotate);

        auto1.startAnimation(anim);
        auto2.startAnimation(anim);
        el1.startAnimation(anim);
        el2.startAnimation(anim);
        rem1.startAnimation(anim);
        rem2.startAnimation(anim);
        him1.startAnimation(anim);
        him2.startAnimation(anim);
        san1.startAnimation(anim);
        serv.startAnimation(anim);
        Service.startAnimation(anim2);
        logo.startAnimation(anim3);
    }
}