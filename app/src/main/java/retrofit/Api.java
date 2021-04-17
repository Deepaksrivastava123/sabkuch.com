package retrofit;

import com.google.gson.JsonObject;

import org.json.JSONObject;

import java.util.HashMap;

import model.loginresponse;
import model.registerResponse;
import model.verifyotpresponse;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface Api {

//    @Headers("Content-Type: application/json")
//    @POST("login")
//    Call<loginresponse>getLogin(@Body JsonObject object);


    @POST("login")
    Call<loginresponse>getLogin(@Body HashMap<String, String> body);

    @POST("verifyOtp")
    Call<verifyotpresponse>getVerifyOtp(@Body HashMap<String, String> body);

    @POST("register")
    Call<registerResponse>getRegister(@Body HashMap<String, String> body);




//    @FormUrlEncoded
//    @POST("verifyOtp")
//    Call<verifyotpresponse>verifyotp(
//            @Field("otpCode") String otpCode);
}


//    Deepak Gupta11:25 PM
//@GET("scheduler/point-continue-seven-days-target")
//    Call<ResponseBody> updateSevenDaysChallenge(@Query("app_environment") String app_environment, @Query("page") int page,
//@Query("item_per_page") int item_per_page);