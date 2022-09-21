package day45_maps;

import day44_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C03_EntrySet {
    public static void main(String[] args) {

        // 11.siniftaki MF ogrencilerini no,isim,soyisim seklinde yazdirin

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();

        System.out.println("No  Isim  Soyisim");

        Set<Map.Entry<Integer, String>> ogrenciEntrySeti= ogrenciMap.entrySet();


        for (Map.Entry<Integer,String> each: ogrenciEntrySeti
             ) {
            Integer tempKey= each.getKey();
            String tempValue= each.getValue();

            String[] tempValueArr=tempValue.split("-"); // [Ali, Can, 10, H ,MF]

            if (tempValueArr[2].equals("11") && tempValueArr[4].equalsIgnoreCase("MF") ){

                System.out.println(each.getKey()+" " +
                                    tempValueArr[0]+" "+
                                    tempValueArr[1]);
            }
        }
    }
}
