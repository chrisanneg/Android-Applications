package com.example.spinneractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TomatoInformation extends AppCompatActivity {
    private Button back;
    private ImageView image;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tomato_information);

        back = findViewById(R.id.back);
        image = findViewById(R.id.tomatoImage);
        info = findViewById(R.id.tomatoInfo);

        image.setImageResource(R.drawable.tomato);
        info.setText(R.string.tomato_info);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TomatoInformation.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}