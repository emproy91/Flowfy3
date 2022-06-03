package models;

import java.util.Date;

public class Song {

    private int iD;
    private String title;
    private Date date;
    private int duration;
    private String genre;
    private String cover;
    private String description;

    public Song(int iD, String title, Date date, int duration, String genre, String cover, String description) {
        this.iD = nID();
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;

    }
    public int nID() {
        int _iD = (int) (Math.random() * 999);
        return _iD;
    }
    @Override
    public String toString() {
        return "Song{" +
                " iD=" + iD +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", duration=" + duration +
                ", genre='" + genre +"',"+ "\n"+
                "      cover='" + cover + "'," + "\n"+
                "      description='" + description + '\'' + "\n"+
                "    }";
    }

    /**
     * Access methods.
     * Setters and getters.
     */
}
