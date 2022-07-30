package day01_variables;

public class C02_DataTurleri {

    public static void main(String[] args) {

        boolean emekliOlurMu= false;


        emekliOlurMu=true;

        /*
        boolean sadece true veya false degerini alir
        true veya false direk yazilir , ' ' veya " " icine alinmaz
         */


        char harf='e';
        char sayi='3';
        char karakter='#';

        /*
        char harfler='asd';
        char sayilar="2";

        char veri turundeki variable'lar 'tek tirnak icinde' yazilmalidir
        ve sadece 1 karakter olmalidir
         */

        float floatSayi=2.3f;
        double doubleSayi=4.555;

        doubleSayi=20;
        /*
        20 degerini dusunursek variable turunu int, short,byte yapabiliriz
        dolayisiyla bir variable'in data turune karar verirken
        o an atanan degere degil
        hangi degerleri alabilecegine bakmak gerekir.
         */

        // verilen 3 tamsayinin ortalamasini hesaplayan bir program yazin

        int sayi1=11;
        int sayi2=23;
        int sayi3=7;

        System.out.println((sayi1+sayi2+sayi3)/3);  // 41/3= 13,666666
        // sayilar int oldugundan java sonucu int verir
        // yuvarlama yapmaz, vigulden sonrasini atar

        // Bu durumda her ne kadar girilen sayilar tam sayi olsa da
        // ortalama hesaplayan bir programi float veya double ile yapmak
        // daha mantikli olacaktir

        float sayi4=11f;
        float sayi5=23f;
        float sayi6=7f;

        System.out.println((sayi4+sayi5+sayi6)/3); // 13.666667


        double sayi7=11;
        double sayi8=23;
        double sayi9=7;

        System.out.println((sayi7+sayi8+sayi9)/3); // 13.666666666666666

        // float ve double ile calisirken ondalikli kisimda onemsiz hatalar olabilir


        double sayi10=15;
        double sayi11=5;
        System.out.println(sayi10/sayi11); // 2.99999999999999999

    }
}
