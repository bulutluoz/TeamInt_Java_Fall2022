package day15_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {

        /*
         Kullanicidan toplanmak uzere sayilar isteyin
         toplam 500 olur veya gecerse
         toplami yazdirin
         */

        Scanner scan= new Scanner(System.in);
        int sayi=0;
        int toplam=0;

        /*
        for (int i = 0; i <1000 ; i++) {
            System.out.println("Lutfen toplamak uzere sayi girin");
            sayi= scan.nextInt();
            toplam +=sayi;
            if (toplam>=500){
                break;
            }
        }

        System.out.println("girilen sayilarin toplam :  "+ toplam) ;

         */

        while (toplam<=500){
            System.out.println("Lutfen toplamak uzere sayi girin");
            sayi= scan.nextInt();
            toplam +=sayi;
        }

        System.out.println("girilen sayilarin toplam :  "+ toplam);

        /*
        adim sayisi belli ise veya
        bitis sarti, artim yaptigimiz degisken ile ilgiliyse
        for loop tercih edilebilir

        bitis sarti, artim yapilan degiskenle degil
        baska bir degiskenle ilgili ise
        bu durumda while loop daha avantajlidir.
         */
    }
}
