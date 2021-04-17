package Utils;

import android.app.ProgressDialog;
import android.content.Context;

public class CustProgressbar {
    ProgressDialog progressDialog;
    public void ProgressCreate(Context context){

        try {
            if(progressDialog !=null && progressDialog.isShowing()){
                return;
            }
            else {
                progressDialog=new ProgressDialog(context);
                if(progressDialog !=null && !progressDialog.isShowing()){
                    progressDialog.setMessage("Progress...");
                    progressDialog.show();
                }
            }
        }catch (Exception e){

        }
    }
    public void CloseProgressBar(){
        if (progressDialog !=null){
            try {
                progressDialog.cancel();
            }catch (Exception e){

            }
        }
    }
}
