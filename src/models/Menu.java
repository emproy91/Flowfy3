package models;

import javax.swing.*;

public class Menu {

    public static void show(){

        String[] menu = {"View songs","Create Playlist","Sort","Exit"};
        boolean flag = true;
        try {
            while (flag){
                int menuOption = JOptionPane.showOptionDialog(null, "Main menu", "FLOWFY3",
                        JOptionPane.YES_NO_OPTION,JOptionPane.DEFAULT_OPTION,null,menu,"");
                switch(menuOption){
                    case 0:
                        System.out.println("Local library: " + "\n" + "      " + Library.localLibrary());

                        break;

                    case 1:
                        System.out.println("LUIIIIIIS  please Create Playlist !!!!");
                        break;

                    case 2:
                        System.out.println("Sort");
                        break;

                    case 3:
                        flag = false;
                        break;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }

}
