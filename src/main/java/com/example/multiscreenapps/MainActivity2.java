package com.example.multiscreenapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.EXTRA_NAME);

        textView = findViewById(R.id.textView);
        textView.setText("Congratulations to " + name + " on creating his first app!\nThat is a fantastic achievement and a testament to his hard work and dedication.\nDeveloping an app is no small feat, and it takes a lot of time, effort, and skill to create something that is functional and useful to others.\nI hope that this app is well-received and that he continue to have success in his future endeavors.\nCheers to his accomplishment! " );

    }
}