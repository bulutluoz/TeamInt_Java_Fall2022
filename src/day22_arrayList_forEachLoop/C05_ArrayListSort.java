package day22_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C05_ArrayListSort {

    public static void main(String[] args) {

        /*
          verilen bir listeyi kucukten buyuge siralayin
         */

        List<String> liste=new ArrayList<>();
        liste.add("Eyup");
        liste.add("Yahya");
        liste.add("Esra");
        liste.add("Seher");

        Collections.sort(liste);

        System.out.println(liste);


    }
}
