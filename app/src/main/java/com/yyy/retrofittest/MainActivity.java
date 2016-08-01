package com.yyy.retrofittest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

import retrofit.Call;
import retrofit.Callback;
import retrofit.GsonConverterFactory;
import retrofit.Response;
import retrofit.Retrofit;

public class MainActivity extends AppCompatActivity {

    private TextView tv_show;
    private Button btn_getdata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        tv_show = (TextView) findViewById(R.id.tv_show);
        btn_getdata = (Button) findViewById(R.id.btn_getdata);
        btn_getdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                queryData();
            }
        });
    }


    private void queryData() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://xmzcproxy.dhjt.com:8080/zcy/app/appPersonalClient/loginHomepage_v1.do")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        GetDataMain data = retrofit.create(GetDataMain.class);
//        Call<LoginData> loginData=data.getUserMsg("18956564593","123456");
        Map<String, String> paramsMap = new HashMap<>();
        paramsMap.put("contactPhone", "18956564593");
        paramsMap.put("password", "123456");
        Call<LoginData> loginData = data.getWhitMap(paramsMap);


        loginData.enqueue(new Callback<LoginData>() {
            @Override
            public void onResponse(Response<LoginData> response, Retrofit retrofit) {
                LoginData loginData1 = response.body();
                tv_show.setText(response.body().getData().toString());

            }

            @Override
            public void onFailure(Throwable t) {

            }
        });


    }

}
