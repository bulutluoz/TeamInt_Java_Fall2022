package day08_switchStatements_StringManipulations;

import java.util.Scanner;

public class C03_SwitchCase {

    public static void main(String[] args) {
        /*
          Kullanicidan gun ismini alin
          ve girilen gun ismine gore

          hafta ici veya hafta sonu yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi= scan.next();
        String gunIsmiKontrolIcin = gunIsmi.toLowerCase();
        /*
          String ifadeler case-sensitive'dir
          (buyuk - kucuk harf duyarlidir)
          Pazartesi, pazartesi, PAZARTESI, PAzartesi, ..... hep farkli String'lerdir
         */

        /*
          Kullanicinin girdigi degeri
          kodumuzu calistirmak ve dogru sonuclara ulasmak icin degistirebiliriz
          ama bu durumda kullanicinin girdigi deger degismis veya kaybolmus olur

          Kullanicinin girdigi degeri korumak icin,
          ikinci bir variable olusturup
          kodlarimizda ikinci variable'i kullanmak, degistirmek daha uygun olur
         */

        boolean tatilMi=false;

        switch (gunIsmiKontrolIcin){
            case "pazartesi" :
            case "sali" :
            case "carsamba" :
            case "persembe" :
            case "cuma" :
                System.out.println("hafta ici");
                break;
            case "cumartesi" :
            case "pazar" :
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("Gecersiz gun ismi");
        }


    }
}
