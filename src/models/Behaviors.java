package models;

/*
  The necessary JDK classes are imported here.
 */
import java.util.ArrayList;

/**
 * Behaviors class provides the modes in which the songs are viewed.
 *
 * @version 1.00.000 2022-06-05, This class corresponds to version 1 of the system,
 * no minor changes have been made.
 * The last change was made on June 05, 2022.
 *
 * @author Mauricio Pérez Rojas.
 *
 * @since 1, 00, 000
 */

public class Behaviors {

    /**
     * The sortRising method sort  the song library by Duration or date rising .
     * @param list Library of songs to filter.
     * @param property Duration or date of the song as organizing criteria.
     * @return Library sorted by the given criteria.
     */
    public static ArrayList<Song> sortRising(ArrayList<Song> list, String property) {
        /*
          The arraylist librarySort hold the ordered arraylist.
         */
        ArrayList<Song> librarySort;

        librarySort = list;
        /*
          Represents the list ordered by date and not by duration.
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
            /*
              Represents the list ordered by date and not by duration.
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

    /**
     * The sortRising method sort  the song library by Duration or date falling .
     * @param list Library of songs to filter.
     * @param property Duration or date of the song as organizing criteria.
     * @return Library sorted by the given criteria.
     */
    public static ArrayList<Song> sortFalling(ArrayList<Song> list, String property) {
        /*
          The arraylist librarySort hold the ordered arraylist.
         */
        ArrayList<Song> librarySort;

        librarySort = list;
        /*
          Represents the list ordered by date and not by duration.
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
            /*
              Represents the list ordered by date and not by duration.
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

    /**
     * The filterYear method filters the song library by year.
     * @param list Library of songs to filter.
     * @param year Song release year like a criterion.
     * @return Array filtered type song.
     */
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

    /**
     * The filterYear method filters the song library by year.
     * @param list Library of songs to filter.
     * @param genre Song genre like a criterion.
     * @return Array filtered type song.
     */
    public static ArrayList<Song> filterGenre(ArrayList<Song> list, String genre) {
        ArrayList<Song> libraryFilter = new ArrayList<>();
        for (Song item : list) {
            if (item.getGenre().equals(genre)) {
                libraryFilter.add(item);
            }
        }
        return libraryFilter;
    }
}