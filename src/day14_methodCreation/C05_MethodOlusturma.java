package day14_methodCreation;

public class C05_MethodOlusturma {
    public static void main(String[] args) {

        /*
         verilen sayilari carpim method'unda carpmak
         ve sonucu dondurmek istiyoruz

         kullanici 2,3 veya 4 parametre girdiginde,
          girilen tum sayilari carpip, sonucu bize donduren
          ayni isimde 3 farkli method olusturun

         */

        // iki sayinin carpimini yazdiralim
        System.out.println(carpim(3.4,2.3)); // 7.819999999999999

        // uc sayinin carpini yazdiralim

        System.out.println(carpim(2.3,4.5,5.6)); // 57.959999999999994
        /*
          method call'da yazdigimiz degerlere argument,
          method'da kullanilan degiskenlere ise parametre denir
          Siz bir method call yaptiginizda
          java argument'lerle parametre'lerin uyumunu kontrol eder
          uyumluysa calistirir, yoksa CTE verir

         */

        // 4 sayinin carpimini yazdiralim
        System.out.println(carpim(2,3,4,5)); // 120.0


        /*
          Bir class'da ayni isimde farkli method'lar olusturulabilir.
          bunun icin ya
          farkli sayida parametre kullanilmali
          veya parametrelerin data turleri degistirilmeli
          buna java'da OVERLOADING denir.

          Java ayni isim ve ayni sayida parametresi olan method'lardan
           hangisini kullanacagina karar verirken, tum method'lari inceler
           %100 uyumlu bulursa onu kullanir
           %100 uyumlu yoksa calisabilecek olanlardan
           en az casting ile calisacak olani tercih eder
         */

        System.out.println(carpim(2,3)); // int int 6
        System.out.println(carpim(2,3.4)); // double double 6.8
        System.out.println(carpim(3,4,5)); // double double double 60.0
    }

    public static double carpim(double sayi1, double sayi2){

        return sayi1*sayi2;
    }
    public static int carpim(int sayi1, int sayi2){

        return sayi1*sayi2;
    }

    public static double carpim(double sayi1, double sayi2,double sayi3){

        return sayi1*sayi2*sayi3;
    }

    public static double carpim(double sayi1, double sayi2,double sayi3,double sayi4){

        return sayi1*sayi2*sayi3*sayi4;
    }
}
