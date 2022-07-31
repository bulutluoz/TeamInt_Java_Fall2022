package day02_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {
        // Kullanicidan bir sayi alip, sayinin kupunu yazdiralim
        // 1.adim : Scanner objesi olusturmak
        Scanner scan = new Scanner(System.in);
        // 2. kullanicidan ne istedigimizi kullaniciya soyleyelim
        System.out.println("Lutfen bir tamsayi giriniz");
        // 3. adim : istedigimiz datayi koyabilecegimiz bir variable olusturup
        //           kullanicinin girdigi degeri uygun method'la alalim
        //           ve olusturdugumuz variable'a atayalim

        int girilenSayi= scan.nextInt();
        System.out.println("Girdiginiz sayinin kupu : " + (girilenSayi*girilenSayi*girilenSayi));



    }
}
