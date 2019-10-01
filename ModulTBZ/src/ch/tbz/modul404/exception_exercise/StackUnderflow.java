package ch.tbz.modul404.exception_exercise;

//  Falls man den Try-Catch Block nicht im Stacktest.java anwenden will, kann man auch einfach die Subklasse RuntimeException erweiternt (extends RuntimeException).
public class StackUnderflow extends Exception{
    public StackUnderflow(String message) {
        super(message);
    }
}
