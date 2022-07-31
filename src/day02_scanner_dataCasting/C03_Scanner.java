package day02_scanner_dataCasting;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");
        int tamsayi=scan.nextInt();

        System.out.println("Lutfen ondalikli bir sayi giriniz");
        double ondalikliSayi= scan.nextDouble();

        System.out.println("girilen sayilarin carpimi : " + tamsayi*ondalikliSayi);
        System.out.println("girilen sayilarin toplami : " + (tamsayi+ondalikliSayi));


    }
}
