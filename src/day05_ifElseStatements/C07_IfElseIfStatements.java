package day05_ifElseStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {
    public static void main(String[] args) {
        /*
        Soru 4- Kullanicidan mesafeyi kilometre olarak alin
        ve cevirmek istedigi birimi sorun,
        istedigi birim metre veya santimetre ise cevirip yazdirin,
        yoksa “istediginiz birim sisteme kayitli degil” yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Cevirmek istediginiz mesafeyi km olarak yazin");
        int mesafeKm= scan.nextInt();
        System.out.println("Cevirmek istediginiz birimi secin " +
                "\nM : Metre \nS : Santimetre");
        char tercih=scan.next().charAt(0);

        if (tercih=='M' || tercih=='m'){
            System.out.println("Girilen mesafenin metre olarak karsiligi : " + mesafeKm*1000);
        } else if (tercih=='S' || tercih=='s') {
            System.out.println("Girilen mesafenin santimetre olarak karsiligi : " + mesafeKm*100000);
        }else {
            System.out.println("istediginiz birim sisteme kayitli degil");
        }
    }
}
