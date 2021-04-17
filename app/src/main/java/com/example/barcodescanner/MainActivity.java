package com.example.barcodescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.barcodescanner.Fragments.HomeFragment;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;

import Utils.CustProgressbar;
import model.loginresponse;
import okhttp3.ResponseBody;
//import retrofit.GetResult;
//import retrofit.GetResult.MyListener;
import retrofit.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity  {

    EditText etLoginEmail,etLoginPassword;
    Button btnLogin;
    TextView txtForgPassword,txtSignUp;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etLoginEmail=(EditText)findViewById(R.id.et_Login_Email);
        etLoginPassword=(EditText)findViewById(R.id.et_Login_Password);
        txtForgPassword=(TextView)findViewById(R.id.txt_Forg_Password);
        txtSignUp=(TextView)findViewById(R.id.txt_Sign_Up);
        btnLogin=(Button)findViewById(R.id.btn_Login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHome();
            }
        });

       txtSignUp.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               goToRegister();
           }
       });
    }

    private void goToRegister() {
        startActivity(new Intent(MainActivity.this,Register.class));
    }

    private void goToHome() {
        startActivity(new Intent(MainActivity.this,bottom_navigation_Activity.class));
    }

//    private void sendOtp() {
//        //Retrofit
////        custProgressbar.ProgressCreate(MainActivity.this);
//
//        HashMap<String, String> detailRequest = new HashMap<>();
//        detailRequest.put("mobile", mobile_number.getText().toString());
//        try {
//            Call<loginresponse> call = RetrofitClient.getInterface().getLogin(detailRequest);
//
//            call.enqueue(new Callback<loginresponse>() {
//                @Override
//                public void onResponse(Call<loginresponse> call, Response<loginresponse> response) {
//                    loginresponse loginResponse= response.body();
//                    Toast.makeText(MainActivity.this,loginResponse.getMessage(),Toast.LENGTH_LONG).show();
//                }
//
//                @Override
//                public void onFailure(Call<loginresponse> call, Throwable t) {
//                     System.out.print(t.getMessage());
//                }
//            });
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
//
//
//    public boolean validation() {
//        if (mobile_number.getText().toString().isEmpty()) {
//            mobile_number.setError("Enter mobile number");
//            return false;
//        }
//        return true;
//    }


}