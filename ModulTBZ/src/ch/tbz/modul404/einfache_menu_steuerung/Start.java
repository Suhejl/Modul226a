package ch.tbz.modul404.einfache_menu_steuerung;

public class Start {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        Menu menu = new Menu();

        menu.menue(calculator);
    }


}
