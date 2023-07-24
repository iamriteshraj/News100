package com.example.news100;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;

public class SplashScreen extends AppCompatActivity {

    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);








        lottieAnimationView=findViewById(R.id.Lotianimation_view_01);
        lottieAnimationView.setAnimation(R.raw.lotinews);
        lottieAnimationView.playAnimation();
        lottieAnimationView.loop(true);



        new Handler().postDelayed(() -> {


            Intent i = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(i);
        }, 2500);


    }
}