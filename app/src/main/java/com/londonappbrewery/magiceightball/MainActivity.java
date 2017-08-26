package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button askButton = (Button)findViewById(R.id.askButton);
        final ImageView imageDisplay = (ImageView) findViewById(R.id.iamge_eigthball);
        final Random r = new Random();
        final int[] imageArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };



        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 imageDisplay.setImageResource(imageArray[r.nextInt(5)]);
            }
        });
    }
}
