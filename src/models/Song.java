package models;
/**
 * Represents the information of a song.
 * @author Mauricio Pérez Rojas.
 * @author Luis Javier Rincon.
 */
import java.util.Date;

public class Song {

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
        this.iD = nID();
        this.title = title;
        this.date = date;
        this.duration = duration;
        this.genre = genre;
        this.cover = cover;
        this.description = description;

    }

    /**
     * Create a new random integer to identify the song.
     * @return A new _iD.
     */
    public int nID() {
        int _iD = (int) (Math.random() * 999);
        // Generate and save a new random id.
        return _iD;
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

/**
 * Adjustment for account number and date of birth.
 * @param yBirth Year of birth adjusted to the Date library.
 * @param mBirth Month of birth adjusted to the Date library.
 * @param dBirth Day of birth set to the Date library.

int yRelease = 2002-1900;
int mRelease = 05-1;
int dRelease = 0;
Date release = new Date( yRelease, mRelease, dRelease);
// System.out.println(release );
 */

