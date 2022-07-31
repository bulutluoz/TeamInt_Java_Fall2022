package day02_scanner_dataCasting;

public class C08_Datacasting {
    public static void main(String[] args) {

        double doubleSayi=23.4;

        int intSayi = (int)doubleSayi;
        System.out.println(intSayi); // 23

        // verilen 3 tamsayinin, ortalamasi yazdirin

        int sayi1=12;
        int sayi2=13;
        int sayi3=16;

        System.out.println((sayi1+sayi2+sayi3)/3); // 41/3 = 13.666666 ==> 13
        /*
          Eger islem yapilan tum sayilar int ise java sonucu da integer olarak verir
          ama sayilardan biri double olursa,sonucu genis olana otomatik cast eder
         */

        double sayi4=15;
        System.out.println((sayi1+sayi4)/2); // 27/2=13.5 ==> 13.5

        // verilen 3 tamsayinin ortalamasini double yazdirin

        System.out.println((double)((sayi1+sayi2+sayi3)/3));

        System.out.println(((double)sayi1+sayi2+sayi3)/3);







    }
}
