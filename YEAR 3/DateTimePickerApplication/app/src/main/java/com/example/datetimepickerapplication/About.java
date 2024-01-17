package com.example.datetimepickerapplication;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class About extends AppCompatActivity {
    TextView aboutitle;
 ImageView hallimg;
    TextView description;

    ConstraintLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        aboutitle = findViewById(R.id.activityTitle);
        hallimg = findViewById(R.id.img);
        hallimg.setImageResource(R.drawable.receptionist);
        description = findViewById(R.id.desc);
        mainLayout = findViewById(R.id.mainlayout);

        mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lay = new Intent(About.this, MainActivity.class);
                startActivity(lay);
            }
        });


    }

}
