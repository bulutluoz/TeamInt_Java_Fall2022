package day38_exceptions;

import java.util.Random;

public class C02_MultiExceptions {
    public static void main(String[] args) {

        /*
          Kodumuzu yazarken exception olusma ihtimali olan bolum sayisi
          birden fazla ise

          exception'larin turlerine bakilir

          Eger exception'lar birbirleriyle ilgili degillerse
          riskli kod bloklarini ayri ayri try catc bloguna alabiliriz
          veya tek bir try birden fazla catch blogu kullanabiliriz

          exception'lar birbiriyle ilintili olmadigindan
          hangisini once yazdigimizin bir onemi yoktur

          ANCAK su nokta unutulmamalidir
          Java try blogunu calistirirken
          ilk buldugu exception'da try blogunu calistirmayi durdurur
          try blogundaki bazi kodlar CALISMAYABILIR
         */


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
