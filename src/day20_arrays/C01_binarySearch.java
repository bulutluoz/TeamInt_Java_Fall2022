package day20_arrays;

import day19_arrays.C04_ElementArama;

import java.util.Arrays;

public class C01_binarySearch {
    public static void main(String[] args) {
        // verilen bir arrayde istenen elementin
        // olup olmadigini kontrol etme

        String[] arr = {"Fatih","Muhammet","Jacob","Dalyan","Bora","Esra","Naci"};
        String arananElement="Muhammet";

        C04_ElementArama.elemanVarMi(arr,arananElement);


        // Javada da arama method'u var

        System.out.println(Arrays.binarySearch(arr, arananElement)); // -7


        C04_ElementArama.elemanVarMi(arr,"Dalyan"); // Aradiginiz element array'de 1 defa kullanilmis
        System.out.println(Arrays.binarySearch(arr, "Dalyan")); // 3

        /*
         Binary search bir array'de bir elementin oldugu index'i verir
         Ancak oncelikle sort yapilmalidir.

         sort yapilmadan binary search ile arama yapilirsa
         sonucun ne olacagini bilemeyiz
         */
        Arrays.sort(arr); // [Bora, Dalyan, Esra, Fatih, Jacob, Muhammet, Naci]
        System.out.println(Arrays.toString(arr));
        C04_ElementArama.elemanVarMi(arr,"Fatih"); // Aradiginiz element array'de 1 defa kullanilmis
        System.out.println(Arrays.binarySearch(arr, "Fatih")); // 3


        C04_ElementArama.elemanVarMi(arr,"Esra"); // Aradiginiz element array'de 1 defa kullanilmis
        System.out.println(Arrays.binarySearch(arr, "Esra")); // 2

        /* array'de olmayan bir element aranirsa
           once o element array'de olsa kacinci SIRADA olacagini bulur
           basina - yazarak olmadigini bize soyler
         */

        // [Bora, Dalyan, Esra, Fatih, Jacob, Muhammet, Naci]
        System.out.println(Arrays.binarySearch(arr, "Gursel")); // -5
        System.out.println(Arrays.binarySearch(arr, "Sukran")); // -8
        System.out.println(Arrays.binarySearch(arr, "Ahmet")); // -1

    }
}
