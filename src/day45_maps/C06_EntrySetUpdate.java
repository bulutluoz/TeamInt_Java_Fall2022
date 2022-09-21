package day45_maps;

import day44_maps.ReusableMethods;

import java.util.Map;
import java.util.Set;

public class C06_EntrySetUpdate {
    public static void main(String[] args) {

        // MF olan bolum isimlerini Say olarak degistirin

        /*
          map'i update edebilmek icin once map'i parcalara ayiriyoruz

          map ==> entry ==> String value ==> Array

          array uzerinde istedigimiz degisikligi yapip,
          tekrar ayni yoldan geri donuyoruz

          array ==> String ==> Entry ==> Map
         */

        Map<Integer,String> ogrenciMap= ReusableMethods.ogrenciMapOlustur();

        Set<Map.Entry<Integer,String>> ogrenciEntrySeti=ogrenciMap.entrySet();

        Integer tempKey;
        String tempValue;
        String[] tempValueArr;

        for (Map.Entry<Integer,String> each:ogrenciEntrySeti
             ) {

            // Ali-Can-10-H-MF
            tempValue= each.getValue();
            tempValueArr=tempValue.split("-"); // [Ali, Can, 10, H ,MF]

            if (tempValueArr[4].equalsIgnoreCase("mf")){
                tempValueArr[4]="Say"; // [Ali, Can, 10, H ,Say]
            }

            // array'i yeniden Ali-Can-10-H-Say haline getirmemiz lazim
            tempValue=tempValueArr[0] +"-"+
                    tempValueArr[1] +"-"+
                    tempValueArr[2] +"-"+
                    tempValueArr[3] +"-"+
                    tempValueArr[4]; // // Ali-Can-10-H-Say

            each.setValue(tempValue);// update ettigimiz String'i entry uzerinden Map'de update ediyor
        }

        System.out.println(ogrenciMap);
    }
}
