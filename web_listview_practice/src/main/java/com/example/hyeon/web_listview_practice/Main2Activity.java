package com.example.hyeon.web_listview_practice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String[] names = {"LEE", "CHOI", "KIM", "JEONG", "RHO"};
        ListView listView = (ListView) findViewById(R.id.listview);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, names);
        listView.setAdapter(adapter);
    }
}
