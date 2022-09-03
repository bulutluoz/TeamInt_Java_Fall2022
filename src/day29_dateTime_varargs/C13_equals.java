package day29_dateTime_varargs;

public class C13_equals {

    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Ali Can");

        StringBuilder sb2= new StringBuilder("Ali Can");

        String str="Ali Can";

        System.out.println(sb1==sb2); // false

        System.out.println(sb1.equals(sb2)); // false

        System.out.println(sb1.equals(sb1)); // true


        // System.out.println(sb1==str); farkli data turleri
        // oldugu icin Java CTE verir

        System.out.println(sb1.equals(str));  // false

        System.out.println(sb1.compareTo(sb2)); // 0



    }
}
