package com.example.datetimepickerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfirmationActivity extends AppCompatActivity {
    Button back,about;
    TextView dateAndTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        dateAndTime = findViewById(R.id.dateAndTime);
        back = findViewById(R.id.back);
        about = findViewById(R.id.aboutbtn);

        // Retrieving a bundle, basically all messages sent
        // By the Calling Activity (i.e. MainActivity.class)
        Bundle bundle = getIntent().getExtras();
        String date = bundle.getString("date");
        String time = bundle.getString("time");

        dateAndTime.setText(date + " " + time);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ConfirmationActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abt = new Intent(ConfirmationActivity.this,About.class);
                startActivity(abt);
            }
        });
    }
}