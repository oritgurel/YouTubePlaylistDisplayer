
package com.example.user.youtubeapi.YouTubeApi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ListItem {

    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("thumb")
    @Expose
    private String thumb;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

}
