package com.example.spinneractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class RiceInformation extends AppCompatActivity {
    private Button back;
    private ImageView image;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rice_information);

        back = findViewById(R.id.back);
        image = findViewById(R.id.riceImage);
        info = findViewById(R.id.riceInfo);

        image.setImageResource(R.drawable.rice);
        info.setText(R.string.rice_info);




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RiceInformation.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}