package com.z1911.thinyoutube.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

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
    @Bind(R.id.progressBar)
    ProgressBar mProgressBar;
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
        makeApiCall("massive attack");
        backgroundSearchHandler();

        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                search(mSearchText.getText().toString(), true);
            }
        });

        mSearchText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                    search(v.getText().toString(), true);
                    return true;
                }
                return false;
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


    public void search(String query, boolean hideKeyboard) {
        if (query != null && !query.isEmpty() && mLastSong != query) {
            mProgressBar.setVisibility(View.VISIBLE);
            mLastSong = query;
            makeApiCall(query);
            if (hideKeyboard)
                hideKeyboard();
        }
    }

    private void makeApiCall(String query) {
        // todo move call to a dedicated yt-retrofit client, then register with otto
        // https://github.com/pat-dalberg/ImageNom/blob/master/src/com/dalberg/android/imagenom/async/FlickrClient.java
        MainActivity.getApiService().getYoutubeList(query, Const.API_KEY, new Callback<SearchResult>() {
            @Override
            public void success(SearchResult searchResult, Response response) {

                List<Song> songs = new ArrayList<Song>() {
                };
                songs.add(new Song()); //todo dummy song
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
                mProgressBar.setVisibility(View.GONE);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    private void hideKeyboard() {
        View view = getActivity().getCurrentFocus();
        if (view != null) {
            InputMethodManager inputManager = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
            inputManager.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        }
    }

    private void backgroundSearchHandler() {
        final Handler handler = new Handler();

        handler.post(new Runnable() {
            @Override
            public void run() {
                String text = mSearchText.getText().toString();
                if (text!=text+" ")
                    search(text, false);
                handler.postDelayed(this, 2000);
            }
        });
    }
}
