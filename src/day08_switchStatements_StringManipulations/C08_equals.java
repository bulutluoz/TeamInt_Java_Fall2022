package day08_switchStatements_StringManipulations;

import java.util.Scanner;

public class C08_equals {
    public static void main(String[] args) {
        /*
          Kullanicidan gun ismini alin
          ve girilen gun ismine gore

          hafta ici veya hafta sonu yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi= scan.next();
        String gun = gunIsmi.toLowerCase();

        if (gun.equals("pazartesi")||gun.equals("sali") || gun.equals("carsamba") ||
            gun.equals("persembe")|| gun.equals("cuma")) {
            System.out.println("hafta ici");
        }else if (gun.equals("cumartesi")||gun.equals("pazar")){
            System.out.println("Hafta sonu");
        }else {
            System.out.println("gecersiz gun ismi");
        }
    }
}
