package com.example.multiscreenapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name;
    public static final String EXTRA_NAME = "mjcet-AI&DS-160421747301";

    public static final String EXTRA_NAME2 = "EVP-2022-MARCH-DIPLOMA-19124CM006";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void openActivity(View v){
        Toast.makeText(this, "Submitted!", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MainActivity2.class);
        name = findViewById(R.id.name);
        String nameText = name.getText().toString();
        intent.putExtra(EXTRA_NAME, nameText);
        startActivity(intent);
    }

    public void newActivityforExample(View v2){
        Toast.makeText(this, "Sumitted 2!", Toast.LENGTH_SHORT).show();
        Intent intent2 = new Intent(this, MainActivity3.class);
        name = findViewById(R.id.name);
        String nameText = name.getText().toString();
        intent2.putExtra(EXTRA_NAME2, nameText);

        startActivity(intent2);

    }




}