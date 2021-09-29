package com.example.a2_firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    Button aboutButton, pupButton;
    TextView firstName, lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        aboutButton = (Button) findViewById(R.id.button2);
        pupButton = (Button) findViewById(R.id.button3);

        firstName = (TextView)findViewById(R.id.textView4);
        lastName = (TextView)findViewById(R.id.textView5);

        Intent intent = getIntent();

        String strFirst = intent.getStringExtra("firstName");
        String strLast = intent.getStringExtra("lastName");

        firstName.setText(strFirst);
        lastName.setText(strLast);

        aboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), activity3.class);
                startActivity(intent);
            }
        });

        pupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), activity4.class);
                startActivity(intent);
            }
        });

    }
}