package com.example.hyeon.mobile_programming_class;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Animation extends AppCompatActivity {
    ImageView imageView1;
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                android.view.animation.Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
                imageView1.startAnimation(anim);
                editText.append("애니메이션시작됨.\n");
            }
        });
    }
}
