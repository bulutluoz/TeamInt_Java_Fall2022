package day43_collections_sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C02_Set {

    public static void main(String[] args) {
        /*
        Soru :  Verilen bir array’deki tekrar eden elementleri silerek,
        her element’den sadece bir tane olacak sekilde yeni bir array olusturun.

         */


        int[] arr= {2,3,4,2,6,4,5,3,2,4,6,5,7,9};

        Set<Integer> temp= new HashSet<>();

        for (Integer each:arr
             ) {
            temp.add(each);
        }

        // set tekrar edenleri sildi, simdi bu elementleri eski array'e atamaliyiz

        arr=new int[temp.size()]; // eski array'e yeni boyutta yeni bir array atadik

        // simdi set'deki herbir elementi array'e atayalim
        // bunun icin index'e ihtiyac var

        int index=0;

        for (Integer each: temp
             ) {
            arr[index] = each;
            index++;
        }

        System.out.println(Arrays.toString(arr)); // [2, 3, 4, 5, 6, 7, 9]
    }
}
