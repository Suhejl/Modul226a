package ch.tbz.modul404.armbanduhr;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Uhr objuhr1 = new Uhr();
        objuhr1.setSerialNumber(101);
        objuhr1.setFarbe("grau");
        objuhr1.setForm("rund");
        objuhr1.setBesitzer("Besitzer1");
        Uhr objuhr2 = new Uhr("Besitzer");
        objuhr2.zeigeZeit();
    }
}
