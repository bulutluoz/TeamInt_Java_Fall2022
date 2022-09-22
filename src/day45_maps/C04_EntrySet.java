package day45_maps;

import day44_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C04_EntrySet {
    public static void main(String[] args) {

        // 10. siniftaki ogrencilerin no, isim, soyisim, bolumlerini
        // bir liste olarak kullaniciya yazdirin
        // Baslik satiri : No  Isim  Soyisim  Bolum

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti=ogrenciMap.entrySet();
        Integer tempKey;
        String tempValue;
        String[] tempValueArr;

        for (Map.Entry<Integer,String> each: ogrenciEntrySeti
             ) {

            tempKey=each.getKey();
            tempValue= each.getValue();
            tempValueArr=tempValue.split("-"); // [Ali, Can, 10, H ,MF]

            if (tempValueArr[2].equals("10")){
                System.out.println(tempKey+" "+
                                    tempValueArr[0]+" "+
                                    tempValueArr[1]+" "+
                                    tempValueArr[4]);
            }
        }



    }
}
