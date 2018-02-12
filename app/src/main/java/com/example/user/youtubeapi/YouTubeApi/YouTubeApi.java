
package com.example.user.youtubeapi.YouTubeApi;

import java.util.List;

import com.example.user.youtubeapi.YouTubeApi.Playlist;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class YouTubeApi {

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
