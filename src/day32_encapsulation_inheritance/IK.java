package day32_encapsulation_inheritance;

public class IK {

    /*
     Tum personel icin ortak olan
     variable ve method'lar bu class'da tutulur
     boylece alt class'larin her birinde
     bu kadar variable'i yeniden yeniden olustrmak zorunda kalmayiz
     */
    protected String isim ="Deger Atanmamis";
    protected String soyisim="Deger Atanmamis";

    protected void maas(){
        System.out.println("Personel maas alir");
    }

    protected void izin(){
        System.out.println("Personelin izin hakki vardir");
    }

    protected void ozelSigorta(){
        System.out.println("personele ozel sigirta destegi yapilir");
    }
}
