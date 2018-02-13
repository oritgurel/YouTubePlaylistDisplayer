package com.example.user.youtubeapi.YouTubeApi;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by User on 13/02/2018.
 */

public interface Service {

    @GET("http://www.leado.co.il/clients/shahak/json.json")
    Call<List<ListItem>> getListItems();
}
