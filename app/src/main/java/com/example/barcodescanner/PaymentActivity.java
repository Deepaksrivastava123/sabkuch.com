package com.example.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PaymentActivity extends AppCompatActivity {

    RadioButton rbcod,rbdebitcard,rbupi;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        rbcod=findViewById(R.id.rb_cod);
        rbdebitcard=findViewById(R.id.rb_debit_card);
        rbupi=findViewById(R.id.rb_upi);
        radioGroup= findViewById(R.id.radiogrp);


    }
}