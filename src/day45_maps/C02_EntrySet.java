package day45_maps;

import day44_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C02_EntrySet {
    public static void main(String[] args) {
        // Tum ogrencilerin bilgilerini bir liste seklinde kullanicilara yazdirin
        // No isim Soyisim Sinif Sube Bolum
        // 101-
        /*
        {101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Yan-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}
         Java Map'lerde key ve value'yu birlikte manipule(isleme) edebilmemiz icin
         map'lere ozel Entry Class'i olusturmustur.

         101=Ali-Can-10-H-MF   1. entry
         101=Ali-Can-10-H-MF   2. entry


         */

        Map<Integer,String> ogrencimap= ReusableMethods.ogrenciMapOlustur();

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti=ogrencimap.entrySet();

        for (Map.Entry<Integer,String> each: ogrenciEntrySeti
             ) {
            System.out.println(each
            );
        }



        for (Map.Entry<Integer,String> each: ogrenciEntrySeti
             ) {
            Integer tempKey=each.getKey();
            String tempValue= each.getValue(); // Ali-Can-10-H-MF
            String[] tempValueArr=tempValue.split("-"); // [Ali, Can, 10, H ,MF]
            System.out.println(tempKey+ " " +
                                tempValueArr[0]+ " "+
                                tempValueArr[1]+ " "+
                                tempValueArr[2]+ " "+
                                tempValueArr[3]+ " "+
                                tempValueArr[4]);

        }
    }
}
