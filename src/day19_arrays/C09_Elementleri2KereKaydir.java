package day19_arrays;

import java.util.Arrays;

public class C09_Elementleri2KereKaydir {

    public static void main(String[] args) {
        /*
         8. sorudaki saga kaydirma islemini 2 kere yapalim
         */

        int[] arr={5,7,9};

        arr=C08_ElemanlariKaydirma.sagaKaydir(arr);
        arr=C08_ElemanlariKaydirma.sagaKaydir(arr);

        System.out.println(Arrays.toString(arr));

    }
}
