package day39_exceptions;

public class C02_Final {

     static final int OKUL=111;


    public static void main(String[] args) {

        /*
         final keyword variable, method ve class icin kullanilabilir
         variable final olarak tanimlanirsa, o variable'a sonradan deger atanamaz

         method final olarak tanimlanirsa, override edilemez

         class final olarak tanimlanirsa, parent ilan edilemz

         finally blogu: try blogu ile kullanilir, exception olussa da olusmasa da calisir

         finalize () : Garbage collectorun calismasi icin on hazirlik yaparak
                       kullanilmayan objeleri toparlar
         */


        final int sayi= 10;

        System.out.println(sayi);

        System.out.println(Integer.MAX_VALUE);


    }

    public static final void method1(){


    }
}
