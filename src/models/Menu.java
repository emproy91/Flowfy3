package models;

/*
  The necessary JDK classes are imported here.
 */
import javax.swing.*;
import java.util.ArrayList;
import java.util.Objects;

/**
 * The Menu class provides access for users to interact with the song library manager.
 *
 * @version 1.00.000 2022-06-05, This class corresponds to version 1 of the system,
 * no minor changes have been made.
 * The last change was made on June 05, 2022.
 *
 * @author Mauricio Pérez Rojas.
 * @author Luis Javier Rincon.
 *
 * @since 1, 00, 000
 */


public class Menu {

    /**
     * Show Menu to users in a pop-up window.
     */
    public static void show() {

        ArrayList<PlayList> playLists = new ArrayList<>();

        String[] menu = {"Library songs", "Playlist", "Sort", "Filters", "Exit"};

        String[] menuS = {"Rising duration", "falling duration", "Rising date", "Falling date", "Cancel"};

        String[] menuF ={"Year filter", "Genre filter", "Cancel"};

        boolean flag = true;
        //Flag to avoid inadvertent closings by the user.

        try {
            //exception to handle typing errors

            while (flag) {
                 Icon music = new ImageIcon(Menu.class.getResource("/img/music.png"));
                // (Icon) new ImageIcon(Objects.requireNonNull(Menu.class.getResource("/img/music.png"))).getImage();
                int menuOption = JOptionPane.showOptionDialog(null,
                        "Main menu\n"+" \n"+"Look at the results in the output console.", "FLOWFY3",
                        JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, music, menu, "");
                switch (menuOption) {
                    case 0:

                        /*
                          This option shows the local library of songs.
                         */
                        System.out.println("Local library: " + "\n" + "      " + Library.localLibrary());

                        break;

                    case 1:

                        /*
                          This is the menu for the create playlist option.
                         */
                        int playListOption = JOptionPane.showOptionDialog(null, "PlayList menu", "FLOWFY3",
                                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                                new Object[]{"View playLists", "Create PlayList", "Cancel"}, "");
                        switch (playListOption) {
                            case 0:

                                /*
                                  First case of the menu,two nested for loops
                                  to print in console the playlist
                                  with the name and songs of each playlist
                                 */
                                if (playLists.size() < 1 ){
                                    System.out.println("Please, create a new playlist");
                                }else {
                                    System.out.println("your playlists  =>");
                                for (PlayList p : playLists) {
                                        System.out.println(p.getPlayList());
                                        for (Song s : p.getSongs()) {
                                            System.out.println(s.getTitle() + " : " + s.getCover());
                                        }
                                        System.out.println("***************");
                                    }
                                }
                                break;
                            /*
                              Case 1 is when user wants to create a new playlist
                             */
                            case 1:

                                String name = JOptionPane.showInputDialog("Name to new playlist");
                                boolean control = true;
                                ArrayList<Song> finalSongs = new ArrayList<>();
                                // lists is a variable that will hold the names of the songs
                                String[] lista = new String[Library.localLibrary().size()];
                                ArrayList<String> picks = new ArrayList<>();

                                //Loop that searches if the playlist already exist and breaks the case if so
                                for (PlayList p : playLists) {
                                    if (name.equals(p.getPlayList())) {
                                        JOptionPane.showMessageDialog(null, "The playlist already exists");
                                        break;
                                    }
                                }

                                //This loop gets the song names to display them later to the user
                                int i = 0;
                                for (Song s : Library.localLibrary()) {
                                    lista[i] = s.getTitle();
                                    i++;
                                }
                                /*
                                  this loop will ask the user if he wants to add more songs to the playlist
                                 */
                                while (control) {
                                    //New lists is a String array tha will hold the updated list names in each iteration
                                    ArrayList<String> newLista = new ArrayList<>();
                                    if (lista.length > 0) {
                                        String pick = String.valueOf(JOptionPane.showInputDialog(null,
                                                "Choose a song.", "Menu",
                                                JOptionPane.QUESTION_MESSAGE, null, lista, ""));

                                        /*
                                          This loop will help update the list of songs so the user can't choose
                                          a song he has already chosen.
                                         */
                                        for (int x = 0; x < lista.length; x++) {
                                            if (!lista[x].equals(pick)) {
                                                newLista.add(lista[x]);
                                            }
                                        }

                                        //lists is updated to show the new list in case of the next iteration
                                        lista = newLista.toArray(new String[0]);
                                        picks.add(pick);
                                    }

                                    /*
                                      User is asked if he wants to add another song.
                                      In case he doesn't want to, the loop ends and the values are stored
                                      in the playlist ArrayList
                                     */
                                    int check = JOptionPane.showOptionDialog(null, "Add another song?", "Continue?",
                                            JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null,
                                            new Object[]{"Si", "No"}, "");

                                    if (check == 1) {
                                        /**
                                         * This nested loop checks for song objects in the library with the same name
                                         * as the songs the user picked and adds them to an array to finally
                                         * create the playlist object.
                                         */
                                        for (Song s : Library.localLibrary()) {
                                            for (int j = 0; j < picks.size(); j++) {
                                                if (picks.get(j).equals(s.getTitle())) {
                                                    finalSongs.add(s);
                                                }
                                            }
                                        }

                                        //The Playlist is created
                                        PlayList p = new PlayList(name, finalSongs);
                                        playLists.add(p);
                                        control = false;
                                    }

                                }

                                break;
                            case 2:
                                break;

                        }
                        break;

                    case 2:
                        /*
                          This option shows the ways to sort the songs.
                         */
                        int mSort = JOptionPane.showOptionDialog(null, "Select sort type an property to show.",
                                "FLOWFY3", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuS, "");
                        ArrayList<Song> librarySort;
                        switch (mSort) {

                                case 0 -> {
                                    librarySort = Behaviors.sortRising(Library.localLibrary(), "duration");
                                    System.out.println("Library sorted by rising duration:\n");
                                    for (Song element : librarySort) {
                                        System.out.println(element);
                                    }
                                }
                                case 1 -> {
                                    librarySort = Behaviors.sortFalling(Library.localLibrary(), "duration");
                                    System.out.println("Library sorted by falling duration:\n");
                                    for (Song element : librarySort) {
                                        System.out.println(element);
                                    }
                                }
                                case 2 -> {
                                    librarySort = Behaviors.sortRising(Library.localLibrary(), "date");
                                    System.out.println("Library sorted by rising date:\n");
                                    for (Song element : librarySort) {
                                        System.out.println(element);
                                    }
                                }
                                case 3 -> {
                                    librarySort = Behaviors.sortFalling(Library.localLibrary(), "date");
                                    System.out.println("Library sorted by falling duration:\n");
                                    for (Song element : librarySort) {
                                        System.out.println(element);
                                    }
                                }
                                case 4 -> { break;}

                        }
                        break;

                    case 3:

                        /*
                          This option shows the ways to filter the songs.
                         */
                        int mFilter = JOptionPane.showOptionDialog(null, "Select property filtering to show.",
                                "FLOWFY3", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuF, "");
                        ArrayList<Song> libraryMatch;

                        switch (mFilter) {
                            case 0 -> {
                                int yearFilter = Integer.parseInt(JOptionPane.showInputDialog("Please type a year to search for songs from this: "));
                                libraryMatch = Behaviors.filterYear(Library.localLibrary(), yearFilter);
                                System.out.println("These are the songs found from that year: ");
                                for (Song element : libraryMatch) {
                                    System.out.println(element);
                                }
                            }
                            case 1 -> {
                                String[] optionGenreFilter = {"Rock", "House", "Pop", "Vallenato", "Llanera"};
                                String genreFilter = (String) JOptionPane.showInputDialog(null, "Choose a gender.:",
                                        "Genre filter", JOptionPane.QUESTION_MESSAGE, null, optionGenreFilter, optionGenreFilter[0]);
                                libraryMatch = Behaviors.filterGenre(Library.localLibrary(), genreFilter);
                                System.out.println("Library filtered by genre:\n");
                                for (Song element : libraryMatch) {
                                    System.out.println(element);
                                }
                            }
                            case 2 -> { break; }
                        }
                        break;

                    case 4:

                        /*
                          This option displays a button to end the application.
                         */
                        flag = false;
                        break;
                }
            }
        } catch (Exception e) {
            //noinspection ThrowablePrintedToSystemOut
            System.out.println(e);
        }
    }

}
