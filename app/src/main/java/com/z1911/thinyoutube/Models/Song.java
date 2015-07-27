package com.z1911.thinyoutube.Models;

/**
 * Created by nicola on 27/07/2015.
 */
public class Song {
    public String name;
    public String artistName;
    public String coverImageUrlLocation;

    public Song(String name, String artist, String coverImage) {
        this.name = name;
        this.artistName = artist;
        this.coverImageUrlLocation = coverImage;
    }
}


