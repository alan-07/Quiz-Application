package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Four extends AppCompatActivity {
    RadioButton r1,r2,r3,r4;
    Button b1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        b1=(Button) findViewById(R.id.button4);
        r1=(RadioButton) findViewById(R.id.radioButton10);
        r2=(RadioButton) findViewById(R.id.radioButton11);
        r3=(RadioButton) findViewById(R.id.radioButton12);
        r4=(RadioButton) findViewById(R.id.radioButton13);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r4.isChecked())
                {
                    Second.score++;
                    Intent i=new Intent( Four .this,Five.class);
                    startActivity(i);
                    finish();
                }
                else {
                    Second.score--;
                    Intent i=new Intent( Four.this,Five.class);
                    startActivity(i);
                    finish();
                }
            }

        });

    }
}