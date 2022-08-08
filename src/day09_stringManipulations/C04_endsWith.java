package day09_stringManipulations;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {

     String str="Java cok guzel,cok.";

        System.out.println(str.endsWith("cok")); // false
        System.out.println(str.endsWith("cok.")); // true
        System.out.println(str.endsWith("")); // true

        /*
          kullanicidan bir mail alin
          - mail @ icermiyorsa "gecersiz mail"
          - mail @gmail.com icermiyorsa, "mail gmail olmali"
          - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
          yazdiralim
          eger bu hatalar yoksa "mailiniz basari ile kaydedildi" yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mail giriniz");
        String mail=scan.nextLine();

        if (!mail.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        } else {
            System.out.println("mailiniz basari ile kaydedildi");
        }

    }
}
