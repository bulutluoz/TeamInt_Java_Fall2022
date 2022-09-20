package day44_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReusableMethods {

    public static Map<Integer,String> ogrenciMapOlustur(){

        Map<Integer,String> ogrenciMap= new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-10-H-MF");
        ogrenciMap.put(102,"Veli-Cem-11-M-Soz");
        ogrenciMap.put(103,"Ali-Cem-11-B-TM");
        ogrenciMap.put(104,"Ayca-Can-11-B-MF");
        ogrenciMap.put(105,"Ayse-Cem-10-M-Soz");

        return ogrenciMap;
    }

    public static Map<Integer,String> mapeOgrenciEkle(Map<Integer,String> ogrenciMap){

        Scanner scan = new Scanner(System.in);
        String valueOgr="";


        System.out.println("Ogrenci ismi giriniz");
        String isim = scan.nextLine();
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();

        System.out.println("Ogrenci soy ismi giriniz");
        String soyisim= scan.nextLine();
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
        System.out.println("Ogrenci sinif giriniz");
        String sinif= scan.nextLine();

        System.out.println("Ogrenci sube giriniz");
        String sube= scan.nextLine().toUpperCase();

        System.out.println("Ogrenci brans giriniz MF-TM-Soz");
        String brans= scan.nextLine();
        brans=brans.substring(0,1).toUpperCase()+brans.substring(1).toLowerCase();
        valueOgr=isim+"-"+soyisim+"-"+sinif+"-"+sube+"-"+brans;

        System.out.println("Ogrenci no giriniz: ");
        int keyOgr= scan.nextInt();

        ogrenciMap.put(keyOgr,valueOgr);

        return ogrenciMap;
    }
}
