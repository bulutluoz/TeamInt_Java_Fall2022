package day20_arrays;

import java.util.Arrays;

public class C04_MDAOlusturma {

    public static void main(String[] args) {

        // bir arrayi olusturmak ve deger atamak icin 2 yontemimiz vardi

        int[] arr1= {2,4,6};
        int[] arr2= new int[5]; // [0, 0, 0, 0, 0]


        // multi dimensional array'lerde de ayni iki yontem gecerli

        int [][][] arr3katli= {{{2,3},{3,4,5}},{{4}, {5}}, {{8}}};


        int[][] arr2Katli= new int[3][2];

        System.out.println(Arrays.deepToString(arr2Katli)); // [[0, 0], [0, 0], [0, 0]]

        // 2.tur array olusturmada ic array'lerin length'leri birbirine esit olmak zorundadir

        // [[3, 5], [2, 4], [7, 9]] degerlerini atayalim

        arr2Katli[0][0]=3;
        arr2Katli[0][1]=5;
        arr2Katli[1][0]=2;
        arr2Katli[1][1]=4;
        arr2Katli[2][0]=7;
        arr2Katli[2][1]=9;

        System.out.println(Arrays.deepToString(arr2Katli)); // [[3, 5], [2, 4], [7, 9]]
    }
}
