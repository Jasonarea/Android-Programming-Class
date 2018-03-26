package com.example.hyeon.mobile_programming_class;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Lab1_1 extends AppCompatActivity implements View.OnClickListener {
    ImageView imageView;
    ImageView imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_1);

        // find view by id from xml file.
        imageView = (ImageView)findViewById(R.id.image1);
        imageView2 = (ImageView)findViewById(R.id.image2);
        imageView.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.INVISIBLE);
        Button button = (Button)findViewById(R.id.change);
        button.setText("Change Image");
        button.setOnClickListener(this);    // execute on click listener
    }
    public void onClick(View v) {   // If you click the button the visibility is changed
        if(imageView.getVisibility()==View.VISIBLE) {
            imageView.setVisibility(View.INVISIBLE);
            imageView2.setVisibility(View.VISIBLE);
        }
        else {
            imageView2.setVisibility(View.INVISIBLE);
            imageView.setVisibility(View.VISIBLE);
        }
    }
}
