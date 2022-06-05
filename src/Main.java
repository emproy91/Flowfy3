import models.*;
/**
 * The necessary JDK classes are imported here.
 */

import java.util.ArrayList;

/**
 * Represents a manager of music.
 * <p>
 * The entry point to run the program is the class
 * main from where the Run File should be executed
 *
 * @author Mauricio Pérez Rojas.
 * @author Luis Javier Rincon.
 * @version 1.00.000 2022-06-03, This class corresponds to version 1 of the system,
 * no minor changes have been made.
 * The last change was made on June 03, 2022.
 * @since 1, 00, 000
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<PlayList> playList = new ArrayList<>();

        /*
        Behaviors.showList(Library.localLibrary());
        Behaviors.getSortD(Library.localLibrary());
        String x = "Sorted Songs by duration" + Library.localLibrary();
        System.out.println(x);
        Behaviors.showList(Library.localLibrary());
         */


        welcome();
        Menu.show();
        // if (menu[0] == "View songs"){}

    }


    private static void welcome() {

        System.out.println("Hi, I'm Flowfy 3, your virtual assistant to manage your music.");
        System.out.println("   (_)(_)(_)(_)(_)    (_)(_)                                                _(_)(_)                            _(_)(_)(_)(_)_   ");
        System.out.println("   (_)                   (_)           _  _  _        _             _    _ (_) _     _               _        (_)          (_)  ");
        System.out.println("   (_) _  _              (_)        _ (_)(_)(_) _    (_)           (_)  (_)(_)(_)   (_)_           _(_)                _  _(_)  ");
        System.out.println("   (_)(_)(_)             (_)       (_)         (_)   (_)     _     (_)     (_)        (_)_       _(_)                 (_)(_)_   ");
        System.out.println("   (_)                   (_)       (_)         (_)   (_)_  _(_)_  _(_)     (_)          (_)_   _(_)            _           (_)  ");
        System.out.println("   (_)                 _ (_) _     (_) _  _  _ (_)     (_)(_) (_)(_)       (_)            (_)_(_)             (_)_  _  _  _(_)  ");
        System.out.println("   (_)                (_)(_)(_)       (_)(_)(_)          (_)   (_)         (_)             _(_)                 (_)(_)(_)(_)    ");
        System.out.println("                                                                                      _  _(_)                                   ");
        System.out.println("                                                                                     (_)(_)                                     ");
        System.out.println(" ");
        // Welcome to flowfy 3

    }

}
