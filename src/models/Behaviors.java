package models;

import java.util.ArrayList;

public class Behaviors {


    public static ArrayList<Song> sortRising(ArrayList<Song> list, String property) {
        /**
         * The arraylist librarySort hold the ordered arraylist.
         */
        ArrayList<Song> librarySort = new ArrayList<>();

        librarySort = list;
        /**
         * Represents the list ordered by date and not by duration.
         */
        if (property.equals("duration")) {
            System.out.println("By duration");
            for (int i = 0; i < librarySort.size(); i++) {
                for (int j = 0; j < librarySort.size(); j++) {
                    if (librarySort.get(i).getDuration() < librarySort.get(j).getDuration()) {
                        Song ram = librarySort.get(i);
                        librarySort.set(i, librarySort.get(j));
                        librarySort.set(j, ram);
                    }
                }
            }
            /**
             * Represents the list ordered by date and not by duration.
             */
        } else {
            System.out.println("By date");
            for (int i = 0; i < librarySort.size(); i++) {
                for (int j = 0; j < librarySort.size(); j++) {
                    if (librarySort.get(i).getDate().getYear() < librarySort.get(j).getDate().getYear()) {
                        Song ram = librarySort.get(i);
                        librarySort.set(i, librarySort.get(j));
                        librarySort.set(j, ram);
                    }
                }
            }
        }
        return librarySort;
    }

    public static ArrayList<Song> sortFalling(ArrayList<Song> list, String property) {
        /**
         * The arraylist librarySort hold the ordered arraylist.
         */
        ArrayList<Song> librarySort = new ArrayList<>();

        librarySort = list;
        /**
         * Represents the list ordered by date and not by duration.
         */
        if (property.equals("duration")) {
            System.out.println("By duration");
            for (int i = 0; i < librarySort.size(); i++) {
                for (int j = 0; j < librarySort.size(); j++) {
                    if (librarySort.get(i).getDuration() > librarySort.get(j).getDuration()) {
                        Song ram = librarySort.get(i);
                        librarySort.set(i, librarySort.get(j));
                        librarySort.set(j, ram);
                    }
                }
            }
            /**
             * Represents the list ordered by date and not by duration.
             */
        } else {
            System.out.println("By date");
            for (int i = 0; i < librarySort.size(); i++) {
                for (int j = 0; j < librarySort.size(); j++) {
                    if (librarySort.get(i).getDate().getYear() > librarySort.get(j).getDate().getYear()) {
                        Song ram = librarySort.get(i);
                        librarySort.set(i, librarySort.get(j));
                        librarySort.set(j, ram);
                    }
                }
            }
        }
        return librarySort;
    }

    public static ArrayList<Song> filterYear(ArrayList<Song> list, int year) {
        ArrayList<Song> libraryFilter = new ArrayList<>();
        for (Song item : list) {
            int yearSong = item.getDate().getYear() + 1900;
            if (yearSong == year) {
                libraryFilter.add(item);
            }
        }
        return libraryFilter;
    }

    public static ArrayList<Song> filterGenre(ArrayList<Song> list, String genre) {
        ArrayList<Song> libraryFilter = new ArrayList<>();
        for (Song item : list) {
            if (item.getGenre() == genre) {
                libraryFilter.add(item);
            }
        }
        return libraryFilter;
    }
}