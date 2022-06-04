package models;

import javax.swing.*;

public class Menu {

    public static void show(){
        String[] menu = {"Agregar cancion","Ver canciones","Crear Playlist", "Ordenar","Salir"};
        boolean flag = true;
        try {
            while (flag){
                int menuOption = JOptionPane.showOptionDialog(null, "Menú de opciones", "MENÚ",
                        JOptionPane.YES_NO_OPTION,JOptionPane.DEFAULT_OPTION,null,menu,"");
                switch(menuOption+1){


                    case 5:
                        flag = false;
                        break;
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
