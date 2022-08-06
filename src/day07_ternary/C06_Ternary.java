package day07_ternary;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
        // Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        // 5 ==>5   -6 ==> -1* -6 =6

        sayi= sayi>=0 ? sayi : -1*sayi ;

        System.out.println("Girilen sayinin mutlak degeri : " + sayi);

    }
}
