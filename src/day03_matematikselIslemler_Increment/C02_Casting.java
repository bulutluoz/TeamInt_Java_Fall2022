package day03_matematikselIslemler_Increment;

import java.util.Scanner;

public class C02_Casting {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan iki double sayi alin,
        // ilk sayiyi ikinci sayiya bolun ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki ondalikli sayi girin, \narada ENTER'a basin");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        int sonuc= (int)(sayi1/sayi2);
        System.out.println("Bolme isleminin tamsayi kismi : " + sonuc);
    }
}
