package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayListOlusturma {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        /*
        List interface'dir ve interface'lerden obje olusturulamaz
        bundan dolayi esitligin saginda List<>() kullanamayiz
        Sag tarafda List yerine onun child class'i olan ArrayList<>() kullaniriz
         */


        System.out.println(sayilar); // [] bos liste

        // bir ArrayList'e elementleri tek tek eklememiz gerekir

        sayilar.add(24);
        sayilar.add(32);
        sayilar.add(10);

        System.out.println(sayilar); // [24, 32, 10]



    }
}
