package ch.tbz.modul404.einfache_menu_steuerung;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InvalidPropertiesFormatException;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;
import java.util.prefs.InvalidPreferencesFormatException;

public class Menu {


    public void menue(Calculator calc) {
        boolean isRunning = false;
        boolean isWrongFormat = false;
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat simpleFormatter = new SimpleDateFormat("MM/dd/yyyy");
        int getChoice = 0;
        double fahrenheit;
        double celsius;
        int zahl;
        String binary;
        String d1, d2 = null;

        do {
            System.out.println(menueLayout());
                getChoice = Integer.parseInt(scan.nextLine());

                switch (getChoice) {
                    case 1:
                        do {
                            try {
                                isWrongFormat = false;
                                System.out.print("Celsius: ");
                                celsius = Double.parseDouble(scan.nextLine());
                                System.out.println("Fahrenheit: " + calc.celsiusToFahrenheit(celsius));
                            } catch (NumberFormatException e) {
                                System.out.println("Ungültige Eingabe.");
                                isWrongFormat = true;
                            }
                        } while (isWrongFormat);
                        break;
                    case 2:
                        do {
                            try {
                                isWrongFormat = false;
                                System.out.print("Fahrenheit: ");
                                fahrenheit = Double.parseDouble(scan.nextLine());
                                System.out.println("Celsius: " + calc.fahrenheitToCelsius(fahrenheit));
                            } catch (NumberFormatException e) {
                                System.out.println("Ungültige Eingabe.");
                                isWrongFormat = true;
                            }
                        } while (isWrongFormat);

                        break;
                    case 3:
                        do {
                            try {
                                isWrongFormat = false;
                                System.out.print("Zahl: ");
                                zahl = Integer.parseInt(scan.nextLine());
                                System.out.println("Binär: " + calc.intToBinaryi(zahl));
                            }catch (NumberFormatException e) {
                                System.out.println("Ungültige Eingabe.");
                                isWrongFormat = true;
                            }
                        } while (isWrongFormat);

                        break;
                    case 4:
                        do {
                            try {
                                isWrongFormat = false;
                                System.out.print("Binär: ");
                                binary = scan.nextLine();
                                System.out.println("Zahl: " + calc.binaryToInt(binary.replaceAll("\\s", "")));
                            }catch (NumberFormatException e) {
                                System.out.println("Ungültige Eingabe.");
                                isWrongFormat = true;
                            }
                        } while (isWrongFormat);

                        break;
                    case 5:
                        do {
                            try {
                                isWrongFormat = false;
                                System.out.println("\nFormat: MM/DD/yyyy\n");
                                System.out.print("Erstes Datum: ");
                                d1 = scan.nextLine();
                                System.out.print("Zweites Datum: ");
                                d2 = scan.nextLine();
                                Date date, date1;


                                date = simpleFormatter.parse(d1);
                                date1 = simpleFormatter.parse(d2);


                                System.out.println(calc.diffDate(date, date1));
                            } catch (ParseException e) {
                                System.out.println("Ungültiges Format.");
                                isWrongFormat = true;
                            }
                        } while (isWrongFormat);

                        break;
                    case 0:
                        System.out.println("Bye");
                        break;
                    default:
                        System.out.println("Bitte eine Zahl zwischen [0] bis [5]");
                }
                if (getChoice != 0) {
                    System.out.print("Willst du fortfahren? (true/false) \n>");
                    isRunning = Boolean.parseBoolean(scan.nextLine());
                }
        } while (isRunning & getChoice != 0);
    }

    private String menueLayout() {
        String menuString =
            "[1] Celsius            -> Fahrenheit\n" +
                "[2] Fahrenheit         -> Celsius\n" +
                "[3] Integer            -> Binär\n" +
                "[4] Binär              -> Integer\n" +
                "[5] Diff Date d1 d2    -> Anzahl Tage\n" +
                "[0] beenden";

        return menuString;
    }
}

