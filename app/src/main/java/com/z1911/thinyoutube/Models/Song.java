package com.z1911.thinyoutube.Models;

/**
 * Created by nicola on 27/07/2015.
 */
public class Song {
    public String title;
    public String artistName;
    public String coverImageUrlLocation;
    public String videoId;

    public Song(String name, String artist, String coverImage, String videoId) {
        this.title = name;
        this.artistName = artist;
        this.coverImageUrlLocation = coverImage;
        this.videoId = videoId;
    }

    public Song() {

    }
}


