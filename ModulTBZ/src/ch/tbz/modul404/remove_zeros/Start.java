package ch.tbz.modul404.remove_zeros;

import java.util.Scanner;

public class Start {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean isInvalid = false;
        String zahlString;
        do { System.out.println("Geben Sie eine Zahl ein: ");
            zahlString = scan.nextLine();
            if (zahlString.contains(" ")){
                System.out.println("Bitte nur eine Zahl.");
                isInvalid = true;
            }else{
                zahlString = RemoveZero.removeZero(zahlString);
                System.out.println(zahlString);
                isInvalid = false;
            }
        } while (isInvalid);

    }
}
