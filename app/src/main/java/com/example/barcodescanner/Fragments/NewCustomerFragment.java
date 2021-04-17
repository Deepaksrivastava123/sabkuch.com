package com.example.barcodescanner.Fragments;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.barcodescanner.R;
import com.example.barcodescanner.VerifyOtp;
import com.example.barcodescanner.addnewuser;

import java.util.HashMap;

import model.loginresponse;
import retrofit.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NewCustomerFragment extends Fragment {
// EditText addmobilenumber,firstname,lastname,email;
// Button addsendotpbtn,adduserbtn,cancelbtn;
    EditText mobileNumber;
    Button addsendotpbtn;

    public NewCustomerFragment() {
        // Required empty public constructor
    }



       @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View v=inflater.inflate(R.layout.fragment_new_customer, container, false);
            mobileNumber=v.findViewById(R.id.add_Mobile_Number);
//            firstname=v.findViewById(R.id.First_name);
//            lastname=v.findViewById(R.id.Last_name);
//            email=v.findViewById(R.id.email_ed);
            addsendotpbtn=v.findViewById(R.id.add_send_otp_btn);
//            adduserbtn=v.findViewById(R.id.add_user_btn);
//            cancelbtn=v.findViewById(R.id.cancel_btn);

           addsendotpbtn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   if(validation()){
                       sendOtp();
                   }
               }
           });
            return v;

    }

    private boolean validation() {
        if (mobileNumber.getText().toString().isEmpty()) {
            mobileNumber.setError("Enter mobile number");
            return false;
        }
        return true;
    }

    private void sendOtp() {
        //Retrofit code
        HashMap<String,String> hm=new HashMap<>();
        hm.put("mobile",mobileNumber.getText().toString());
        try {
            Call<loginresponse>call=RetrofitClient.getInterface().getLogin(hm);
            call.enqueue(new Callback<loginresponse>() {
                @Override
                public void onResponse(Call<loginresponse> call, Response<loginresponse> response) {
                    loginresponse loginResponse=response.body();
                    Toast.makeText(getActivity(),loginResponse.getMessage(),Toast.LENGTH_LONG).show();
                    String id=loginResponse.getUser().getId();
                    Intent intent=new Intent(getActivity(),VerifyOtp.class);
                    intent.putExtra("key",id);
                    startActivity(intent);

                    mobileNumber.setText("");
                }

                @Override
                public void onFailure(Call<loginresponse> call, Throwable t) {
                    Toast.makeText(getActivity(),t.getMessage(),Toast.LENGTH_LONG).show();
                }
            });

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}