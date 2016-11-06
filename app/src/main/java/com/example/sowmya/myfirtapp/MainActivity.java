package com.example.sowmya.myfirtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Decleration
    EditText editTextFirst, editTextSecond;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);// Memory created for the activity , makes a call to child class and blank screen
        setContentView(R.layout.activity_main);//layout added to blank. R- Resource. xml file call

        //Initialization
        editTextFirst= (EditText) findViewById(R.id.edit_text_first_number);
        editTextSecond= (EditText) findViewById(R.id.edit_text_second_number);
        textViewResult = (TextView) findViewById(R.id.textView_Result);


    }

    public void onClickButton(View view) {
        //Take the value from the edit text and convert into integer
        int x =Integer.parseInt(editTextFirst.getText().toString());
        int y= Integer.parseInt(editTextSecond.getText().toString());

        //calculate the result
        int result=x+y;

        textViewResult.setText(""+result);


    }
}
