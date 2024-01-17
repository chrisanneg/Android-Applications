package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView home_toggleText;
    ImageView home_image;
    AirmodeReciever ob = new AirmodeReciever(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home_toggleText = findViewById(R.id.home_txt);
        home_image = findViewById(R.id.home_img);
        MediaManager(false);
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(ob, filter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(ob);
    }

    // to update homepage image and text whenever Airplane mode is toggled
    void MediaManager(boolean isAirplaneModeOn) {
        if (isAirplaneModeOn) {
            home_toggleText.setText("Purge Mode On");
            home_toggleText.setBackgroundColor(ContextCompat.getColor(this, R.color.piper_teal));
            home_image.setImageResource(R.drawable.purge);
        } else {
            home_toggleText.setText("Purge Mode Off.");
            home_toggleText.setBackgroundColor(ContextCompat.getColor(this, R.color.piper_red));
            home_image.setImageResource(R.drawable.nopurge);
        }
    }
}