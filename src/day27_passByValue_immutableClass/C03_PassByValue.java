package day27_passByValue_immutableClass;

import java.util.Arrays;

public class C03_PassByValue {

    public static void main(String[] args) {

        /*
        ONEMLI NOT : Pass By Value method'a gonderilen obje ile ilgilidir
        eger gonderilen obje tek bir deger iceren primitive data turlerinden ise
        dogal olarak bu variable degismez


        Ancak method'a gonderilen obje, birden fazla deger barindiran
        list veya array gibi bir obje ise
        obje'nin kendisine yeni deger atamasi yapilmasi durumunda orijinal obje degismez

        fakat elementlere yapilan atamalar, objenin kendisi ile ilgili olmadigindan
        bu atamaya java izin verir.

        Bu bir istisna degil, kapsam disi durumdur.

         */
        // bir onceki soruda yapilan islemleri array icin yapalim

        int[] arr ={1,2,3};

        System.out.println(Arrays.toString(arrayiDegistir(arr))); // [10, 11, 12, 13, 14]
        System.out.println("Ilk method call'dan sonra : "+Arrays.toString(arr)); // [1, 2, 3]


        System.out.println(Arrays.toString(elementleriDegistir(arr))); // [5, 6, 7]
        System.out.println("Ikinci method call'dan sonra : "+Arrays.toString(arr)); // [5, 6, 7]

    }

    public static int[] elementleriDegistir(int[] arr) {

        arr[0]=5;
        arr[1]=6;
        arr[2]=7;

        return arr;
    }

    public static int[] arrayiDegistir(int[] arr) {

        int[] yeniArray={10,11,12,13,14};

        arr=yeniArray;

        return arr;
    }
}
