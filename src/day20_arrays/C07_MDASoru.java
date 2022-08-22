package day20_arrays;

import java.util.Arrays;

public class C07_MDASoru {
    public static void main(String[] args) {

        /* asagida verilen MDA'de
           ic array'lerde ayni index'e sahip elementleri toplayip
           yeni olusturacagimiz tek katli bir array'e koyup
           yazdirin

         */

        int[][] arr =  {{3,4,5},{2,3,6,7}};

        // output  : [5, 7, 11]

        /*
           arr[0][0] + arr[1][0]
           arr[0][1] + arr[1][1]
           arr[0][2] + arr[1][2]
         */

        int uzunluk= arr[0].length>arr[1].length ? arr[1].length : arr[0].length;

        int[] toplamlarArrayi=new int[uzunluk]; // [0, 0, 0]

        for (int i = 0; i <uzunluk ; i++) {

            toplamlarArrayi[i]=arr[0][i]+arr[1][i];
        }

        System.out.println(Arrays.toString(toplamlarArrayi));
    }
}
