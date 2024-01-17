package com.example.convertor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public EditText t,s;
    private Button next;
    float val1, val2;
    TextView result1,result2;

    public boolean fetchNumbers() {
        t = (EditText) findViewById(R.id.num1);

        s = (EditText) findViewById(R.id.num2);
        result1 = (TextView) findViewById(R.id.result1);
        result2 = (TextView) findViewById(R.id.result2);

        String s1 = t.getText().toString();
        String s2 = s.getText().toString();

        if(s1.equals("Please enter speed") && s2.equals(null))
        {
            String result = "Please enter time";
            s.setText(result);
            return false;
        }

        if(s1.equals(null) && s2.equals("Please enter time"))
        {
            String result = "Please enter speed";
            t.setText(result);
            return false;
        }

        if(s1.equals("Please enter speed") || s2.equals("Please enter time"))
        {
            return false;
        }


        else {
            val1 = Float.parseFloat(s1);
            val2 = Float.parseFloat(s2);
        }

        return true;
    }

    public void clearTextNum1(View v)
    {
        t.getText().clear();
    }

    public void clearTextNum2(View v)
    {
        s.getText().clear();
    }

    public void speed(View v)
    {
        if (fetchNumbers())
        {
            double sp = val1 * 0.28;
            result1.setText(Double.toString(sp )+"m/s");
        }
    }

    public void time(View v)
    {
        if (fetchNumbers()) {
            float ti = (val2 * 60) ;
            result2.setText(Float.toString(ti )+"seconds");
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = findViewById(R.id.next);
        t = (EditText) findViewById(R.id.num1);
        s = (EditText) findViewById(R.id.num2);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Page2.class);
                startActivity(intent);
            }
        });
    }
}




