package com.example.lab4;



import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import android.widget.Toast;
public class ElevenID extends AppCompatActivity {
    private TextView title;
    private Button back;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        title = findViewById(R.id.text1_name);

        listView = findViewById(R.id.list_view);
        back = findViewById(R.id.backBtn);

        String[] item_title = new String[]{"Age:Im guessing 11 lol  idk",
                "Known as 11 or El or Baldy", "Nose sometimes bleeds", "Bald:Yes",
                "Killcount: 100+", "Weapon: herself", "If possible shoot on sight", "Reward: $8000"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, item_title);
        listView.setAdapter(adapter);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ElevenID.this, MainActivity.class);
                startActivity(intent);
            }
        });
//EXTRA
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String clicked_item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),"Clicked "+clicked_item,Toast.LENGTH_LONG).show();
            }
        });
    }
}

