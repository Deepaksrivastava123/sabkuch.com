package com.example.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

import model.registerResponse;
import retrofit.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class newCustomerDetails extends AppCompatActivity {
    EditText etFirstName,etLastName,etEmail;
    Button btnAdd,btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_customer_details);
        etFirstName=(EditText)findViewById(R.id.et_FirstName);
        etLastName=(EditText)findViewById(R.id.et_LastName);
        etEmail=(EditText)findViewById(R.id.et_Email);
        btnAdd=(Button)findViewById(R.id.btn_Add);
        btnCancel=(Button)findViewById(R.id.btn_Cancel);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Validation()){
                    custAddedSuccessfully();
                }
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHome();
            }
        });
    }

    private void goToHome() {
    }


    private void custAddedSuccessfully() {
        //Retrofit Code
        String id=getIntent().getStringExtra("key");
        HashMap<String,String>sendDetails= new HashMap<>();
        sendDetails.put("id",id);
        sendDetails.put("firstName",etFirstName.getText().toString());
        sendDetails.put("lastName",etLastName.getText().toString());
        sendDetails.put("email",etEmail.getText().toString());
        try {
            Call<registerResponse>call= RetrofitClient.getInterface().getRegister(sendDetails);
            call.enqueue(new Callback<registerResponse>() {
                @Override
                public void onResponse(Call<registerResponse> call, Response<registerResponse> response) {
                    registerResponse res=response.body();
                    Toast.makeText(newCustomerDetails.this,res.getMessage(),Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onFailure(Call<registerResponse> call, Throwable t) {
                     Toast.makeText(newCustomerDetails.this,t.getMessage(),Toast.LENGTH_SHORT).show();
                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private boolean Validation() {
        if (etFirstName.getText().toString().isEmpty()) {
            etFirstName.setError("Enter Firstname");
            return false;
        }
        if (etLastName.getText().toString().isEmpty()) {
            etLastName.setError("Enter Lastname");
            return false;
        }
        return true;
    }
}