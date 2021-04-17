package com.example.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

import model.verifyotpresponse;
import retrofit.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class VerifyOtp extends AppCompatActivity {

    EditText etVerifyOtp;
    Button btnVerifyOtp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_otp);
        //receive data from fragment



        etVerifyOtp=(EditText)findViewById(R.id.et_Verify_Otp);
        btnVerifyOtp=(Button)findViewById(R.id.btn_Verify_Otp);

        btnVerifyOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Validation()){
                    verifyOtp();
                }
            }
        });
    }

    private void verifyOtp() {
        Intent intent=getIntent();
        final String id=intent.getStringExtra("key");
        //Retrofit code
        HashMap<String,String>sendOtpCode=new HashMap<>();
        sendOtpCode.put("id",id);
        sendOtpCode.put("otpCode",etVerifyOtp.getText().toString());
        try {
            Call<verifyotpresponse>call= RetrofitClient.getInterface().getVerifyOtp(sendOtpCode);
            call.enqueue(new Callback<verifyotpresponse>() {
                @Override
                public void onResponse(Call<verifyotpresponse> call, Response<verifyotpresponse> response) {
                    verifyotpresponse verifyOtpResponse=response.body();
                    Toast.makeText(VerifyOtp.this,verifyOtpResponse.getMessage(),Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(VerifyOtp.this,newCustomerDetails.class);
                    intent.putExtra("key",id);
                    startActivity(intent);
                    etVerifyOtp.setText("");
                }

                @Override
                public void onFailure(Call<verifyotpresponse> call, Throwable t) {
                    Toast.makeText(VerifyOtp.this,t.getMessage(),Toast.LENGTH_SHORT).show();

                }
            });
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private boolean Validation() {
        if (etVerifyOtp.getText().toString().isEmpty()) {
            etVerifyOtp.setError("Enter Otp");
            return false;
        }
        return true;
    }
}