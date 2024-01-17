package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;



public class Page2 extends AppCompatActivity{
    private Button back;
    private ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        back = findViewById(R.id.back);
        image = findViewById(R.id.info);

        image.setImageResource(R.drawable.info);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Page2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
