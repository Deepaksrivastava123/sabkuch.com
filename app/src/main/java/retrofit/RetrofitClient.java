package retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static String BASE_URL="https://ecomrest.herokuapp.com/";
    private static RetrofitClient retrofitClient;
     static Retrofit retrofit=null;
     public static final String Append_URL="api/";



    public static Api getInterface(){
    HttpLoggingInterceptor interceptor=new HttpLoggingInterceptor();
    interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
    OkHttpClient client= new OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build();

    Gson gson =new GsonBuilder()
            .setLenient()
            .create();
    retrofit=new Retrofit.Builder()
            .baseUrl(BASE_URL)
             .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build();
    return  retrofit.create(Api.class);
    }

//    private RetrofitClient(){
//
//        Gson gson=new GsonBuilder()
//                .setLenient()
//                .create();
//        interceptor.level(HttpLoggingInterceptor.Level.BODY);
//        builder.addInterceptor(interceptor);
//
//        retrofit=new Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .client(builder.build())
//                .build();
//    }
//    public static synchronized RetrofitClient getInstance(){
//        if(retrofitClient==null){
//            retrofitClient=new RetrofitClient();
//        }
//        return retrofitClient;
//    }
//
//    public Api getApi(){
//        return retrofit.create(Api.class);
//    }
}
