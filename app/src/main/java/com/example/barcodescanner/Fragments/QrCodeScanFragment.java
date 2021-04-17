package com.example.barcodescanner.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.barcodescanner.R;
import com.example.barcodescanner.ScannerView;
import com.example.barcodescanner.SearchCustomer;


public class QrCodeScanFragment extends Fragment {

    Button btn_scan,continue_btn;
    public static TextView scan_res_txt;


    public QrCodeScanFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_qr_code_scan, container, false);

       btn_scan=v.findViewById(R.id.scan_Now_btn);
       continue_btn=v.findViewById(R.id.btn_continue);
       scan_res_txt=v.findViewById(R.id.scan_result_txt);

       btn_scan.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(getActivity(), ScannerView.class));
           }
       });

       continue_btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(getActivity(), SearchCustomer.class);
               startActivity(intent);
           }
       });
       return v;
    }
}