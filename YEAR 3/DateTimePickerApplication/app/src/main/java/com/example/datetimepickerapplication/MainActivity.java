package com.example.datetimepickerapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.TimeFormat;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    TextView date, time;
    Button datePickerButton, timePickerButton, confirmButton;
    String setDate, setTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.img);
        img.setImageResource(R.drawable.event1);

        date = findViewById(R.id.date);
        time = findViewById(R.id.desc);

        datePickerButton = findViewById(R.id.datePickerButton);
        timePickerButton = findViewById(R.id.timePickerButton);
        confirmButton = findViewById(R.id.homebtn);

        // Date Picker

        datePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // You can check all the methods by just typing a dot "." after the datePicker() part
                MaterialDatePicker<Long> materialDatePicker = MaterialDatePicker.Builder.datePicker()
                        .setTitleText("Select Date")
                        .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                        .build();
                materialDatePicker.addOnPositiveButtonClickListener(new MaterialPickerOnPositiveButtonClickListener<Long>() {
                    @Override
                    public void onPositiveButtonClick(Long selection) { // Type "new" within the Round Brackets for this function
                        setDate = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault()).format(new Date(selection));
                        date.setText(setDate);
                    }
                });
                // Displays the Date Picker as a Dialog Fragment
                materialDatePicker.show(getSupportFragmentManager(), "tag");
            }
        });

        // Time Picker
        timePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // You can check all the methods by just typing a dot "." after the Builder() part
                MaterialTimePicker timePicker = new MaterialTimePicker.Builder()
                        .setTimeFormat(TimeFormat.CLOCK_12H)
                        .setHour(12)
                        .setMinute(0)
                        .setInputMode(MaterialTimePicker.INPUT_MODE_CLOCK)
                        .setTitleText("Select Time")
                        .build();
                timePicker.addOnPositiveButtonClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // Every selection in the Time Picker needs to be set in the current
                        // locale (Time Zone) before being fetched and converted to a String
                        setTime = MessageFormat.format("{0}:{1}",
                                String.format(Locale.getDefault(), "%02d", timePicker.getHour()),
                                String.format(Locale.getDefault(), "%02d", timePicker.getHour()));
                        time.setText(setTime);
                    }
                });
                // Displays the Time Picker as a Dialog Fragment
                timePicker.show(getSupportFragmentManager(), "tag");
            }
        });

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // We are adding (key, value) pairs to this intent
                // which can be retrieved as a bundle in the activity we
                // will be navigating to (i.e. ConfirmationActivity.class)
                Intent i = new Intent(MainActivity.this, ConfirmationActivity.class);
                i.putExtra("date", setDate);
                i.putExtra("time", setTime);
                startActivity(i);
            }
        });
    }
}