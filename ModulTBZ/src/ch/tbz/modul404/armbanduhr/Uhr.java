package ch.tbz.modul404.armbanduhr;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Uhr {
    private String besitzer;

    private String farbe;
    private String form;
    private int serialNumber;

    public Uhr(){
    }

    public Uhr(String besitzer) {
        this.besitzer = besitzer;
    }

    public Uhr(int serialNumber, String besitzer, String farbe, String form) {
        this.besitzer = besitzer;
        this.farbe = farbe;
        this.form = form;
        this.serialNumber = serialNumber;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void zeigeZeit(){
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.withNano(0));
    }

}
