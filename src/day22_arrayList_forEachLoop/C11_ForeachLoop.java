package day22_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C11_ForeachLoop {
    public static void main(String[] args) {

        /*
        Verilen bir String array'de
        Her bir elementi kontrol edip
        kelimenin uzunlugu cift sayi ise ilk yarisi,
        kelimenin uzunlugu tek sayi ise
        ortadaki harf dahil ikinci yarisini yeni bir listeye ekleyip yazdiralim
         */

        String[] arr = {"Fatih", "Muhammet","Bora", "Seher"};
        List<String> yeniList=new ArrayList<>();

        for (String each:arr
             ) {

            if (each.length()%2==0){ // ciftse

                yeniList.add(each.substring(0,each.length()/2));

            }else{//tekse

                yeniList.add(each.substring((each.length()-1)/2));
            }
        }

        System.out.println(yeniList);
    }
}
