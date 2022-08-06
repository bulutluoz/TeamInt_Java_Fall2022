package day07_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenar uzunluklarini girin");
        int kenar1=scan.nextInt();
        int kenar2= scan.nextInt();
        int kenar3= scan.nextInt();

        System.out.println(kenar1 == kenar2 && kenar2 == kenar3 ? "Eskenar ucgen" : "Eskenar degil");

    }
}
