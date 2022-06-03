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
        this.iD = iD;
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;

    }

    @Override
    public String toString() {
        return "Song{" +
                "iD=" + iD +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", cover='" + cover + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
