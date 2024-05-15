package com.assignment17;

public class Song {
	String title;
    String artist;
    Song next;

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
        this.next = null;
    }
}
