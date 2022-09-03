package day29_dateTime_varargs;

public class C14_SB {

    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java Guzeldir");

        sb1.substring(5);
        // String class'indan calisir dolayisiyla immutable olur

        System.out.println(sb1.substring(5)); // Guzeldir

        // sb1= sb1.substring(5); farkli data turu oldugundan atamayi kabul etmez

        System.out.println(sb1); // Java Guzeldir


        // SB'da contains yok
        // sb1 Java iceriyor mu ?

        System.out.println(sb1.toString().contains("Java")); // true

        /*
          String Builder'da olmayip String'de olan ozellik varsa
          toString() ile String'e cevirir, sonra String method'larini kullanabilirriz
         */
    }
}
