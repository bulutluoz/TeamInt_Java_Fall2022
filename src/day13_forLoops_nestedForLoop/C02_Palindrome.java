package day13_forLoops_nestedForLoop;

import java.util.Scanner;

public class C02_Palindrome {
    public static void main(String[] args) {
        /*
          Tersten okunusu orjinal metnin okuyusu ile ayni olan metin'lere palindrome denir
          Kullanicidan bir cumle veya sayi alin
          palindrome olup olmadigini kontrol edip yazdirin
         */

        // Kullanicidan bir String alip tersten yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir cumle veya sayi giriniz");
        String cumle= scan.nextLine();

        String tersCumle="";

        for (int i = cumle.length()-1; i >=0 ; i--) {

            tersCumle += cumle.charAt(i);
        }

       if (cumle.equalsIgnoreCase(tersCumle)){
           System.out.println("Girdiginiz metin palindrome");
       }else {
           System.out.println("Girdiginiz metin palindrome degil");
       }

    }
}
