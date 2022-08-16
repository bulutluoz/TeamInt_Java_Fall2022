package day16_scope;

public class C02_Scope {
    /*
      Tum class'da gecerli olmasini istedigimiz variable'lari
      class level'da olustururuz.

      class level'da 2 tur variable olusturabiliriz
      1- static variables (class variables)    -- statik olan
      2- instance variables (object variables) -- statik olmayan

      KURAL 1-  Static variable'lar class icerisinde her yerden kullanilabilir
               instance variable'lar static method'lardan kullanilamaz
      KURAL 2- Static veya instance varible'lara deger atama zorunlulugu yoktur.
               Class level variable'lara biz deger atamazsak
               Java onlara tanimlanan default degerleri atama yapar
               bu default degerler
               sayisal variabler icin 0
               char hiclik
               boolean false
               String null dir

     */

    static int sayi=10;
    static boolean olduMu;
    static int a;
    static char b;
    static String str2;
    String str="Java";
    char krk;


    public static void main(String[] args) {
        System.out.println(sayi);
        //System.out.println(str);
        System.out.println(olduMu); // false
        System.out.println(a); // 0
        System.out.println(b); //     hiclik
        System.out.println(str2); // null
    }

    public static void digerMethod(){
        System.out.println(sayi);
        //System.out.println(str);
    }

    public void staticOlmayanMethod(){
        System.out.println(sayi); // 10
        System.out.println(str); // Java
        System.out.println(krk); // hiclik
    }


}
