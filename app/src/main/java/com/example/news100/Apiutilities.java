package com.example.news100;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Apiutilities {


    private static Retrofit retrofit = null;

    public static ApiInterface getApiInterface() {


        if (retrofit == null) {

            retrofit = new Retrofit.Builder().baseUrl(ApiInterface.BSEE_URL).addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(ApiInterface.class);
    }
}
