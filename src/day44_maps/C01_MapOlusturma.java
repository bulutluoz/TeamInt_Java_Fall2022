package day44_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C01_MapOlusturma {
    public static void main(String[] args) {
        /*
           Bir lisedeki ogrenci bilgilerini tutacak bir map olusturalim
           Ogrenci numarasi key olsun,
           Isim, Soyisim, Sinif, Sube, Alan bilgileri value icerisinde yer alsin
           key : 101
           value : "Ali, Can, 10, H, MF"

           Bir Map olusturulurken oncelikle key ve value'nun data turlerine karar verilir.

           Value birden fazla bilgi birlestirilerek olusturulmussa
           1 - buradaki bilgilerin sirasi
           2 - bilgiler arasinda kullanilacak ayirac standart olmalidir

         */
        Map<Integer,String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-H-TM");


        System.out.println(ogrenciMap);


        // {101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz}
        // standart giris acisindan map'de herseyi method ile yapmakta fayda vardir


    }
}
