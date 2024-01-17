package com.example.m2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView appTitle;
    private ImageView idimg;
    private EditText nameinput,classinput;
    private Button proceed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appTitle = findViewById(R.id.activityTitle);
        idimg = findViewById(R.id.img);
        idimg.setImageResource(R.drawable.idcard);
        nameinput = findViewById(R.id.nameinput);
        classinput = findViewById(R.id.classinput);
        proceed = findViewById(R.id.proceedbtn);

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Camera.class);
                startActivity(i);
            }
        });



    }
}