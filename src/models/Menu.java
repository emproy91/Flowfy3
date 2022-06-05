package models;

import javax.swing.*;
import java.util.ArrayList;

public class Menu {

    public static void show() {

        String[] menu = {"View songs", "Create Playlist", "Sort", "Exit"};
        String[] menuS = {"rising duration", "falling duration", "rising date", "falling duration"};
        boolean flag = true;
        try {
            while (flag) {
                int menuOption = JOptionPane.showOptionDialog(null, "Main menu", "FLOWFY3",
                        JOptionPane.YES_NO_OPTION, JOptionPane.DEFAULT_OPTION, null, menu, "");
                switch (menuOption) {
                    case 0:
                        System.out.println("Local library: " + "\n" + "      " + Library.localLibrary());

                        break;

                    case 1:
                        System.out.println("LUIIIIIIS  please Create Playlist !!!!");
                        break;

                    case 2:
                        int mSort = JOptionPane.showOptionDialog(null, "Select sort type an property to show.",
                                "FLOWFY3", JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, null, menuS, "");
                        ArrayList<Song> librarySort = new ArrayList<>();
                        switch (mSort) {
                            case 0:
                                librarySort = Behaviors.sortRising(Library.localLibrary(), "duration");
                                System.out.println("Library sorted by rising duration:\n");
                                for (Song element : librarySort) {
                                    System.out.println(element);
                                }
                                break;
                            case 1:
                                librarySort = Behaviors.sortFalling(Library.localLibrary(), "duration");
                                System.out.println("Library sorted by falling duration:\n");
                                for (Song element : librarySort) {
                                    System.out.println(element);
                                }
                                break;

                            case 2:
                                librarySort = Behaviors.sortRising(Library.localLibrary(), "date");
                                System.out.println("Library sorted by rising date:\n");
                                for (Song element : librarySort) {
                                    System.out.println(element);
                                }
                                break;

                            case 3:
                                librarySort = Behaviors.sortFalling(Library.localLibrary(), "date");
                                System.out.println("Library sorted by falling duration:\n");
                                for (Song element : librarySort) {
                                    System.out.println(element);
                                }
                                break;

                        }

                        break;

                    case 3:
                        flag = false;
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
