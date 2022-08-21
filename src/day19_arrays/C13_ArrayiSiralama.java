package day19_arrays;

import java.util.Arrays;

public class C13_ArrayiSiralama {

    public static void main(String[] args) {
        // verilen bir String array'i
        // natural order ve ters siralama yapip yazdirin

        String[] arr ={"fatih","Muhammet","Jacob","Dalyan","Bora","Esra","Mehmet"};

        // natural order'a gore siralama icin Arrays class'indan sort() kullanilir
        // dikkat edilecek konu : kucuk harflerin ascii degeri daha buyuk oldugundan
        // siralamada once buyuk harfle baslayanlar, sonra kucuk harfle baslayanlar gelir

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); // [Bora, Dalyan, Esra, Jacob, Mehmet, Muhammet, fatih]

        // Buyukten kucuge siralama yapmak istersek
        // hazir method yok, yeni bir array olusturup
        // o array'e ters siralama ile yerlestirmemiz lazim


        String[] tersSirali= new String[arr.length];

        for (int i = 0; i < arr.length ; i++) {

            tersSirali[i]=arr[arr.length-i-1];
        }

        System.out.println("Ters sirali array : " + Arrays.toString(tersSirali));
    }
}
