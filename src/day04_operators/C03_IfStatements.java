package day04_operators;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        // Kullanicidan bir sayi isteyin,
        // sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();


        if (girilenSayi % 5==0){
            System.out.println("Sayi 5 'in tam kati");
        }


    }
}
