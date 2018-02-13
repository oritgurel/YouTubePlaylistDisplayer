package com.example.user.youtubeapi.YouTubeApi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by User on 13/02/2018.
 */

public interface Service {
   static final String query = "v=";
   String videoLink="";


    @GET("http://www.leado.co.il/clients/shahak/json.json")
    Call<YouTubeApiResponse> getResponse();

    @GET(videoLink)
    Call<ListItem> getLinkId(@Query(query) String query);
}
