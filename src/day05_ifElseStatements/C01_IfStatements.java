package day05_ifElseStatements;

import java.util.Scanner;

public class C01_IfStatements
{

    public static void main(String[] args) {
        // basit if cumleleri ile ilgili ornek
        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");

        double not= scan.nextDouble();

        if (not>=50){
            System.out.println("Sinifi gectin");
        }
        if (not<50){
            System.out.println("Maalesef kaldin");
        }
    }
}
