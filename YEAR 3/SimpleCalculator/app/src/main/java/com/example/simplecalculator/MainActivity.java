package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText e1, e2;
    float val1, val2;
    TextView result;

    public boolean fetchNumbers() {
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
        result = (TextView) findViewById(R.id.result);

        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();

        if(s1.equals("Please enter value 1") && s2.equals(null))
        {
            String result = "Please enter value 2";
            e2.setText(result);
            return false;
        }

        if(s1.equals(null) && s2.equals("Please enter value 2"))
        {
            String result = "Please enter value 1";
            e1.setText(result);
            return false;
        }

        if(s1.equals("Please enter value 1") || s2.equals("Please enter value 2"))
        {
            return false;
        }

        if((!s1.equals(null) && s2.equals(null))|| (!s1.equals("") && s2.equals("")))
        {
            String result = "Please enter value 2";
            e2.setText(result);
            return false;
        }

        if((s1.equals(null) && !s2.equals(null))|| (s1.equals("") && !s2.equals("")))
        {
            String result = "Please enter value 1";
            e1.setText(result);
            return false;
        }

        if((s1.equals(null) && s2.equals(null))|| (s1.equals("") && s2.equals("")))
        {
            String result1 = "Please enter value 1";
            e1.setText(result1);
            String result2 = "Please enter value 2";
            e2.setText(result2);
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
        e1.getText().clear();
    }

    public void clearTextNum2(View v)
    {
        e2.getText().clear();
    }

    public void addition(View v)
    {
        if (fetchNumbers())
        {
            float add = val1 + val2;
            result.setText(Float.toString(add));
        }
    }

    public void subtraction(View v)
    {
        if (fetchNumbers()) {
            float sub = val1 - val2;
            result.setText(Float.toString(sub));
        }
    }

    public void multiplication(View v)
    {
        if (fetchNumbers()) {
            float mul = val1 * val2;
            result.setText(Float.toString(mul));
        }
    }

    public void division(View v)
    {
        if (fetchNumbers()) {
            float div = val1 / val2;
            result.setText(Float.toString(div));
        }
    }

    public void power(View v)
    {
        if (fetchNumbers()) {
            double sum = Math.pow(val1, val2);
            result.setText(Double.toString(sum));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.num1);
        e2 = (EditText) findViewById(R.id.num2);
    }
}