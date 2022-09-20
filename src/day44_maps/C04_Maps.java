package day44_maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {
        // Subesi B olan ogrencilerin isimlerini bir liste olarak yazdiran bir method olusturun

        Map<Integer,String > ogrenciMap= ReusableMethods.ogrenciMapOlustur();

        Collection<String> ogrenciValueColl= ogrenciMap.values();
        List<String> bSubesindekiler= new ArrayList<>();
        String[] valueArr;

        for (String each: ogrenciValueColl
             ) {

            valueArr=each.split("-");
            if (valueArr[3].equalsIgnoreCase("B")){
                bSubesindekiler.add(valueArr[0]);
            }

        }

        System.out.println(bSubesindekiler);
    }
}
