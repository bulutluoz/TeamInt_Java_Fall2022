package day06_nestedIfElse_Ternary;

import java.util.Scanner;

public class C03_NestedIfElse_Emeklilik1 {

    public static void main(String[] args) {
         /*
        Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

         */

        /*
        Eger degisken sayimiz birden fazla ise
        once degiskenlerden birine gore temel iskeleti kuralim
        ornegin bu soruda cinsiyet'e gore yapalim
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Kadin icin K, Erkek icin E giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz ");
        double yas=scan.nextDouble();

        if (cinsiyet=='K'){ // Kadin blogu
            if (yas<0){
                System.out.println("Yas sifirdan kucuk olamaz");
            } else if (yas<60) {
                System.out.println("emekli olamazsin, daha " + (60-yas) + " yil calisman gerekir");
            }else{
                System.out.println("Emekli olabilirsin");
            }

        }else if (cinsiyet=='E'){ // Erkek Blogu
            if (yas<0){
                System.out.println("Yas sifirdan kucuk olamaz");
            } else if (yas<65) {
                System.out.println("emekli olamazsin, daha " + (65-yas) + " yil calisman gerekir");
            }else{
                System.out.println("Emekli olabilirsin");
            }


        }else {
            System.out.println("Giris bilgilerini kontrol edin");
        }
    }
}
