package day17_scope_arrays;

public class C01 {

    /*
      Java ile projeler olustururken
      her class'da main method olmasina gerek yoktur.

      Hatta bir projede class'larin buyuk cogunlugunda main method olmaz

      icinde main method olmayan class'lari
      objeler olusturmak icin
      veya faydali method'lari koyup
      ihtiyacimiz oldugunda calistirmak icin kullaniriz

      Obje olusturmak icin hazirlanan class'larda
      o objeye ait variable ve method'lar olur
      mesela bu class'i hemsire class'i yapalim
     */

    static String meslek = "Hemsire";
    String isim="Isim Atanmadi";
    String soyisim="Soyisim atanmadi";
    boolean aktifMi;

    public static void method1(){
        System.out.println("static method calisti");
    }

    public void method2(){
        System.out.println("static olmayan method calisti");
        isim="Recep";
        soyisim="Lejon";
        aktifMi=true;
    }

}
