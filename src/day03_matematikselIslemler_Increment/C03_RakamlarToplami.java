package day03_matematikselIslemler_Increment;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan 4 basamakli pozitif bir tamsayi alip
        // rakamlar toplamini bulalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt(); // ornegin 1469 olsun
        int orjinalSayi=girilenSayi;


        /*
          Bu soruyu ileride loop ile yapacagiz
          ama simdilik ayni islemi basamak sayisi kadar
          kendimiz tekrar ettirecegiz
         */

        /*
         Java'da bir kod yazmaya baslamadan once
         algoritmayi tasarlayip
         ihtiyacimiz olan variable'lari olusturmaliyiz
         */

        int birlerBasmagi=0;
        int rakamlarToplami=0;

        // sayi : 1469 , birlerBasamagi=0 , rakamlarToplami=0

        birlerBasmagi=girilenSayi%10; // 9
        rakamlarToplami=rakamlarToplami+birlerBasmagi; // 0+9=9
        girilenSayi = girilenSayi/10; // 146

        // sayi : 146 , birlerBasamagi=9 , rakamlarToplami=9

        birlerBasmagi=girilenSayi%10; // 6
        rakamlarToplami=rakamlarToplami+birlerBasmagi; // 9+ 6=15
        girilenSayi = girilenSayi/10; // 14

        // sayi : 14 , birlerBasamagi=6 , rakamlarToplami=15

        birlerBasmagi=girilenSayi%10; // 4
        rakamlarToplami=rakamlarToplami+birlerBasmagi; // 15+4=19
        girilenSayi = girilenSayi/10; // 1

        // sayi : 1 , birlerBasamagi=4 , rakamlarToplami=19

        birlerBasmagi=girilenSayi%10; // 1
        rakamlarToplami=rakamlarToplami+birlerBasmagi; // 19+1=20
        girilenSayi = girilenSayi/10; // 0,1==> 0



        System.out.println("Girdiginiz sayi : " + orjinalSayi + " sayinin rakamlar toplami : " + rakamlarToplami);
    }
}
