package day10_stringManipulations;

import java.util.Scanner;

public class C06_replaceAllSoru {
    public static void main(String[] args) {

        /*
          Kullanicidan ismini, soyismini ve kk numarasini alip
          asagidaki formatta kaydedip, yazdiralim

          M***** T****
          1234  **** **** ****
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Isminiz giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen Soyisminiz giriniz");
        String soyisim= scan.nextLine();
        System.out.println("Lutfen KK numaranizi giriniz");
        String kkNo= scan.nextLine();

        String yeniIsim =   isim.substring(0,1).toUpperCase()+
                            isim.substring(1).replaceAll("\\w","*")+
                            " "+
                            soyisim.substring(0,1).toUpperCase()+
                            soyisim.substring(1).replaceAll("\\w","*");
        String yeniKkNo= kkNo.substring(0,4)+ " **** **** ****";

        System.out.println(yeniIsim +"\n"+yeniKkNo);


    }
}
