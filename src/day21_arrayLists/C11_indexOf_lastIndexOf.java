package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C11_indexOf_lastIndexOf {
    public static void main(String[] args) {


        List<String> liste=new ArrayList<>();
        liste.add("Fatih");
        liste.add("Esra");
        liste.add("Levent");
        liste.add("Esra");
        liste.add("Seher");

        System.out.println(liste.indexOf("Esra")); // 1

        System.out.println(liste.lastIndexOf("Esra")); // 3




    }
}
