package com.example.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.example.barcodescanner.Fragments.HomeFragment;

import model.verifyotpresponse;
import retrofit.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class otp_screen extends AppCompatActivity {

    EditText verifyotpscreen;
    Button otploginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_screen);

        verifyotpscreen=(EditText)findViewById(R.id.verify_otp_screen);
        otploginbtn=(Button)findViewById(R.id.otp_login_btn);

        otploginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });
    }

    private void login() {
        String userOtp=verifyotpscreen.getText().toString();

        if (userOtp.isEmpty()){
            verifyotpscreen.requestFocus();
            verifyotpscreen.setError("Please enter your otp");
            return;
        }
       // Call<verifyotpresponse>call= RetrofitClient.getInstance().getApi().verifyotp(userOtp);
        //call.enqueue(new Callback<verifyotpresponse>() {
          //  @Override
            //public void onResponse(Call<verifyotpresponse> call, Response<verifyotpresponse> response) {
              //  verifyotpresponse verifyotpresponse=response.body();

                //if(response.isSuccessful()){
                    Intent intent=new Intent(otp_screen.this, HomeFragment.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    startActivity(intent);
                  //  Toast.makeText(otp_screen.this,verifyotpresponse.getMessage(),Toast.LENGTH_LONG).show();
                }
            //}

            //@Override
            public void onFailure(Call<verifyotpresponse> call, Throwable t) {
                Toast.makeText(otp_screen.this,t.getMessage(),Toast.LENGTH_LONG).show();
            }
        //});
    }
//}