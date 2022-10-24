package com.example.animacje;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.example.animacje.R;

public class MainActivity extends AppCompatActivity {

    ImageView image3;
    ImageView image2;
    ImageView imageKostka;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image3 = findViewById(R.id.imageView3);
        image2 = findViewById(R.id.imageView2);
        image3 = findViewById(R.id.imageKostka);
        RadioButton rb1 = findViewById(R.id.radioButton);
        RadioButton rb2 = findViewById(R.id.radioButton2);
        RadioButton rb3 = findViewById(R.id.radioButton3);


        rb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    startAnime(image3);
                }
        });
        rb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnime(image2);
            }
        });
        rb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAnime(imageKostka);
            }
        });
        }



    private void startAnime(ImageView image) {
        Animation out= AnimationUtils.loadAnimation(this,R.anim.animacje);
        image.startAnimation(out);

    }


}