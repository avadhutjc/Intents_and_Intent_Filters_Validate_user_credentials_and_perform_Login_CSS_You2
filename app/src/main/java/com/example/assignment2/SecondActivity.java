package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private Button mbnConfirm;
    private EditText metEmail;
    private EditText metPassword;
    private final String StrPhone = "[0-9]";
    private String emailValidation = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initViews();
        mbnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isValidEmail() && isValidPassword() && isPhoneNo()) {
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    intent.putExtra("User-Mail", metEmail.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }

    private void initViews() {
        metEmail = findViewById(R.id.etEmail);
        metPassword = findViewById(R.id.etPassword);
        EditText metPhone = findViewById(R.id.etPassword);
        EditText metAge = findViewById(R.id.etAge);
        EditText metGender = findViewById(R.id.etGender);
        mbnConfirm = findViewById(R.id.BtnConfirm);
        TextView mtvWelcome = findViewById(R.id.tvWelcome);
    }

    public boolean isValidEmail() {
        if (metEmail.getText().toString().length() > 1 &&
                metEmail.getText().toString().matches(emailValidation)) {
            return true;
        } else {
            metEmail.setError("Invalid Email");
            return false;
        }
    }

    public boolean isValidPassword() {
        if (metPassword.getText().toString().length() > 1) {
            return true;
        } else {
            metPassword.setError("Invalid Password");
            return false;
        }
    }

    public boolean isPhoneNo() {
        if (metPassword.getText().toString().length() > 1) {
            return true;
        } else {
            metPassword.setError("Invalid Password");
            return false;
        }
    }
}