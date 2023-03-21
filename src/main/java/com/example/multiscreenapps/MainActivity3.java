package com.example.multiscreenapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent2 = getIntent();
        String name  = intent2.getStringExtra(MainActivity.EXTRA_NAME2);

        textView = findViewById(R.id.textView);
        textView.setText("Congratulations to " + name + " on creating her first app! That's a fantastic accomplishment and a testament to her creativity, hard work, and determination. She should be proud of herself for taking on such a challenging project and seeing it through to completion. I hope her app is a huge success and helps her achieve her goals. Well done!" + name );

    }
}