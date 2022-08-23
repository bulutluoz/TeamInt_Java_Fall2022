package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C07_size_get {
    public static void main(String[] args) {


        List<String> liste=new ArrayList<>();
        liste.add("Fatih");
        liste.add("Levent");
        liste.add("Esra");
        liste.add("Seher");

        // size() method'u listenin uzunlugunu verir

        System.out.println(liste.size()); // 4

        // listedeki her hangi bir index'deki elemente ulasmak istersek

        System.out.println(liste.get(2)); // esra
        System.out.println(liste.get(1)); // Levent
        // add(index,istenenDeger)
        // eski listeden hic bir element silmeden
        // istedigimiz elementi istedigimiz index'e koyar
        // sonraki elementler bir geriye kayar
        System.out.println("add'den once "+liste); // [Fatih, Levent, Esra, Seher]
        liste.add(2,"Ayse");
        System.out.println("add'den sonra "+liste); // [Fatih, Levent, Ayse, Esra, Seher]


        // set method'u ise istenen index'deki eski elementi silip
        // yerine yeni elementi ekler
        // update

        liste.set(2,"Yasar");
        System.out.println("set'den sonra "+liste); // [Fatih, Levent, Yasar, Esra, Seher]



    }
}
