package day27_passByValue_immutableClass;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValue {

    public static void main(String[] args) {
        /*
        Uygulama : Main method’da bir list olusturup elemanlar atayalim.

        2 method olusturup once listeyi, sonra listedeki elemanlari degistirelim.

        - ilk method’da bizim listemiz disinda bir liste olusturup deger atayalim,
        sonra yeni listeyi bizim asil listemize atayalim ve asil listemizi main method’a dondurelim.

        - ikinci method’da bizim listemizin elementlerini degistirip,
        asil listemizi main method’a dondurelim.

        Her iki method call’dan sonra listemizi main method’da yazdirip, degisimi kontrol edin.
         */

        List<Integer> sayilar=new ArrayList<>();
        sayilar.add(1);
        sayilar.add(2);

        System.out.println(listeyiDegistir(sayilar)); // [11, 12, 13]

        System.out.println("1.method call'dan sonra asil liste : " + sayilar); //  [1, 2]


        System.out.println(elementleriDegistir(sayilar)); // [101, 102]

        System.out.println("2.method call'dan sonra asil liste : " + sayilar); //  [101, 102]


    }

    public static List<Integer> elementleriDegistir(List<Integer> sayilar) {

        sayilar.set(0,101);
        sayilar.set(1,102);

        return sayilar;
    }

    public static List<Integer> listeyiDegistir(List<Integer> sayilar) {

        List<Integer> yeniList=new ArrayList<>();
        yeniList.add(11);
        yeniList.add(12);
        yeniList.add(13);

        sayilar=yeniList;

        return sayilar;
    }
}
