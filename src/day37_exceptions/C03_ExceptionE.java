package day37_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_ExceptionE {

    public static void main(String[] args) {
        /*
        kullanicidan bir tamsayi isteyin
        kullanici tam sayi girerse karesini yazdirin
        kullanici tamsayi disinda bir deger girdiginde
        hata mesaji verip yeniden deger isteyin

        kullanici tamsayi girene kadar islem devam etsin
         */


        /*
           try/catch blogundaki e yazdigimiz exception turunde
           bir exception yalkalinirsa store edecegimiz variable ismidir
           ismi e olmak zorunda degildir ancak genel kullanim e seklindedir

           e objesi ile kullaniciya throwable class'inda olusturulan
           hazir exception messajlari yazdirilabilir
           veya biz e'yi kullanmadan istedigimiz exception messajini yazdirabiliriz
         */

        Scanner scan;
        boolean tekrar=true;
        int girilensayi=0;


        while(tekrar){
            scan = new Scanner(System.in);
            System.out.println("Lutfen bir tamsayi giriniz");

            try {
                girilensayi= scan.nextInt();
                break;
            } catch (InputMismatchException e) {
                // System.out.println(e.getMessage()); // null
                // System.out.println(e.toString()); // java.util.InputMismatchException
                // e.printStackTrace(); // uzun hata mesaji

                System.out.println("Adam gibi tamsayi degeri girsene");
            }
        }

        System.out.println("girilen sayinin karesi : " + girilensayi*girilensayi);

    }
}
