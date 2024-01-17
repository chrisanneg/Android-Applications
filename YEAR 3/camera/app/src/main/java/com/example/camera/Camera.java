package com.example.camera;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Camera extends AppCompatActivity {

ImageView image;
Button photo,video,back;


@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_camera);

    image=findViewById(R.id.image2);
    photo = findViewById(R.id.photoButton);
    video = findViewById(R.id.videoButton);
    back =findViewById(R.id.back2);

    image.setImageResource(R.drawable.camera);
    photo.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent photo_intent=new Intent(Camera.this,PhotoActivity.class);
            startActivity(photo_intent);


        }
    });
    video.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent video_intent = new Intent(Camera.this, VideoActivity.class);
            startActivity(video_intent);

        }
    });

    back.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent back_intent=new Intent(Camera.this,MainActivity.class);
            startActivity(back_intent);
        }
    });
}
}