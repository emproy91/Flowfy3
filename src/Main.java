import models.Song;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Song s0 = new Song(001, "New age", new Date(102, 3, 12),
                180, "eLECTRO", "https://open.spotify.com/track/64nKx64x8kb5fuoW3YPB4K?si=b148f07f15a24d6a\n", "DFKJHABSLD");
        System.out.println("Hello song" + s0.toString() );
    }
}