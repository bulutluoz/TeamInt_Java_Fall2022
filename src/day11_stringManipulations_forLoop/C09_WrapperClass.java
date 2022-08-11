package day11_stringManipulations_forLoop;

public class C09_WrapperClass {

    public static void main(String[] args) {
        /*
          String non-primitive oldugundan bircok faydali hazir method'u oldugunu gorduk
          primitive data turlerinin hazir method'lari olmaz

          java bu eksikligi gidermek icin
          primitive data turlerinin herbirine ozel Wrapper Class hazirlamistir
          Bu class'larda o data turu icin kullanabiloecegimiz bazi hazir methodlar olusturulmustur
         */

        String str="java muhtesem";

        int sayi=10;
        Integer sayiW= 20;
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.max(34,465)); // 465

        boolean kontrol=true;
        Boolean kont=false;
        String knt="false";
        boolean sonuc = Boolean.valueOf(knt);

        char chr='*';
        Character ch='p';
        char chr2=101;
        System.out.println(Character.valueOf(chr2)); // e
        System.out.println(Character.isDigit('5')); // true
        System.out.println(Character.isAlphabetic('9')); // false
        System.out.println(Character.isAlphabetic('a')); //true


    }
}
