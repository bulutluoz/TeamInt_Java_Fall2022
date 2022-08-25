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

        sayilar.remove(2);
        System.out.println(sayilar);// [10, 15, 2]

        Integer silinecek=10;
        sayilar.remove(silinecek);
        System.out.println(sayilar); // [15, 2]

        sayilar.clear(); // tum listeyi temizler
        System.out.println(sayilar); // []


    }
}
