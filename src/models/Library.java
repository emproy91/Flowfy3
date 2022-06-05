package models;

import java.util.ArrayList;
import java.util.Date;

public class Library {

    public static ArrayList<Song> localLibrary(){

        /**
         * Represents an ArrayList to hold class objects.
         */
        ArrayList<Song> library = new ArrayList<>();

        /**
         * Songs by default
         */
        Song s0 = new Song(1, "United", new Date(116, 3, 0),
                416, "house",
                "https://open.spotify.com/track/64nKx64x8kb5fuoW3YPB4K?si=b148f07f15a24d6a",
                "The Masquerade, Mixed by Claptone");

        Song s1 = new Song(1, "Californication", new Date(99, 5, 8),
                329, "rock",
                "https://open.spotify.com/track/48UPSzbZjgc449aqz8bxox?si=5837a01c40c54798",
                "Californication (Deluxe Edition), Red Hot Chili Peppers");

        Song s2 = new Song(1, "Otherside", new Date(99, 5, 8),
                255, "rock",
                "https://open.spotify.com/track/64BbK9SFKH2jk86U3dGj2P?si=13921225ff96420d",
                "Californication (Deluxe Edition), Red Hot Chili Peppers");

        Song s3 = new Song(1, "...Baby One More Time", new Date(99, 0, 12),
                241, "pop",
                "https://open.spotify.com/track/3MjUtNVVq3C8Fn0MP3zhXa?si=de3ca547416c4e00",
                "...Baby One More Time (Digital Deluxe Version Edition), Britney Spears");

        Song s4 = new Song(1, "Llanerazo", new Date(101, 6, 22),
                174, "llanera",
                "https://open.spotify.com/track/74bylEj676qawMTY6fcoTb?si=ebdd33a73265458e",
                "Corazon Marca'o, Cholo Valderrama");

        Song s5 = new Song(1, "La Suerte Esta Echada", new Date(106, 4, 26),
                296, "vallenato",
                "https://open.spotify.com/track/70D93Sai1gWfwlj7neZIEa?si=727d5b807401482f",
                "Muchas Gracias, Diomedes Díaz");

        Song s6 = new Song(1, "Cold Hert - PNAU Remix", new Date(121, 10, 20),
                199, "pop",
                "https://open.spotify.com/track/6JIC3hbC28JZKZ8AlAqX8h?si=505249808a8745b1",
                "The Lockdown Sessions, Elton John");

        /**
         * Add to array library by save songs.
         */
        library.add(s0);
        library.add(s1);
        library.add(s2);
        library.add(s3);
        library.add(s4);
        library.add(s5);
        library.add(s6);


        // System.out.println(song4);
        // System.out.println("Local library: " + "\n" + "      " + library);
        return library;
    }



}
