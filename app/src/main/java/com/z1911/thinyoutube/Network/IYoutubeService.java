package com.z1911.thinyoutube.Network;

import com.z1911.thinyoutube.Models.SearchResult;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by nicola on 30/07/2015.
 */
public interface IYoutubeService {
    @GET("/search?part=snippet&type=video")
    void getYoutubeList(@Query("q") String query, @Query("key") String key, Callback<SearchResult> cb);
}
