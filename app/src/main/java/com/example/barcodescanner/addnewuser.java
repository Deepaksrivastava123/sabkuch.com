package com.example.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class addnewuser extends AppCompatActivity {

    EditText firstname,lastname,email;
    Button adduserbtn,cancelbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnewuser);

        firstname=(EditText)findViewById(R.id.First_name);
        lastname=(EditText)findViewById(R.id.Last_name);
        email=(EditText)findViewById(R.id.email_ed);
        adduserbtn=(Button)findViewById(R.id.add_user_btn);
        cancelbtn=(Button)findViewById(R.id.cancel_btn);
    }
}