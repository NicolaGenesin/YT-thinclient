package com.z1911.thinyoutube.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.z1911.thinyoutube.Adapters.YoutubeRVAdapter;
import com.z1911.thinyoutube.Models.SearchResult;
import com.z1911.thinyoutube.Network.Const;
import com.z1911.thinyoutube.Network.IYoutubeService;
import com.z1911.thinyoutube.R;
import com.z1911.thinyoutube.Models.Song;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * A placeholder fragment containing a simple view.
 */
public class YoutubeListFragment extends Fragment {

    private YoutubeRVAdapter mAdapter;
    private List<Song> mSongList;

    public YoutubeListFragment(){
        mSongList = new ArrayList<Song>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(llm);
        mAdapter = new YoutubeRVAdapter(getActivity(),mSongList);
        recyclerView.setAdapter(mAdapter);



        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(Const.Youtube)
                .build();

        IYoutubeService service = restAdapter.create(IYoutubeService.class);
        service.getYoutubeList("massive attack", Const.API_KEY, new Callback<SearchResult>() {
            @Override
            public void success(SearchResult o, Response response) {

                List<Song> songs = new ArrayList<Song>() {
                };
                for (SearchResult.ItemsEntity rawItem : o.getItems()) {
                    Song tmp = new Song();
                    tmp.videoId = rawItem.getId().getVideoId();
                    tmp.artistName = rawItem.getSnippet().getChannelTitle();
                    tmp.title = rawItem.getSnippet().getTitle();
                    tmp.coverImageUrlLocation = rawItem.getSnippet().getThumbnails().getHigh().getUrl();
                    songs.add(tmp);
                }
                mSongList.addAll(songs);
                mAdapter.notifyDataSetChanged();
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });

        return view;
    }




}
