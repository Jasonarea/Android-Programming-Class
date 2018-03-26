package com.example.hyeon.mobile_programming_class;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lab1_2 extends AppCompatActivity {
    public EditText edit_name;
    public Button btn_print;
    public Button btn_clear;
    public TextView view_print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_2);

        init(); // initalization function.
    }

    public void init() {    // find view by id (reference)
        edit_name = (EditText)findViewById(R.id.edit_name);
        btn_clear = (Button)findViewById(R.id.btn_clear);
        btn_print = (Button)findViewById(R.id.btn_print);
        view_print =(TextView)findViewById(R.id.view_print);
    }
    public void clearClicked(View v) {  //if you click CLEAR button, the edittext view is cleared
        edit_name.setText("");
    }

    public void printClicked(View v) {  // if you click PRINT button, your name is printed below.
        String text = "";
        view_print.setText(edit_name.getText());
    }
}
