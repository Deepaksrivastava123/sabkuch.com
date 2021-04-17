//package retrofit;
//
//import android.content.Context;
//import android.util.Log;
//import android.widget.Toast;
//
//import com.example.barcodescanner.MainActivity;
//import com.google.gson.JsonObject;
//
//import Utils.Utiles;
//import model.loginresponse;
//import retrofit2.Call;
//import retrofit2.Callback;
//import retrofit2.Response;
//
//public class GetResult {
//    public static MyListener myListener;
//
//    public void callForLogin(Call<loginresponse> call, final String callno){
//      call.enqueue(new Callback<loginresponse>() {
//                @Override
//                public void onResponse(Call<loginresponse> call, Response<loginresponse> response) {
//                    Log.e("message"," : "+response.message());
//                    Log.e("body"," : "+response.body());
//                    Log.e("callno"," : "+callno);
//                    myListener.callback(.body(),callno);
//                }
//
//
//
//          @Override
//                public void onFailure(Call<loginresponse> call, Throwable t) {
//                    myListener.callback(null,callno);
//                    call.cancel();
//                    t.printStackTrace();
//                }
//            });
//        }
//
//    public interface MyListener{
//        public void callback(JsonObject result, String callNo);
//    }
//    public void setMyListener(MyListener Listener){
//        myListener=Listener;
//    }
//}
