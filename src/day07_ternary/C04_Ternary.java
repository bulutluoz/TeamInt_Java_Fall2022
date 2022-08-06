package day07_ternary;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        // Kullanicidan bir sayi isteyin
        // Kullanicinin girdigi sayiyi kontrol edip
        // sayi cift sayi ise 2 ile carpin
        // tek sayi ise 10 ile toplayin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();



        sayi=  sayi%2==0  ?  2*sayi  :  sayi+10 ;

       System.out.println("Girdiginiz sayiyi degistirdik, yeni deger : " + sayi );





    }
}
