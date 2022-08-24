package day22_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {

        /*
          Verilen String bir listede istenmeyen harf iceren elementleri
          silip, kalani kismini bize donduren bir method olusturun.
         */

        List<String> liste=new ArrayList<>();
        liste.add("Eyup");
        liste.add("Yahya");
        liste.add("Esra");
        liste.add("Seher");

        String istenmeyenHarf="a";

        liste=istenmeyenleriSil(liste,istenmeyenHarf);
        System.out.println(liste);

    }

    public static List<String> istenmeyenleriSil(List<String> liste, String istenmeyenHarf) {

        List<String> geciciListe=new ArrayList<>();

        for (int i = 0; i < liste.size() ; i++) {

            if (!liste.get(i).contains(istenmeyenHarf)){
               geciciListe.add(liste.get(i));
            }
        }

        return geciciListe;
    }
}
