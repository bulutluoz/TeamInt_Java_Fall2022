package day38_exceptions;

import java.util.Random;

public class C02_MultipleExceptions {
    public static void main(String[] args) {

        String str= "Java";

        int[] arr = {3,4,6,8,9};

        // 0'dan 10'a kadar rastgele bir sayi uretip
        // str ve arr'deki o index'e sahip elementleri yazdiralim

        Random rnd= new Random();
        int rastgeleSayi= rnd.nextInt(10);

        System.out.println(rastgeleSayi);
        /*  1.ihtimal : ayri ayri try catch blogu kullanmak
        try {
            System.out.println(str.substring(rastgeleSayi,rastgeleSayi+1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index String'in sinirlari disinda");
        }

        try {
            System.out.println(arr[rastgeleSayi]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Array'in sinirlari disinda");
        }

         */

        /* 2.ihtimal olusabilecek tum exception'lari yakalama kapasitesi olan
        bir exception kullaniriz
        Ancak bu durumda hatanin kaynagini net olarak bilemeyiz
        try {

            System.out.println(str.substring(rastgeleSayi,rastgeleSayi+1));
            System.out.println(arr[rastgeleSayi]);

        } catch (Exception e) {
            System.out.println("Beklenmedik bir durum olustu");
        }

         */

        /*
        3. ihtimal 1 tane try, birden fazla catch blogu olustururuz
         */


        try {
            System.out.println(str.substring(rastgeleSayi,rastgeleSayi+1));
            System.out.println(arr[rastgeleSayi]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index Array'in sinirlari disinda ");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("index String'in sinirlari disinda ");
        }
    }
}
