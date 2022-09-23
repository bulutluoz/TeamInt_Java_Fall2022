package day46_maps;

import day44_maps.ReusableMethods;

import java.util.HashMap;
import java.util.Map;

public class C05_Maps {

    public static void main(String[] args) {
        Map<String,Integer> ornekMap=new HashMap<>();

        ornekMap.put("a",3);
        ornekMap.put("b",1);
        ornekMap.put("c",2);
        ornekMap.put("d",5);

        System.out.println(ornekMap); // {a=3, b=1, c=2, d=5}

        System.out.println(ornekMap.containsValue(5)); // true

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        // {101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM,
        // 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}

        System.out.println(ogrenciMap.containsKey(102)); // true

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        // containsValue("IstenenDeger") method'u tam olarak value girilirse true doner
        // ancak value icerisindeki bir degeri aratirsaniz false doner
        System.out.println(ogrenciMap.containsValue("Veli-Cem-11-M-Soz")); // true

        System.out.println(ornekMap); // {a=3, b=1, c=2, d=5}
        System.out.println(ornekMap.replace("d", 10)); // 5 eski degerini döndürür
        System.out.println(ornekMap); // {a=3, b=1, c=2, d=10}

        System.out.println(ornekMap.replace("a", 5, 8)); // false
        System.out.println(ornekMap.replace("b",1,2)); // true
        System.out.println(ornekMap); // {a=3, b=2, c=2, d=10}

        System.out.println(ornekMap.get("b")); // 2
        System.out.println(ornekMap.get("z")); // null
        System.out.println(ornekMap.getOrDefault("a", 6)); // 3
        System.out.println(ornekMap.getOrDefault("m", 0)); // 0
        System.out.println(ornekMap); // {a=3, b=2, c=2, d=10}

    }
}
