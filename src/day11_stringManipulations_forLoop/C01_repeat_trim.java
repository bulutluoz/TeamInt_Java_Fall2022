package day11_stringManipulations_forLoop;

public class C01_repeat_trim {
    public static void main(String[] args) {
        String str= "Java Candir";

        System.out.println(str.repeat(4));
        // Java CandirJava CandirJava CandirJava Candir

        str= "   Ali kos   ";

        str=str.trim();

        System.out.println(str); // Ali kos
    }
}
