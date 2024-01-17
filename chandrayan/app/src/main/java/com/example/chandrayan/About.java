package com.example.chandrayan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class About extends AppCompatActivity {
    private Button home;
     private ImageView image;
    private TextView info;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        info = findViewById(R.id.aboutInfo);
        info.setText(R.string.about_info);

        home = findViewById(R.id.backbtn);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back_intent = new Intent(About.this, MainActivity.class);
                startActivity(back_intent);





    }
});
    }
}
