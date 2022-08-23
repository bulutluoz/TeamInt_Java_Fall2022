package day21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekrarsizArray {
    public static void main(String[] args) {

        /*
           Verilen bir integer array'deki tekrar eden elementleri
           sadece 1 tane yapip, array'i guncelleyin


         */


        int[] arr = {1,2,3,2,4,2,1,4,2,3,4,1,3,1,4,3,2};
        // output [1,2,3,4]

        List<Integer> benzersizList= new ArrayList<>();


        /*
          array'deki elementleri kontrollu olarak listeye ekleyelim
          listede yoksa ekleyelim, listede varsa eklemeyelim
         */

        for (int i = 0; i < arr.length; i++) {

            if (!benzersizList.contains(arr[i])){

                benzersizList.add(arr[i]);
            }
        }

        System.out.println(benzersizList); // [1, 2, 3, 4]

        /*
        Bu listeyi arr listesine atamak icin
        yeni bir array olusturup
        Listedeki elementleri yeni array'e ekleriz
        sonra da arr'ye deger olarak yeni arrayi atama yapariz
         */

        int[] benzersizArr= new int[benzersizList.size()];

        // benzersiz listenin uzunlugunda bir array olusturduk

        for (int i = 0; i <benzersizArr.length ; i++) {

            benzersizArr[i]= benzersizList.get(i);

        }

        arr=benzersizArr;

        System.out.println("arr'nin son hali : " + Arrays.toString(arr));

    }
}
