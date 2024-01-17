package com.example.spinneractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class PotatoInformation extends AppCompatActivity {
    private Button back;
    private ImageView image;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potato_information);

        back = findViewById(R.id.back);
        image = findViewById(R.id.potatoImage);
        info = findViewById(R.id.potatoInfo);

        image.setImageResource(R.drawable.potato);
        info.setText(R.string.potato_info);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PotatoInformation.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}