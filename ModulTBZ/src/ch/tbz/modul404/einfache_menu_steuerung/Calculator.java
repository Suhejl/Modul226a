package ch.tbz.modul404.einfache_menu_steuerung;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Calculator {
    public double fahrenheitToCelsius(double fahrenheit) {
        double celsius;
        celsius = ((fahrenheit - 32) * 5) / 9;
        return celsius;
    }

    public double celsiusToFahrenheit(double celsius) {
        double fahrenheit;
        fahrenheit = ((celsius * 9) / 5) + 32;
        return fahrenheit;
    }

    public int diffDate(Date d1, Date d2) {
        long diffInMillies = (d1.getTime() - d2.getTime());
        int diff = (int) (TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS));
        diff = Math.abs(diff);
        return diff;
    }

    public String intToBinaryi(int zahl) {
        String binary;
        binary = Integer.toBinaryString(zahl);
        return binary;
    }

    public int binaryToInt(String bin) {
        int zahl;
        zahl = Integer.parseInt(bin, 2);
        return zahl;
    }
}
