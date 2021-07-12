package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {
private TextView mtvEmailName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        mtvEmailName=findViewById(R.id.tvEmailName);

        Intent intent = getIntent();
        String userName = intent.getStringExtra("User-Mail");
        mtvEmailName.setText(userName);
    }
}