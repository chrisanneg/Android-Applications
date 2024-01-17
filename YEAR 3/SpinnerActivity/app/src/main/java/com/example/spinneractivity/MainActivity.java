package com.example.spinneractivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        image = findViewById(R.id.image);

        String[] crop = {
                "Select a Crop",
                "Rice",
                "Corn",
                "Tomato",
                "Potato",
        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, crop);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        image.setImageResource(android.R.color.transparent);
                        break;
                    case 1:
                        image.setImageResource(R.drawable.rice);
                        Intent rice_intent = new Intent(MainActivity.this, RiceInformation.class);
                        startActivity(rice_intent);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.corn);
                        Intent corn_intent = new Intent(MainActivity.this, CornInformation.class);
                        startActivity(corn_intent);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.tomato);
                        Intent tomato_intent = new Intent(MainActivity.this, TomatoInformation.class);
                        startActivity(tomato_intent);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.potato);
                        Intent potato_intent = new Intent(MainActivity.this, PotatoInformation.class);
                        // USUAL WAY FOR STARTING AN ACTIVITY - startActivity(bingus_intent);
                        new Handler().postDelayed(() -> startActivity(potato_intent), 1000); // ADDED TO INTRODUCE DELAY AFTER SELECTION
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                // DO ABSOLUTELY NOTHING WHEN NOTHING IS SELECTED
            }
        });


    }
}