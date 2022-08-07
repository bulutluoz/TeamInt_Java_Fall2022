package day08_switchStatements_StringManipulations;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        // Soru 6- Kullanicidan ay ismini alip mevsimi yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Ay ismini yaziniz");
        String girilenAyIsmi= scan.next();

        // kullanici ay ismini farkli sekillerde yazabilecegi icin
        // biz girilen degeri standartlastirmak icin
        // yeni bir variable'a kucuk harf olarak atayalim

        String ayIsmi= girilenAyIsmi.toLowerCase();

        switch (ayIsmi){
            case "aralik" :
            case "ocak" :
            case "subat"  :
                System.out.println("Girdiginiz " + girilenAyIsmi + " ayi kis mevsiminde");
                break;
            case "mart" :
            case "nisan" :
            case "mayis"  :
                System.out.println("Girdiginiz " + girilenAyIsmi + " ayi ilkbahar mevsiminde");
                break;
            case "haziran" :
            case "temmuz" :
            case "agustos"  :
                System.out.println("Girdiginiz " + girilenAyIsmi + " ayi yaz mevsiminde");
                break;
            case "eylul" :
            case "ekim" :
            case "kasim"  :
                System.out.println("Girdiginiz " + girilenAyIsmi + " ayi sonbahar mevsiminde");
                break;
            default:
                System.out.println("gecersiz ay ismi");
        }

    }
}
