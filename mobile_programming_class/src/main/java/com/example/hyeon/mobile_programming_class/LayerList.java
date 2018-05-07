package com.example.hyeon.mobile_programming_class;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;

public class LayerList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layer_list);

        ImageButton button = (ImageButton)findViewById(R.id.button);
        TransitionDrawable drawable = (TransitionDrawable)button.getDrawable();
        drawable.startTransition(5000);
    }
}
