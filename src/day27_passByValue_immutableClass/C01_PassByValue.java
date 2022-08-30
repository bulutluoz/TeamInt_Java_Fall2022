package day27_passByValue_immutableClass;

public class C01_PassByValue {

    public static void main(String[] args) {

        /*
        Uygulama : Main method’da verilen fiyat degerine
        %10, %20 ve %30 indirim yaparak,
        indirimli fiyati bize döndüren 3 method olusturun.

        Main method’dan bu 3 method’u arka arkaya cagirip, return edilen fiyatlari yazdirin.
         */


        double fiyat=100;

        System.out.println(indirimYap10(fiyat)); // 90.0
        System.out.println(indirimYap20(fiyat)); // 80.0
        System.out.println(indirimYap30(fiyat)); // 70.0
        System.out.println(indirimYap20(fiyat)); // 80.0
    }

    public static double indirimYap10(double fiyat) {

        fiyat=fiyat*0.90;
        return fiyat;
    }

    public static double indirimYap20(double fiyat) {

        return fiyat*0.80;
    }

    public static double indirimYap30(double fiyat) {

        return fiyat*0.70;
    }

}
