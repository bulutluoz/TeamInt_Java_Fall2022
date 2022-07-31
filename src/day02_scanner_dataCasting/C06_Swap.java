package day02_scanner_dataCasting;

import java.util.Scanner;

public class C06_Swap {
    public static void main(String[] args) {
        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1. tamsayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("Lutfen 2. tamsayiyi giriniz");
        int sayi2= scan.nextInt();

        System.out.println("Girilen degerler sayi1 : " + sayi1 + ",sayi2: " + sayi2);



        int sayi3;

        sayi3=sayi2;


        sayi2=sayi1;


        sayi1=sayi3;

        System.out.println("Degisimden sonra sayi1 : " + sayi1 + ",sayi2: " + sayi2);
    }
}
