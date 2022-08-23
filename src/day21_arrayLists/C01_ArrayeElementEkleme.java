package day21_arrayLists;

import day08_switchStatements_StringManipulations.C12_substring;
import day19_arrays.C12_ArrayeElemanEkleme;

import java.util.Arrays;

public class C01_ArrayeElementEkleme {

    public static void main(String[] args) {

        int[] arr={2,4,5};

        // Bu array'in sonuna 3 elementini ekleyelim

        // arr[3]=3; array'in uzunlugu degistirilemez

        arr= C12_ArrayeElemanEkleme.arrayeElemanEkleme(arr,3);

        System.out.println(Arrays.toString(arr)); // [2, 4, 5, 3]

        // bir de 7 ekleyelim
        arr=C12_ArrayeElemanEkleme.arrayeElemanEkleme(arr,7);
        System.out.println(Arrays.toString(arr));  // [2, 4, 5, 3, 7]

    }
}
