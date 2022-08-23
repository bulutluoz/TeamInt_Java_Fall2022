package day21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_ListeTopluElemanEkleme {
    public static void main(String[] args) {

        /*
          2,3,4,5,3,6,7,3,8,9,1,2,5,3,8,5
          elementlerini bir listeye ekleyin
         */

        int[] arr={2,3,4,5,3,6,7,3,8,9,1,2,5,3,8,5};

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar); // [2, 3, 4, 5, 3, 6, 7, 3, 8, 9, 1, 2, 5, 3, 8, 5]

    }
}
