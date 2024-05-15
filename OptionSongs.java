package com.assignment17;

import java.util.Scanner;

public class OptionSongs {
	private PlayList playlist;
    private Scanner sc;
    public OptionSongs(PlayList playlist) {
        this.playlist = playlist;
        this.sc = new Scanner(System.in);
    }
    public void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add a song");
        System.out.println("2. Remove a song");
        System.out.println("3. Play current song");
        System.out.println("4. Play next song");
        System.out.println("5. Display playlist");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }
	public  void init() {
		int choice;
	 
      do {
    	  displayMenu();
          choice = sc.nextInt();
          sc.nextLine();
    	  switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter artist: ");
                    String artist = sc.nextLine();
                    playlist.addSong(title, artist);
                    break;
                case 2:
                    System.out.print("Enter song title to remove: ");
                    String removeTitle = sc.nextLine();
                    playlist.removeSong(removeTitle);
                    break;
                case 3:
                    playlist.playCurrentSong();
                    break;
                case 4:
                    playlist.nextSong();
                    break;
                case 5:
                    System.out.println("Playlist:");
                    playlist.displayPlaylist();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 6.");
            }
        } while (choice != 6);
	}

}
