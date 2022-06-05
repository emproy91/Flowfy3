package models;

/*
  The necessary JDK classes are imported here.
 */
import java.util.ArrayList;

public class PlayList {

    /*
      Variables are created
     */
    /**
     * Variables are created
     */
    String playList;
    ArrayList<Song> songs = new ArrayList<>();

    /**
     * Constructor
     * @param playlist
     * @param songs
     */
    public PlayList(String playlist,ArrayList<Song> songs) {
        this.playList = playlist;
        this.songs = songs;
    }
    // Get Set methods For plyList
    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }
    // Get Set methods for ArrayList
    public ArrayList<Song> getSongs() {
        return songs;
    }

    public void setSongs(ArrayList<Song> songs) {
        this.songs = songs;
    }
    //Method to print the class values
    @Override
    public String toString() {
        return "PlayList{" +
                "playList='" + playList + '\'' +
                ", songs=" + songs +
                '}';
    }
}