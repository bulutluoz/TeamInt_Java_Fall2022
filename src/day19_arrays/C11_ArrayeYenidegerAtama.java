package day19_arrays;

import java.util.Arrays;

public class C11_ArrayeYenidegerAtama {

    public static void main(String[] args) {

        /*
         KURAL : Bir array'in uzunlugu sabittir ve degistirilemez

         ancak ihtiyac duydugumuzda yeni bir array olusturup
         o array'i eski array'e atayabiliriz

         */

        int[] arr = {2,3,5};

        // arr={3,4,5};

        int[] yeniDeger= {4,5,6,8};

        arr=yeniDeger;

        System.out.println(Arrays.toString(arr)); // [4, 5, 6, 8]


        // ornegin arr = [1,2,3] array'ini [1,2,3,4] haline getirmek istersek


        int[] arr1 = {1,2,3};

        int[] yeniArr1= new int[3+1]; // uzunlugu 1 fazla yeni bir array olustururum

        for (int i = 0; i < arr1.length; i++) {
            yeniArr1[i]=arr1[i];
        }
        yeniArr1[3]=4;
        System.out.println(Arrays.toString(yeniArr1));

    }
}
