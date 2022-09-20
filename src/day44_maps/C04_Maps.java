package day44_maps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class C04_Maps {
    public static void main(String[] args) {
        // Subesi B olan ogrencilerin isimlerini bir liste olarak yazdiran bir method olusturun

        Map<Integer,String > ogrenciMap= ReusableMethods.ogrenciMapOlustur();

        List<String> subedekiOgrencilerList = ReusableMethods.istenenSubedekiOgrencilerListesiOlustur(ogrenciMap,"H");

        System.out.println(ogrenciMap);
        System.out.println(subedekiOgrencilerList);
    }
}
