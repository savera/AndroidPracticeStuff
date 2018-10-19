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

    Button startButton;
    Button mole1;
    Button mole2;
    Button mole3;
    Button mole4;
    Button mole5;
    Button mole6;

    TextView welcomeMessage;

    Random rand = new Random();
    int score;
    long delay = 2000;

    List<Button> moles = new ArrayList<>();

    Timer time = new Timer();
    TimerTask task = new TimerTask() {
        @Override
        public void run() {
            //NOT WORKING --> Crashing --> TO FIX
            int randMole = rand.nextInt(6);
            int left = rand.nextInt(200);
            int top = rand.nextInt(200);
            int right = rand.nextInt(200);
            int bottom = rand.nextInt(200);
            RelativeLayout.LayoutParams p = (RelativeLayout.LayoutParams) moles.get(randMole).getLayoutParams();
            p.setMargins(left, top, right, bottom);
            moles.get(randMole).setLayoutParams(p);
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
                for(Button b: moles){
                    b.setVisibility(View.VISIBLE);
                }
                time.schedule(task, delay);
            }
        });

        mole1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mole1.setVisibility(View.GONE);
                score++;
            }
        });

        mole2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mole2.setVisibility(View.GONE);
                score++;
            }
        });

        mole3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mole3.setVisibility(View.GONE);
                score++;
            }
        });

        mole4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mole4.setVisibility(View.GONE);
                score++;
            }
        });

        mole5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mole5.setVisibility(View.GONE);
                score++;
            }
        });

        mole6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mole6.setVisibility(View.GONE);
                score++;
            }
        });


    }


    }

