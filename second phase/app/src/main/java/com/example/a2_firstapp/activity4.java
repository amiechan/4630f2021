[[package com.example.a2_firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class activity4 extends AppCompatActivity {

    Button picButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        picButton = (Button) findViewById(R.id.button4);

        Intent intent = getIntent();

        picButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), activity5.class);
                startActivity(intent);
            }
        });
    }
}