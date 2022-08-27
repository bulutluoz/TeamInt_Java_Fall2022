package day24_constructors;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1= new Araba();
        // default cons.calisir ve standart ozelliklerde bir arb uretir.
        System.out.println(arb1); // arb1 objedir direk yazdirilamaz
                                  // yazdirabilmek icin Araba class'inda toString() olustururuz
        // Araba ozelllikler : ilanNo=0, marka='deger atanmadi', model='deger atanmadi', yil=0, fiyat=0

        arb1.ilanNo=1201;
        arb1.marka="Opel";
        arb1.model="Corsa";
        arb1.yil=2013;
        arb1.fiyat=10000;

        System.out.println(arb1);
        //  Araba ozelllikler : ilanNo=1201, marka='Opel', model='Corsa', yil=2013, fiyat=10000

        Araba arb2=new Araba(1243,"toyota","Corolla",2008,8000);
        System.out.println(arb2);
        // Araba ozelllikler : ilanNo=1243, marka='toyota', model='Corolla', yil=2008, fiyat=8000

        Araba arb3= new Araba(1456,"Mercedes","S320",2000,10000);
        System.out.println(arb3);
        // Araba ozelllikler : ilanNo=1456, marka='Mercedes', model='S320', yil=2000, fiyat=10000


        // Parametrelerin farkli isimde olmasi buyuk projelerde sorun olur
        // Cok kisinin calistigi projelerde parametre ismi ile instance isminin
        // ayni olmasini TERCIH EDERIZ
    }
}
