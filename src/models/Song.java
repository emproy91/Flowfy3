package models;

/*
  The necessary JDK classes are imported here.
 */
import java.util.Date;

/**
 * Represents the information of a song.
 *
 * @version 1.00.000 2022-06-05, This class corresponds to version 1 of the system,
 * no minor changes have been made.
 * The last change was made on June 05, 2022.
 *
 * @author Mauricio Pérez Rojas.
 *
 * @since 1, 00, 000
 */

public class Song {

    /**
     * Variables are created
     */
    private int iD;
    private String title;
    private Date date;
    private int duration;
    private String genre;
    private String cover;
    private String description;

    /**
     * new void instance of the Song class.
     */
    public Song () {

    }

    /**
     * Create a new instance of the Song class.
     * @param iD Integer to identify the song.
     * @param title Name of song.
     * @param date Date release of song.
     * @param duration Song length in seconds.
     * @param genre Musical genre of the song.
     * @param cover Song cover path.
     * @param description Song description.
     */
    public Song(int iD, String title, Date date, int duration, String genre, String cover, String description) {
        this.iD = iD;
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;

    }


    /**
     * Create a new character string with the parameters of the class.
     * @return String array with data to show.
     */
    @Override
    public String toString() {
        return "Song{" +
                " iD: " + iD +
                ", title: '" + title + '\'' +
                ", date: " + date +
                ", duration: " + duration +
                ", genre: '" + genre +"',"+ "\n" +
                "      cover: '" + cover + "'," + "\n" +
                "      description: '" + description + '\'' + "\n" +
                "    }";
    }

    /**
     * Access methods.
     * Setters and getters.
     */
    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
