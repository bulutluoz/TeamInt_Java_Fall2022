package day29_dateTime_varargs;

public class C06_Varargs {

    public static void main(String[] args) {
            /*
      Java'da varargs icerisine birden fazla element alabilen
      array altyapisini kullanan bir objedir

      int... yazdigimizda java bunun bir varargs oldugunu anlar
      ve vararg'in yapisi geregi kac tane sayi yazarsak yazalim
      varargs kabul eder
     */

        topla(3,4); // int[] a=[3,4] = 7
        topla(3,4,5); // int[] a=[3,4,5] = 12
        topla(3,4,5,6,7); // int[] a=[3,4,5,6,7] = 25
        topla(3,5,7,9,7,5,4,1,2);// = 43
    }

    public static void topla(int... a) {
        int toplam=0;
        for (int each: a
             ) {
            toplam+=each;
        }

        System.out.println("Verilen sayilarin toplami : " + toplam);
    }
}
