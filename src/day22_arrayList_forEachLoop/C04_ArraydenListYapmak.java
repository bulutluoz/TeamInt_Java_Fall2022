package day22_arrayList_forEachLoop;

import java.util.Arrays;
import java.util.List;

public class C04_ArraydenListYapmak {

    public static void main(String[] args) {
        Integer[] arr= {2,3,4,5,6};

        List<Integer> list= Arrays.asList(arr);

        System.out.println(list); // [2, 3, 4, 5, 6]
    /*
    Arrays.asList() bir array'i list'e cevirir
    ANCAK bu list gorunuste list olsada add ve remove gibi
    uzunlugu etkileyen method'lari calistirmaz
     */
        // list.add(10);
        // list.remove(0);

    /*
    Bir yan etkisi daha var
    bir array'den list yaptigimizda bu iki obje birbiriyle ozdeslesir
    birinde yaptigimiz degisiklikler
    otekine de islenir
     */

        list.set(1,20);
        System.out.println("list'i update ettikten sonra list : " + list);
        //[2, 20, 4, 5, 6]

        System.out.println("list'i update ettikten sonra array : " + Arrays.toString(arr));
        //[2, 20, 4, 5, 6]
    }
}
