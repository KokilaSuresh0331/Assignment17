package com.assignment17;


public class MusicPlayer {
	
	
	 public static void main(String[] args) {
		 System.out.println("Enjoy this Music Player with Nature");
		 PlayList playlist = new PlayList();
	        OptionSongs optionSong = new OptionSongs(playlist);
	        optionSong.init();
	    }
	}
