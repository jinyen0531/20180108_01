package com.yenyu.a20180108_01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView act,act2;
    ArrayList data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        act = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        act2 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView2);
        String [] str= {"acc","aab","aag","bbr","bbt","ccc"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,str);
        act.setThreshold(1); //設定打幾個字就會顯示提示
        act.setAdapter(adapter);

    }
}
