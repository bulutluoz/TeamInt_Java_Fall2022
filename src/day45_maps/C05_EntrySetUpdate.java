package day45_maps;

import day44_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C05_EntrySetUpdate {
    public static void main(String[] args) {

        // Tum ogrencilerin siniflarini bir artirin

        Map<Integer, String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();

        Set<Map.Entry<Integer,String>> ogrenciEntrySet=ogrenciMap.entrySet();
        String eskiValue;
        String yeniValue;
        String[] tempValueArr;

        for (Map.Entry<Integer,String> each: ogrenciEntrySet
             ) {

            eskiValue= each.getValue(); // Ali-Can-10-H-MF
            tempValueArr=eskiValue.split("-");

            tempValueArr[2]= (Integer.parseInt(tempValueArr[2])+1)+"";
            yeniValue= tempValueArr[0] +"-"+
                        tempValueArr[1] +"-"+
                        tempValueArr[2] +"-"+
                        tempValueArr[3] +"-"+
                        tempValueArr[4];

            each.setValue(yeniValue);

        }

        System.out.println(ogrenciMap);
    }
}
