package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Third extends AppCompatActivity {
        RadioButton r1,r2,r3,r4;
    Button b1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        b1=(Button) findViewById(R.id.button3);
        r1=(RadioButton) findViewById(R.id.radioButton6);
        r2=(RadioButton) findViewById(R.id.radioButton7);
        r3=(RadioButton) findViewById(R.id.radioButton8);
        r4=(RadioButton) findViewById(R.id.radioButton9);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r4.isChecked())
                {
                    Second.score++;
                    Intent i=new Intent( Third.this,Four.class);
                    startActivity(i);
                    finish();
                }
                else {
                    Second.score--;
                    Intent i=new Intent( Third.this,Four.class);
                    startActivity(i);
                    finish();
                }
            }

        }); r3=(RadioButton) findViewById(R.id.radioButton8);

    }
}