package com.z1911.thinyoutube.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;

import com.z1911.thinyoutube.Adapters.YoutubeRVAdapter;
import com.z1911.thinyoutube.MainActivity;
import com.z1911.thinyoutube.Models.SearchResult;
import com.z1911.thinyoutube.Models.Song;
import com.z1911.thinyoutube.Network.Const;
import com.z1911.thinyoutube.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * A placeholder fragment containing a simple view.
 */
public class YoutubeListFragment extends Fragment {

    @Bind(R.id.searchText)
    EditText mSearchText;
    @Bind(R.id.searchButton)
    ImageView mSearchButton;
    @Bind(R.id.list)
    RecyclerView mRecyclerView;
    private YoutubeRVAdapter mAdapter;
    private List<Song> mSongList;
    private String mLastSong = null;


    public YoutubeListFragment() {
        mSongList = new ArrayList<>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);

        configureList();

        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = mSearchText.getText().toString();
                if (text != null && !text.isEmpty() && mLastSong != text) {
                    mLastSong = text;
                    search(text);
                    hideKeyboard();
                }
            }
        });


        return view;
    }

    private void configureList() {
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        mAdapter = new YoutubeRVAdapter(getActivity(), mSongList);
        mRecyclerView.setAdapter(mAdapter);
    }

    private void search(String query) {

        // todo move call to a dedicated yt-retrofit client, then register with otto
        // https://github.com/pat-dalberg/ImageNom/blob/master/src/com/dalberg/android/imagenom/async/FlickrClient.java
        MainActivity.getApiService().getYoutubeList(query, Const.API_KEY, new Callback<SearchResult>() {
            @Override
            public void success(SearchResult searchResult, Response response) {

                List<Song> songs = new ArrayList<Song>() {
                };
                for (SearchResult.ItemsEntity rawItem : searchResult.getItems()) {
                    Song tmp = new Song();
                    tmp.videoId = rawItem.getId().getVideoId();
                    tmp.artistName = rawItem.getSnippet().getChannelTitle();
                    tmp.title = rawItem.getSnippet().getTitle();
                    tmp.coverImageUrlLocation = rawItem.getSnippet().getThumbnails().getHigh().getUrl();
                    songs.add(tmp);
                }
                mSongList.clear();
                mSongList.addAll(songs);
                mAdapter.notifyDataSetChanged();
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    private void hideKeyboard() {
        // Check if no view has focus:
        View view = getActivity().getCurrentFocus();
        if (view != null) {
            InputMethodManager inputManager = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            inputManager.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }


}
