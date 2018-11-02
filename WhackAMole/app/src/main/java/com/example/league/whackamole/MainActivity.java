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

    //TO DO: restart button not working

    Button startButton;
    Button mole1;
    Button mole2;
    Button mole3;
    Button mole4;
    Button mole5;
    Button mole6;
    Button playAgain;

    TextView welcomeMessage;
    TextView scoreDisplay;
    TextView endMessage;
    TextView finalScoreDisplay;

    int score;
    long delay = 500;
    String scoreChar = "score: ";
    Random rand = new Random();

    List<Button> moles = new ArrayList<>();

    Timer timeToRandom = new Timer();
    Timer timeToEndGame = new Timer();

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

    TimerTask taskEnd = new TimerTask() {
        @Override
        public void run() {
            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    for (Button b : moles) {
                        b.setVisibility(View.GONE);
                    }
                    scoreDisplay.setVisibility(View.GONE);
                    endMessage.setVisibility(View.VISIBLE);
                    finalScoreDisplay.setText("Your final score was... " + score);
                    finalScoreDisplay.setVisibility(View.VISIBLE);
                    playAgain.setVisibility(View.VISIBLE);
                    playAgain.setOnClickListener(new View.OnClickListener() {

                        @Override
                        public void onClick(View view) {
                            starting();
                            clickingMole();
                        }
                    });
                }
            });

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
        playAgain = findViewById(R.id.playAgain);
        playAgain.setVisibility(View.GONE);

        welcomeMessage = findViewById(R.id.welcome);
        welcomeMessage.setTextSize(25);
        scoreDisplay = findViewById(R.id.score);
        scoreDisplay.setVisibility(View.GONE);
        scoreDisplay.setText(scoreChar);
        endMessage = findViewById(R.id.endGame);
        endMessage.setTextSize(25);
        endMessage.setVisibility(View.GONE);
        finalScoreDisplay = findViewById(R.id.finalScore);
        finalScoreDisplay.setVisibility(View.GONE);

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
                starting();
            }
        });

        clickingMole();

    }

    protected void starting(){

        startButton.setVisibility(View.GONE);
        welcomeMessage.setVisibility(View.GONE);
        scoreDisplay.setVisibility(View.VISIBLE);
        for(Button b: moles){
            b.setVisibility(View.VISIBLE);
        }
        timeToRandom.schedule(task, delay, 1000);
        timeToEndGame.schedule(taskEnd, 10000);

    }

protected void clickingMole(){

        mole1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            scoreChar = getString(R.string.score, score++);
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
            scoreChar = getString(R.string.score, score++);
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
            scoreChar = getString(R.string.score, score++);
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
            scoreChar = getString(R.string.score, score++);
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
            scoreChar = getString(R.string.score, score++);
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
            scoreChar = getString(R.string.score, score++);
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

