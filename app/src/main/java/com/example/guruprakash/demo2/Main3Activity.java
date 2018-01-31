package com.example.guruprakash.demo2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {


    EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        e1=(EditText)findViewById(R.id.EditText1);
        Intent i2=getIntent();
        String s1=i2.getStringExtra("code");
        e1.setText(s1);
    }
}
