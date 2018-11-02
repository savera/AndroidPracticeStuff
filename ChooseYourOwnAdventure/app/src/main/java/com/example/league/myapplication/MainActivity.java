package com.example.league.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // To know next time: linear layout

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.start);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //want to do something, argument 1 = context 2 = class
                Intent intent = new Intent(MainActivity.this, Adventure.class);
                startActivity(intent);
            }
        });
    }
}
