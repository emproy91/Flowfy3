import models.Menu;
import models.PlayList;
import models.Song;
///////////////////////////////////
/**
 * The necessary JDK classes are imported here.
 */

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a manager of music.
 *
 * The entry point to run the program is the class
 * main from where the Run File should be executed
 *
 *
 * @version 1.00.000 2022-06-03, This class corresponds to version 1 of the system,
 * no minor changes have been made.
 * The last change was made on June 03, 2022.
 *
 * @author Mauricio Pérez Rojas.
 * @author Luis Javier Rincon.
 *
 * @since 1,00,000
 *
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Adjustment for account number and date of birth.
         * @param acc1 Account 1 encrypted only with the sum of 1.
         * @param yBirth Year of birth adjusted to the Date library.
         * @param mBirth Month of birth adjusted to the Date library.
         * @param dBirth Day of birth set to the Date library.
         */
        int yRelease = 2002-1900;
        int mRelease = 05-1;
        int dRelease = 0;
        Date release = new Date( yRelease, mRelease, dRelease);

        ArrayList<PlayList> playList = new ArrayList<>();
        boolean flag = true;
        String[] menu = {"Agregar cancion","Ver canciones","Crear Playlist", "Ordenar","Salir"};
        System.out.println(release );
        /**
         * Represents an ArrayList to hold class objects.
         */
        ArrayList<Song> library = new ArrayList<>();

        Song song0 = new Song(1, "United", new Date(116, 3, 0),
                416, "house",
                "https://open.spotify.com/track/64nKx64x8kb5fuoW3YPB4K?si=b148f07f15a24d6a",
                "The Masquerade, Mixed by Claptone");

        Song song1 = new Song(1, "Californication", new Date(99, 5, 8),
                329, "rock",
                "https://open.spotify.com/track/48UPSzbZjgc449aqz8bxox?si=5837a01c40c54798",
                "Californication (Deluxe Edition), Red Hot Chili Peppers");

        Song song2 = new Song(1, "Otherside", new Date(99, 5, 8),
                255, "rock",
                "https://open.spotify.com/track/64BbK9SFKH2jk86U3dGj2P?si=13921225ff96420d",
                "Californication (Deluxe Edition), Red Hot Chili Peppers");

        Song song3 = new Song(1, "...Baby One More Time", new Date(99, 0, 12),
                241, "pop",
                "https://open.spotify.com/track/3MjUtNVVq3C8Fn0MP3zhXa?si=de3ca547416c4e00",
                "...Baby One More Time (Digital Deluxe Version Edition), Britney Spears");

        Song song4 = new Song(1, "Llanerazo", new Date(101, 6, 22),
                174, "llanera",
                "https://open.spotify.com/track/74bylEj676qawMTY6fcoTb?si=ebdd33a73265458e",
                "Corazon Marca'o, Cholo Valderrama");

        Song song5 = new Song(1, "La Suerte Esta Echada", new Date(106, 4, 26),
                296, "vallenato",
                "https://open.spotify.com/track/70D93Sai1gWfwlj7neZIEa?si=727d5b807401482f",
                "Muchas Gracias, Diomedes Díaz");

        library.add(song0);
        library.add(song1);
        library.add(song2);
        library.add(song3);
        library.add(song4);
        library.add(song5);

        System.out.println(song4);
        // System.out.println(nID());

        System.out.println("Local library: " + "\n" + "      " + library);

        Menu.show();
    }
    // Generate and save a new random id.



    }


// Hi, I'm flowfy, your virtual assistant to manage your music.