package com.example.user.youtubeapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by User on 13/02/2018.
 */

public class YoutubeSeviceGenerator {

public final static Retrofit retrofit = new Retrofit.Builder().baseUrl("http://www.leado.co.il/clients/shahak/json.json")
        .addConverterFactory(GsonConverterFactory.create())
        .build();
}
