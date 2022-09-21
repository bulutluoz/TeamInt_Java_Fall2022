package day44_maps;

import java.util.List;
import java.util.Map;

public class C06_Maps {
    public static void main(String[] args) {

        // verilen sinif'daki ogrencilerin isim ve soyisimlerini liste olarak donduren bir method olusturun

        Map<Integer,String> ogrenciMap=ReusableMethods.ogrenciMapOlustur();

        List<String> sinifOgrenciListesi=
                ReusableMethods.siniftakiOgrenciListesiOlustur(ogrenciMap,11);

        System.out.println(sinifOgrenciListesi);

    }
}
