package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class Todo1Activity extends AppCompatActivity {
    TextView TaskName;
    TextView workdiscription;
    TextView date;
    EditText TODO;
    EditText Discription;
    //CalendarView calendarView;
    Button AddTask;
    Button CalenderPicker;
    private int mYear, mMonth, mDay, mHour, mMinute;
    private View CalendarPicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo1);

        TaskName = (TextView) findViewById(R.id.tv_taskname);
        date = (TextView) findViewById(R.id.date);
        workdiscription = (TextView) findViewById(R.id.tv_workdiscription);
        TODO = (EditText) findViewById(R.id.et_TaskName);
        Discription = (EditText) findViewById(R.id.et_Discription);
        AddTask = (Button) findViewById(R.id.btn_addtask);
        CalenderPicker = (Button) findViewById(R.id.btn_Calendarpicker);


        CalenderPicker.setOnClickListener((View.OnClickListener) this);
    }

              public void onClick(View v) {
            if (v == CalendarPicker) {

                // Get Current Date
                final Calendar c = Calendar.getInstance();
                mYear = c.get(Calendar.YEAR);
                mMonth = c.get(Calendar.MONTH);
                mDay = c.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                        new DatePickerDialog.OnDateSetListener() {

                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {

                                txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }





            }

            }


