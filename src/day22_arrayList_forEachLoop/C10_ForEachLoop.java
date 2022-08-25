package day22_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C10_ForEachLoop {
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
        List<String> yeniList=new ArrayList<>();

        for (String each:liste
             ) {

            if (!each.contains(istenmeyenHarf)){
                yeniList.add(each);
            }
        }

        System.out.println(yeniList);
    }
}
