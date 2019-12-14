package com.example.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {
    EditText etName, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        etName = (EditText) findViewById(R.id.etName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
    }

    public void login(View view) {
        int counter = 3;

        if (etName.getText().toString().equals("user") && etPassword.getText().toString().equals("user")) {
            startActivity(new Intent(LoginActivity.this, MainActivity.class));

        } else {
            Toast.makeText(this, "Incorrect Credentials", Toast.LENGTH_SHORT).show();
            counter--;

            if(counter == 0) {
                btnLogin.setClickable(false);
            }
        }
    }
}
