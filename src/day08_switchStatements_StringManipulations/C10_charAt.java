package day08_switchStatements_StringManipulations;

public class C10_charAt {
    public static void main(String[] args) {

        /*
          String'in herhangi bir indeksindeki char degerini bize verir
         */

        String str= "Java Candir";

        System.out.println(str.charAt(0)); // J
        System.out.println(str.charAt(3)); // a
        System.out.println(str.charAt(10)); // r




        // System.out.println(str.charAt(20)); // StringIndexOutOfBoundsException
        // eger var olmayan bir index'deki karakteri istersek
        // java hata verir, index sinirlarin disinda der

        /* str = 20;
        str.charAt(20);
        Java olusan hatalari ya compile sirasinda anlar (CTE)
        veya syntax acisindan sorun olmadigindan ancak calistirinca hatayi farkeder (RTE)
         */

        // Bu str icin uzunluk 11'dir
        // sondan 2.karakteri

        System.out.println(str.charAt(11-2)); // i

    }
}
