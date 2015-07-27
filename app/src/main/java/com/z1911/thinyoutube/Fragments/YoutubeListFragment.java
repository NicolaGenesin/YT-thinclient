package com.z1911.thinyoutube.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.z1911.thinyoutube.Adapters.YoutubeRVAdapter;
import com.z1911.thinyoutube.R;
import com.z1911.thinyoutube.Models.Song;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class YoutubeListFragment extends Fragment {

    private YoutubeRVAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);

        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(llm);
        mAdapter = new YoutubeRVAdapter(getActivity(), getDummyListOfSongs());
        recyclerView.setAdapter(mAdapter);

        return view;
    }

    private List<Song> getDummyListOfSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song("1Emma Wilson", "23 years old", "http://i.imgur.com/DvpvklR.png"));
        songs.add(new Song("2Emma Wilson", "23 years old", "http://img.ffffound.com/static-data/assets/6/c61a7ab838fedb325a082aac082df5ad7ce57119_m.jpg"));
        songs.add(new Song("3Emma Wilson", "23 years old", "http://media.tumblr.com/tumblr_ljvcy6eYzb1qb7rub.jpg"));
        songs.add(new Song("1Emma Wilson", "23 years old", "http://i.imgur.com/DvpvklR.png"));
        songs.add(new Song("2Emma Wilson", "23 years old", "http://img.ffffound.com/static-data/assets/6/c61a7ab838fedb325a082aac082df5ad7ce57119_m.jpg"));
        songs.add(new Song("3Emma Wilson", "23 years old", "http://media.tumblr.com/tumblr_ljvcy6eYzb1qb7rub.jpg"));
        songs.add(new Song("1Emma Wilson", "23 years old", "http://i.imgur.com/DvpvklR.png"));
        songs.add(new Song("2Emma Wilson", "23 years old", "http://img.ffffound.com/static-data/assets/6/c61a7ab838fedb325a082aac082df5ad7ce57119_m.jpg"));
        songs.add(new Song("3Emma Wilson", "23 years old", "http://media.tumblr.com/tumblr_ljvcy6eYzb1qb7rub.jpg"));
        songs.add(new Song("1Emma Wilson", "23 years old", "http://i.imgur.com/DvpvklR.png"));
        songs.add(new Song("2Emma Wilson", "23 years old", "http://img.ffffound.com/static-data/assets/6/c61a7ab838fedb325a082aac082df5ad7ce57119_m.jpg"));
        songs.add(new Song("3Emma Wilson", "23 years old", "http://media.tumblr.com/tumblr_ljvcy6eYzb1qb7rub.jpg"));
        songs.add(new Song("1Emma Wilson", "23 years old", "http://i.imgur.com/DvpvklR.png"));
        songs.add(new Song("2Emma Wilson", "23 years old", "http://img.ffffound.com/static-data/assets/6/c61a7ab838fedb325a082aac082df5ad7ce57119_m.jpg"));
        songs.add(new Song("3Emma Wilson", "23 years old", "http://media.tumblr.com/tumblr_ljvcy6eYzb1qb7rub.jpg"));
        songs.add(new Song("1Emma Wilson", "23 years old", "http://i.imgur.com/DvpvklR.png"));
        songs.add(new Song("2Emma Wilson", "23 years old", "http://img.ffffound.com/static-data/assets/6/c61a7ab838fedb325a082aac082df5ad7ce57119_m.jpg"));
        songs.add(new Song("3Emma Wilson", "23 years old", "http://media.tumblr.com/tumblr_ljvcy6eYzb1qb7rub.jpg"));
        songs.add(new Song("1Emma Wilson", "23 years old", "http://i.imgur.com/DvpvklR.png"));
        songs.add(new Song("2Emma Wilson", "23 years old", "http://img.ffffound.com/static-data/assets/6/c61a7ab838fedb325a082aac082df5ad7ce57119_m.jpg"));
        songs.add(new Song("3Emma Wilson", "23 years old", "http://media.tumblr.com/tumblr_ljvcy6eYzb1qb7rub.jpg"));
        songs.add(new Song("1Emma Wilson", "23 years old", "http://i.imgur.com/DvpvklR.png"));
        songs.add(new Song("2Emma Wilson", "23 years old", "http://img.ffffound.com/static-data/assets/6/c61a7ab838fedb325a082aac082df5ad7ce57119_m.jpg"));
        songs.add(new Song("3Emma Wilson", "23 years old", "http://media.tumblr.com/tumblr_ljvcy6eYzb1qb7rub.jpg"));
        songs.add(new Song("1Emma Wilson", "23 years old", "http://i.imgur.com/DvpvklR.png"));
        songs.add(new Song("2Emma Wilson", "23 years old", "http://img.ffffound.com/static-data/assets/6/c61a7ab838fedb325a082aac082df5ad7ce57119_m.jpg"));
        songs.add(new Song("3Emma Wilson", "23 years old", "http://media.tumblr.com/tumblr_ljvcy6eYzb1qb7rub.jpg"));
        songs.add(new Song("1Emma Wilson", "23 years old", "http://i.imgur.com/DvpvklR.png"));
        songs.add(new Song("2Emma Wilson", "23 years old", "http://img.ffffound.com/static-data/assets/6/c61a7ab838fedb325a082aac082df5ad7ce57119_m.jpg"));
        songs.add(new Song("3Emma Wilson", "23 years old", "http://media.tumblr.com/tumblr_ljvcy6eYzb1qb7rub.jpg"));
        songs.add(new Song("1Emma Wilson", "23 years old", "http://i.imgur.com/DvpvklR.png"));
        songs.add(new Song("2Emma Wilson", "23 years old", "http://img.ffffound.com/static-data/assets/6/c61a7ab838fedb325a082aac082df5ad7ce57119_m.jpg"));
        songs.add(new Song("3Emma Wilson", "23 years old", "http://media.tumblr.com/tumblr_ljvcy6eYzb1qb7rub.jpg"));
        songs.add(new Song("1Emma Wilson", "23 years old", "http://i.imgur.com/DvpvklR.png"));
        songs.add(new Song("2Emma Wilson", "23 years old", "http://img.ffffound.com/static-data/assets/6/c61a7ab838fedb325a082aac082df5ad7ce57119_m.jpg"));
        songs.add(new Song("3Emma Wilson", "23 years old", "http://media.tumblr.com/tumblr_ljvcy6eYzb1qb7rub.jpg"));
        return songs;
    }
}
