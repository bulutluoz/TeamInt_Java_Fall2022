package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C09_IntegerRemove {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(15);
        sayilar.add(20);
        sayilar.add(2);

        System.out.println(sayilar); // [10, 15, 20, 2]

        // eger listemiz integer ise java remive method'unda
        // obje ve index secme karisabilir
        // java sayi yazdigimizda direk index olarak kabul eder

        sayilar.remove(2);
        System.out.println(sayilar);// [10, 15, 2]

        // eger silmek icin 10 yazarsak exception olusur
        // sayilar.remove(10);

        // illa da objeyi vererek remove yapmak istersek
        // once br variable olusturup o degeri atamali sonra variable ile remove kullanmaliyiz

        Integer silinecek=10;
        sayilar.remove(silinecek);
        System.out.println(sayilar); // [15, 2]

        sayilar.clear(); // tum listeyi temizler
        System.out.println(sayilar); // []


    }
}
