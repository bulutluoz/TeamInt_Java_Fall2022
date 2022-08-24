package day22_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_ForEachLoop {
    public static void main(String[] args) {

        /*
         verilen bir array'in tum elementlerini
         olusturacaginiz bir list'e ekleyin
         */

        int[] arr = {2,3,5,6,7,5,3,2,5,7,76,4,3,3,56,7,4};

        List<Integer> sayilar=new ArrayList<>();

        for (int each: arr
             ) {
            sayilar.add(each);
        }

        System.out.println("Listenin son hali : " + sayilar);
    }
}
