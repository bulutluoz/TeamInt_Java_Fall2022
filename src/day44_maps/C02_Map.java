package day44_maps;

import java.util.Map;
import java.util.Scanner;

public class C02_Map {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();

        System.out.println(ogrenciMap);
        // {101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}

        // kullanicidan ogrenci ile ilgili bilgileri alip
        // map'e ekleyin

        ogrenciMap=ReusableMethods.mapeOgrenciEkle(ogrenciMap);
        System.out.println(ogrenciMap);

        /*
         map'e element eklemek icin put() kullanilir
         value girilirken eski elementlerle ayni formatta olmalidir
         */


    }
}
