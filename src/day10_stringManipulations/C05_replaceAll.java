package day10_stringManipulations;

public class C05_replaceAll {
    public static void main(String[] args) {
        /*
          replace(eskiString, yeniString) yazdigimizda
          zaten eskiString ile ayni olan tum metinleri
          yeniString ile degistiriyordu
         */


        String str= "Ja1va Gu2zel2dir13.";

        // eger metin'deki rakamlardan kurtulmak istersek
        // 3 kere replace yapmamiz gerekir

        str=str.replace("1","");
        str=str.replace("2","");
        str=str.replace("3","");

        System.out.println(str); // Java Guzeldir.

        str="J1a2va3 G4u5z6e7l8d9i0r.";

        /*
          replaceAll method'u tek tek String'leri degil de
          tum sayilari, tum bosluklari, tum harfleri...
          gibi ortak ozellikle tanimlanabilecek karakterin hepsini
          toptan degistirmek icin kullanilir
         */

        // ornegin yukarida metin'de tum rakamlardan tek seferde kurtulalim

        str=str.replaceAll("\\d","");
        System.out.println(str); // Java Guzeldir.


        str="Java    Guzel bir programlama    dili";
        // eger birden fazla bosluk olan yerleri halletmek istersek

        str=str.replaceAll("\\s+"," ");
        System.out.println(str); // Java Guzel bir programlama dili


    }
}
