package day42_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // Tum elementleri Iterator ile 5 artiralim
        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()){
            lit.set((Integer)lit.next()+5);
        }

        System.out.println(sayilar);

        // list elementlerini sondan basa yazdirin
        // sondan basa yazdirmak icin once sona gitmeliyiz
        // ancak ustteki loop'tan dolayi iterator zaten en sonda

        while(lit.hasPrevious()){
            System.out.print(lit.previous()+ " ");
        }

        System.out.println("");


        // degeri 20 ile 40 arasinda olanlari silin

        while(lit.hasNext()){

            int yukluSayi=(Integer)lit.next();

            if (yukluSayi>20 && yukluSayi<40){
                lit.remove();
            }
        }

        System.out.println(sayilar);
    }
}
