package day46_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class C06_TreeMap {
    public static void main(String[] args) {

        TreeMap<String,Integer> ornekMap=new TreeMap<>();
        ornekMap.put("a",3);
        ornekMap.put("r",1);
        ornekMap.put("k",2);
        ornekMap.put("b",5);

        System.out.println(ornekMap); // {a=3, b=5, k=2, r=1}

        System.out.println(ornekMap.ceilingEntry("b")); // b=5
        System.out.println(ornekMap.ceilingEntry("c")); // k=2
        System.out.println(ornekMap.ceilingEntry("m")); // r=1
        System.out.println(ornekMap.ceilingEntry("t")); // null

        System.out.println(ornekMap.ceilingKey("b")); // b
        System.out.println(ornekMap.ceilingKey("c")); // k

        System.out.println(ornekMap); // {a=3, b=5, k=2, r=1}
        System.out.println(ornekMap.firstKey());// a
        System.out.println(ornekMap.firstEntry()); // a=3

        System.out.println(ornekMap.lastKey()); // r
        System.out.println(ornekMap.lastEntry()); // r=1

        System.out.println(ornekMap.pollFirstEntry()); // a=3 silip getirdi
        System.out.println(ornekMap.pollLastEntry()); // r=1 silip getirdi
        System.out.println(ornekMap); // {b=5, k=2}

        System.out.println(ornekMap.descendingMap()); // {k=2, b=5}
        System.out.println(ornekMap); // {b=5, k=2}

        System.out.println(ornekMap.floorEntry("b")); // b=5
        System.out.println(ornekMap.floorKey("d")); // b
        System.out.println(ornekMap.floorKey("k")); // k
        System.out.println(ornekMap);

        ornekMap.put("y",3);
        ornekMap.put("t",2);
        System.out.println(ornekMap); // {b=5, k=2, t=2, y=3}

        System.out.println(ornekMap.headMap("m")); // {b=5, k=2}
        System.out.println(ornekMap.headMap("t")); // {b=5, k=2}
        System.out.println(ornekMap.headMap("t",true)); // {b=5, k=2, t=2}

        System.out.println(ornekMap.higherKey("k")); // t
        System.out.println(ornekMap.higherEntry("t")); // y=3

        System.out.println(ornekMap.lowerEntry("m")); // k=2
        System.out.println(ornekMap.lowerKey("c")); // b


    }
}
