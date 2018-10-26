package com.example.league.whackamole;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    //TO DO: end game and spread out moles more 

    Button startButton;
    Button mole1;
    Button mole2;
    Button mole3;
    Button mole4;
    Button mole5;
    Button mole6;

    TextView welcomeMessage;
    TextView scoreDisplay;

    Random rand = new Random();
    int score;
    long delay = 500;
    String scoreChar = "score: ";

    List<Button> moles = new ArrayList<>();

    Timer time = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            final int randMole = rand.nextInt(6);
            int left = rand.nextInt(600);
            int top = rand.nextInt(800);
            final RelativeLayout.LayoutParams p = (RelativeLayout.LayoutParams) moles.get(randMole).getLayoutParams();
            p.setMargins(left, top, 0, 0);
            runOnUiThread(new Runnable() {
                              @Override
                              public void run() {
                                  moles.get(randMole).setLayoutParams(p);
                              }
            });
            Log.d("running", "in run method");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = findViewById(R.id.start);
        mole1 = findViewById(R.id.mole1);
        mole2 = findViewById(R.id.mole2);
        mole3 = findViewById(R.id.mole3);
        mole4 = findViewById(R.id.mole4);
        mole5 = findViewById(R.id.mole5);
        mole6 = findViewById(R.id.mole6);

        welcomeMessage = findViewById(R.id.welcome);
        welcomeMessage.setTextSize(25);
        scoreDisplay = findViewById(R.id.score);
        scoreDisplay.setVisibility(View.GONE);
        scoreDisplay.setText(scoreChar);

        moles.add(mole1);
        moles.add(mole2);
        moles.add(mole3);
        moles.add(mole4);
        moles.add(mole5);
        moles.add(mole6);

        for(Button b: moles){
            b.setVisibility(View.GONE);
        }

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startButton.setVisibility(View.GONE);
                welcomeMessage.setVisibility(View.GONE);
                scoreDisplay.setVisibility(View.VISIBLE);
                for(Button b: moles){
                    b.setVisibility(View.VISIBLE);
                }
                time.schedule(task, delay, 1000);
            }
        });

        mole1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreChar = "score: " + score++;
                scoreDisplay.setText(scoreChar);
                int left = rand.nextInt(600);
                int top = rand.nextInt(800);
                final RelativeLayout.LayoutParams p = (RelativeLayout.LayoutParams) mole1.getLayoutParams();
                p.setMargins(left, top, 0, 0);
                mole1.setLayoutParams(p);
            }
        });

        mole2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreChar = "score: " + score++;
                scoreDisplay.setText(scoreChar);
                int left = rand.nextInt(600);
                int top = rand.nextInt(800);
                final RelativeLayout.LayoutParams p = (RelativeLayout.LayoutParams) mole2.getLayoutParams();
                p.setMargins(left, top, 0, 0);
                mole2.setLayoutParams(p);
            }
        });

        mole3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreChar = "score: " + score++;
                scoreDisplay.setText(scoreChar);
                int left = rand.nextInt(600);
                int top = rand.nextInt(800);
                final RelativeLayout.LayoutParams p = (RelativeLayout.LayoutParams) mole3.getLayoutParams();
                p.setMargins(left, top, 0, 0);
                mole3.setLayoutParams(p);
            }
        });

        mole4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreChar = "score: " + score++;
                scoreDisplay.setText(scoreChar);
                int left = rand.nextInt(600);
                int top = rand.nextInt(800);
                final RelativeLayout.LayoutParams p = (RelativeLayout.LayoutParams) mole4.getLayoutParams();
                p.setMargins(left, top, 0, 0);
                mole4.setLayoutParams(p);
            }
        });

        mole5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreChar = "score: " + score++;
                scoreDisplay.setText(scoreChar);
                int left = rand.nextInt(600);
                int top = rand.nextInt(800);
                final RelativeLayout.LayoutParams p = (RelativeLayout.LayoutParams) mole5.getLayoutParams();
                p.setMargins(left, top, 0, 0);
                mole5.setLayoutParams(p);
            }
        });

        mole6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                scoreChar = "score: " + score++;
                scoreDisplay.setText(scoreChar);
                int left = rand.nextInt(600);
                int top = rand.nextInt(800);
                final RelativeLayout.LayoutParams p = (RelativeLayout.LayoutParams) mole6.getLayoutParams();
                p.setMargins(left, top, 0, 0);
                mole6.setLayoutParams(p);
            }
        });


    }


    }

