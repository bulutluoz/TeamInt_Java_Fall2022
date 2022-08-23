package day21_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_ArrayiTekrarsizYapma {

    public static void main(String[] args) {
            /*
      verilen bir array'den tekrar eden sayilari silip
      benzersiz sayilardan olusan bir array haline getirip
      bize donduren bir method olusturun
     */

        int[] arr = {1,2,3,2,4,2,1,4,2,3,4,1,3,1,4,3,2};
        // output [1,2,3,4]


        arr=benzersizYap(arr);

        System.out.println(Arrays.toString(arr));


        int[] arr2 = {8,8,8,8,9,2,2,2,2};
        arr2=benzersizYap(arr2);
        System.out.println(Arrays.toString(arr2)); // [8, 9, 2]




    }

    public static int[] benzersizYap(int[] arr) {

        // once array'in elemanlarini kontrol ederek koyacagim bir list olusturalim
        List<Integer> benzersizList=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            if (!benzersizList.contains(arr[i])){

                benzersizList.add(arr[i]);
            }
        }

        // artik benzersiz elemanlardan olusan bir listeye sahibiz
        // simdiki hedef bir array olusturup, listedeki elementleri o array'e atamak

        int[] benzersizArr=new int[benzersizList.size()];

        // bir loop ile listedeki elementleri array'e atayalim
        for (int i = 0; i <benzersizArr.length ; i++) {

            benzersizArr[i]= benzersizList.get(i);

        }
        //benzersiz elementlerden olusan bir array olusturduk
        // bunu main method'a dondurelim
        return benzersizArr;
    }
}
