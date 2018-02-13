package com.example.user.youtubeapi;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 13/02/2018.
 */

public class ItemsActivity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {
   public static final String API_KEY = "AIzaSyCw6zkWqFHvfjVI0fxKCCGXzznXhO-3_7g";
   public static final List<String> VIDEO_ID_LIST = new ArrayList<>();


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }
}
