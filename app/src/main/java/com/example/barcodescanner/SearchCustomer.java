package com.example.barcodescanner;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;

public class SearchCustomer extends AppCompatActivity {
    Button btnSearch,btnselectcustomer,btnaddcustomer,btnpaynow;
   // SearchView searchview;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_customer);
        //serachview=(SearchView)findViewById(R.id.searchView);
        btnSearch=(Button) findViewById(R.id.Search_btn);
        btnselectcustomer=(Button) findViewById(R.id.select_Customer_btn);
        btnaddcustomer=(Button) findViewById(R.id.add_customer_btn);
        btnpaynow=(Button) findViewById(R.id.pay_Now_btn);
        textview=(TextView)findViewById(R.id.textView);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnselectcustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnaddcustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNewCustomer();
            }
        });
        btnpaynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SearchCustomer.this,PaymentActivity.class);
                startActivity(intent);

            }
        });
    }

    private void addNewCustomer() {
        final AlertDialog.Builder alert=new AlertDialog.Builder(SearchCustomer.this);
        View mView=getLayoutInflater().inflate(R.layout.activity_addnewuser,null);
        final EditText txt_firstname=(EditText)mView.findViewById(R.id.First_name);
        final EditText txt_lastname=(EditText)mView.findViewById(R.id.Last_name);
        final EditText txt_email=(EditText)mView.findViewById(R.id.email_ed);
        final Button btnadduser=(Button) mView.findViewById(R.id.add_user_btn);
        final Button btncancel=(Button) mView.findViewById(R.id.cancel_btn);

        alert.setView(mView);
        final AlertDialog alertDialog=alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        btnadduser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendUserData();
            }
        });
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();
            }
        });
        alertDialog.show();
    }

    private void sendUserData() {
    }
}