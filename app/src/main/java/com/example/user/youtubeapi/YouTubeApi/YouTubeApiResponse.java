
package com.example.user.youtubeapi.YouTubeApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class YouTubeApiResponse {

    @SerializedName("Playlists")
    @Expose
    private List<Playlist> playlists = null;

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

}
