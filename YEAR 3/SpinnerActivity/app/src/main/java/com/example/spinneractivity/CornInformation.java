package com.example.spinneractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CornInformation extends AppCompatActivity {
    private Button back;
    private ImageView image;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corn_information);

        back = findViewById(R.id.back);
        image = findViewById(R.id.cornImage);
        info = findViewById(R.id.cornInfo);

        image.setImageResource(R.drawable.corn);
        info.setText(R.string.corn_info);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CornInformation.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}