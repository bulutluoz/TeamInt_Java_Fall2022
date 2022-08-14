package day14_methodCreation;

import java.util.Scanner;

public class C04_MethodOlusturma {

    public static void main(String[] args) {

        /*
         Kullanicidan main method icinde  isim ve soyismini alin
         Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip
         isim bosluk soyisim seklinde bize donduren bir method olusturun

         input : isim : Ali  soyisim :YILMAZ
         output : Ali Yilmaz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();

        // sadece yazdirmak istersek
        System.out.println(isimSoyisimBirlestir(isim,soyisim));

        // kaydetmek istersek
        String birlesmisIsim=isimSoyisimBirlestir(isim,soyisim);
        System.out.println("birlestirilmis isminiz : " + birlesmisIsim);

    }

    public static String isimSoyisimBirlestir(String isim, String soyisim){

        String birlesmisIsim= isim.substring(0,1).toUpperCase()+
                                isim.substring(1).toLowerCase()+
                                " "+
                                soyisim.substring(0,1).toUpperCase()+
                                soyisim.substring(1).toLowerCase();
        return birlesmisIsim;
    }
}
