package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Five extends AppCompatActivity {
    TextView t1;
    Button b1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        b1=(Button) findViewById(R.id.button5);
        t1=(TextView) findViewById(R.id.textView5);
        t1.setText("Your Score "+Second.score);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Five.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}