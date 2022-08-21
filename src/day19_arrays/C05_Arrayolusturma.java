package day19_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C05_Arrayolusturma {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan integer array’in boyutunu ve elementlerini alip
        // array’i olusturan ve bize donduren bir method olusturun.

        int[] arr = arrayOlustur();

        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayOlustur() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen array'in uzunlugunu giriniz");
        int uzunluk= scan.nextInt();

        int[] arr=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {

            System.out.println(i +". index'deki elementi giriniz");
            arr[i]=scan.nextInt();
        }

        return arr;
    }
}
