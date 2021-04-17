package com.example.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    EditText etUsername,etEmail,etPassword;
    TextView txtSignin;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        etUsername=(EditText)findViewById(R.id.et_Username);
        etEmail=(EditText)findViewById(R.id.et_Register_Email);
        etPassword=(EditText)findViewById(R.id.et_Register_Password);
        txtSignin=(TextView)findViewById(R.id.txt_Signin);
        btnRegister=(Button)findViewById(R.id.btn_Register);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                register();
            }
        });
        txtSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToLogin();
            }
        });
    }

    private void backToLogin() {
        startActivity(new Intent(Register.this,MainActivity.class));
    }

    private void register() {
    }
}