package com.example.chandrayan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class Chandu1info extends AppCompatActivity {
    private Button back;
    private Button next;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        back = findViewById(R.id.backbtn);
        next = findViewById(R.id.nextbtn);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_intent = new Intent(Chandu1info.this, MainActivity.class);
                startActivity(back_intent);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next_intent = new Intent(Chandu1info.this, Chandu2info.class);
                startActivity(next_intent);
            }
        });
    }
}
