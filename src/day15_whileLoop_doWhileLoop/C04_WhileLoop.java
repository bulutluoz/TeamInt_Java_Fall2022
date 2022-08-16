package day15_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C04_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan sifre isteyin
        asagidaki sartlari saglamayan sifrelerde
        hatalari yazdirip, kullanicinin yeni sifre girmesi isteyin

        Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        gecerli sifre yazilinca
        sifreniz basari ile kaydedildi yazdirin

        sartlar :
        - sifrenin ilk karakteri kucuk harf olmali
        - sifrenin son karakteri sayi olmali
         */

        Scanner scan = new Scanner(System.in);
        boolean sifreDogrumu=false;
        String sifre="";
        char ilkHarf;
        char sonHarf;

        while(!sifreDogrumu){ // sifreDogrumu==false

            System.out.println("Lutfen sifre giriniz");
            sifre= scan.nextLine();
            ilkHarf=sifre.charAt(0);
            sonHarf=sifre.charAt(sifre.length()-1);

            if (ilkHarf<'a' || ilkHarf>'z'){
                System.out.println("sifrenin ilk harfi kucuk harf olmali");

            }else if(sonHarf<'0' || sonHarf>'9'){
                System.out.println("sifrenin son karakteri rakam olmali");

            }else{
                System.out.println("Sifre basari ile kaydedildi");
                sifreDogrumu=true;
            }
        }

    }
}
