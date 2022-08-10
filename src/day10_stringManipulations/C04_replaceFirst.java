package day10_stringManipulations;

public class C04_replaceFirst {

    public static void main(String[] args) {

        String str = "Herkesin github'i olmali";

        System.out.println(str.replaceFirst("e", "a"));
        // Harkesin github'i olmali

        System.out.println(str.replaceFirst("\\w","1"));
        // 1erkesin github'i olmali
    }
}
