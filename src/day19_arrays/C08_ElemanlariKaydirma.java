package day19_arrays;

import java.util.Arrays;

public class C08_ElemanlariKaydirma {
    public static void main(String[] args) {
        // Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun,
        // array’i yeni haliyle kaydedin.
        // Orn :  input : [4,5,6,7]   array’in son hali. : [7,4,5,6]

        int[] arr= {4,5,6,7,8};

        int temp=arr[arr.length-1];

        /*
         arr[3]=arr[2]
         arr[2]=arr[1]
         arr[1]=arr[0]

         */

        for (int i = arr.length-1 ; i >0 ; i--) {

            arr[i]=arr[i-1];
        }

        arr[0]=temp;

        System.out.println(Arrays.toString(arr));


        // method ile yapalim

        arr=sagaKaydir(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] sagaKaydir(int[] arr) {
        // sondaki elementi gecici depoya koyduk
        int temp=arr[arr.length-1];
        // elementleri bir sagdakine atadik
        for (int i = arr.length-1 ; i >0 ; i--) {

            arr[i]=arr[i-1];
        }
        // gecici depodaki son elementi ilk elemente atadik
        arr[0]=temp;

        return arr;
    }


}
