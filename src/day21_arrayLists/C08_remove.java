package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C08_remove {
    public static void main(String[] args) {

        List<String> liste=new ArrayList<>();
        liste.add("Fatih");
        liste.add("Levent");
        liste.add("Esra");
        liste.add("Seher");

        System.out.println(liste); // [Fatih, Levent, Esra, Seher]

        // remove 1- silme islemi icin obje yazilirsa,
        // objeyi siler ve bize boolean sonuc doner
        System.out.println(liste.remove("Fatih")); // true
        System.out.println(liste); // [Levent, Esra, Seher]

        System.out.println(liste.remove("Ahmet")); // false

        // remove 2- index ile silersek, bize silinen elementi dondurur

        System.out.println(liste.remove(1)); // Esra

        System.out.println(liste); //  [Levent, Seher]





    }
}
