package day19_arrays;

import java.util.Arrays;

public class C03_Ilk2ClassiKullanma {

    public static void main(String[] args) {

        int[] arr={1,4,7,3};

        // bu array'in elementlerini toplayalim

        System.out.println("Elementlerin toplami : "+C01_ElemanlariToplama.elemanlariTopla(arr));

        int x=4;

        // tum elementleri x kadar artiralim

        arr=C02_ElementleriArtirma.elementleriArtir(arr,x);
        System.out.println(Arrays.toString(arr));

        // array'de loop kullanma  [5, 8, 11, 7]
        //                          0  1  2   3

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
