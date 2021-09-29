package com.example.a2_firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button enterButton;
    EditText firstName, lastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterButton = (Button) findViewById(R.id.button1);
        firstName = (EditText) findViewById(R.id.editText1);
        lastName = (EditText) findViewById(R.id.editText2);

        enterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strFirst = firstName.getText().toString();
                String strLast = lastName.getText().toString();


                Intent intent = new Intent(getApplicationContext(), activity2.class);
                intent.putExtra("firstName", strFirst);
                intent.putExtra("lastName", strLast);

                startActivity(intent);
            }
        });
    }
}