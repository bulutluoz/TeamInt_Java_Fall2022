package day22_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_sublist {
    public static void main(String[] args) {


        List<String> liste=new ArrayList<>();
        liste.add("Eyup");
        liste.add("Yahya");
        liste.add("Esra");
        liste.add("Seher");

        System.out.println(liste.subList(1, 3)); // [Yahya, Esra]
    }
}
