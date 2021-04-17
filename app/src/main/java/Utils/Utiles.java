package Utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Utiles {
    public static boolean internetCheck(Context context){
        ConnectivityManager ConnectionManager=(ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo=ConnectionManager.getActiveNetworkInfo();
        if(networkInfo!=null && networkInfo.isConnected()==true){
            return true;
        }else {
            return false;
        }
    }
}
