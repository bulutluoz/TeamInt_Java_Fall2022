package day46_maps;

import day44_maps.ReusableMethods;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class C03_Maps {
    public static void main(String[] args) {
        // Verilen bir ogrenci map’inde her sinifta kacar ogrenci oldugunu yazdiran bir method olusturun.

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        // {101=Ali-Can-10-H-MF, 102=Veli-Cem-11-M-Soz, 103=Ali-Cem-11-B-TM, 104=Ayca-Can-11-B-MF, 105=Ayse-Cem-10-M-Soz}
        // beklenen sonuc {10=2, 11=3}

        Map<String,Integer> sinifSayilariMap= new HashMap<>();

        // ogrenci map'ini entry'lere ayirip sinif kontrolu yapmaliyiz

        Set<Map.Entry<Integer,String>> ogrenciMapEntrySeti= ogrenciMap.entrySet();

        for (Map.Entry<Integer,String> entry: ogrenciMapEntrySeti
        ) {
            // elimizde 101=Ali-Can-10-H-MF gibi entry'ler var

            String[] tempValueArr= entry.getValue().split("-"); // [Ali, Can, 10, H, MF]

            String sinifBilgisi=tempValueArr[2];

            // su an elimizde sinif bilgisi var
            // bunu yeni olusturdugumuz sinifSayilariMap'e ekleyecegiz

            // amacimiz sinifBilgisi daha onceden map'de varsa value'yu bir artirmak
            // sinifBilgisi daha onceden map'de yoksa map'e (sinifBilgisi,1) eklemek

            sinifSayilariMap.computeIfPresent(sinifBilgisi,(k,v)->v+1);
            sinifSayilariMap.putIfAbsent(sinifBilgisi,1);

        }
        System.out.println(sinifSayilariMap);
    }
}
