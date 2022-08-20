package day18_arrays;

import java.util.Arrays;

public class C02_ArrayTumElementleriYazdirma {

    public static void main(String[] args) {

        int[] arr={3,5,7,10};

        // Array'in tum elementlerini yazdiralim

        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");

        System.out.println("");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

        // Eger arr'yi yazdirmak istersek

        System.out.println(arr); //  [I@6bf256fa

        // Array'i yazdirabilmek icin Arrays class'indan hazir method kullanmamiz gerekir

        System.out.println(Arrays.toString(arr)); // [3, 5, 7, 10]

    }


}
