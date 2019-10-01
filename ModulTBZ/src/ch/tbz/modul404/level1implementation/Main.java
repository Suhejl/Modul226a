package ch.tbz.modul404.level1implementation;

public class Main {
    public static void referenceCheck(Object x, Object y) {
        if (x == y) {
            System.out.println("Both pointing to the same reference");

        } else {
            System.out.println("Both are pointing to different reference");
        }
    }

    public static void main(String[] args) {
      /*  String string1 = "bobby";
        System.out.println(string1.hashCode());
        string1 = "bobbbby";
        System.out.println(string1.hashCode());
        StringBuilder stringBuilder = new StringB§uilder(string1);
        stringBuilder.append("y");
        System.out.println(string1.hashCode());
        string1 = stringBuilder.toString();
        System.out.println(string1.hashCode());
        System.out.println(stringBuilder.hashCode());*/


        String st1 = "Java";
        String st2 = "Java";
        System.out.println("Before Modification in st1");
        System.out.println("Hashcode of " + st1 + ": " + st1.hashCode());
        System.out.println("Hashcode of " + st2 + ": " + st2.hashCode());
        referenceCheck(st1, st2);
        st1 += "ava";
        System.out.println("After Modification");
        System.out.println("Hashcode of " + st1 + ": " + st1.hashCode());
        System.out.println("Hashcode of " + st2 + ": " + st2.hashCode());
        referenceCheck(st1, st2);
        StringBuilder stringBuilder = new StringBuilder(st1);
        System.out.println("Stringbuilder");
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append("aaa");
        System.out.println(stringBuilder.hashCode());

    }
}

