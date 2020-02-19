package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

public class Todo1Activity extends AppCompatActivity {
         TextView TaskName;
         TextView workdiscription;
         EditText TODO;
         EditText Discription;
         CalendarView calendarView;
         Button AddTask;
         private Object Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo1);
        TaskName = (TextView)findViewById(R.id.tv_taskname);
        workdiscription = (TextView)findViewById(R.id.tv_workdiscription);
        TODO = (EditText) findViewById(R.id.et_TaskName);
        Discription = (EditText) findViewById(R.id.et_Discription);
        calendarView = (CalendarView)findViewById(R.id.calendarView);
        AddTask = (Button)findViewById(R.id.btn_addtask);

         calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

                @Override
                public void onSelectedDayChange(CalendarView view, int year, int month,
                int dayOfMonth) {
                    initScheduleEvent();
                }

             private void initScheduleEvent() {
             }
         });
      new AlertDialog.Builder(Todo1Activity.this)
                    .setTitle("Event Calendar")
         .setMessage("Click to schedule or view events.")
         //.setView(l1)
         .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    //do nothing...yet
                }
            }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int whichButton) {
                    // Do nothing.
                }
            }
    ).show();
      AddTask.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {


          }
      });

        }
}
