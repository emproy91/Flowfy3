/**
 * Here the necessary classes created are imported.
 */
import models.Menu;
import models.PlayList;

/*
  The necessary JDK classes are imported here.
 */

import java.util.ArrayList;

/**
 * Represents a manager of music.
 *
 * The entry point to run the program is the class
 * main from where the Run File should be executed
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
public class Main {
    public static void main(String[] args) {

        welcome();
        Menu.show();

    }

    /**
     * Represents a Welcome screen.
     */
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
