package com.example.league.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // To know next time: linear layout

    Button option1;
    Button option2;

    String choiceStatement;
    String opt1;
    String opt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        option1 = findViewById(R.id.option1);
        option2 = findViewById(R.id.option2);
        choiceStatement = getString(R.string.chanceStatement);
        opt1 = getString(R.string.option1);
        opt2 = getString(R.string.option2);


        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //want to do something, argument 1 = context 2 = class
                Intent intent = new Intent(MainActivity.this, Adventure.class);
                startActivity(intent);

                choiceStatement = "You walk into the dark house and begin exploring. When you the end of the hallway you see and a door that looks brand new.";
                opt1 = "Open the door see what's behind it.";
                opt2 = "Leave, someone is obviously still here.";
                option1.setText(opt1);
                option2.setText(opt2);

            }
        });
        option2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                choiceStatement = "You keep walking past the house. Y";
                opt1 = "Open the door see what's behind it.";
                opt2 = "Leave, someone is obviously still here.";
                option1.setText(opt1);
                option2.setText(opt2);

            }

        });
    }
}
