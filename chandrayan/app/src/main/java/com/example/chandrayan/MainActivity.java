package com.example.chandrayan;

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

        String[] option = {
                "Select option",
                "Image 1",
                "Image 2",
                "Image 3",
                "Image 4",
                "About",

        };

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,option);
        spinner.setAdapter(adapter);



        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:

                        break;
                    case 1:
                        image.setImageResource(R.drawable.chandu1);
                        Intent chandu1_intent = new Intent(MainActivity.this, Chandu1info.class);
                        startActivity(chandu1_intent);
                        break;
                    case 2:
                        image.setImageResource(R.drawable.chandu2);
                        Intent chandu2_intent = new Intent(MainActivity.this, Chandu2info.class);
                        startActivity(chandu2_intent);
                        break;
                    case 3:
                        image.setImageResource(R.drawable.chandu3);
                        Intent chandu3_intent = new Intent(MainActivity.this, Chandu3info.class);
                        startActivity(chandu3_intent);
                        break;
                    case 4:
                        image.setImageResource(R.drawable.chandu4);
                        Intent chandu4_intent = new Intent(MainActivity.this, Chandu4info.class);
                        startActivity(chandu4_intent);
                        break;

                    case 5:

                        Intent about_intent = new Intent(MainActivity.this, About.class);
                        startActivity(about_intent);
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





