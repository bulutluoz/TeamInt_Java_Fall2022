package day32_encapsulation_inheritance;

public class Doktor extends Muhasebe{

    public static void main(String[] args) {
        /*
          Insanlar'da parent'lar child edinir.
          Insanlar aleminden farkli olarak
          Java'da durum farklidir

          Bir Class olusturuldugunda kendi Child class'larini secemez
          Ancak Child class'lar olursa onlarla neleri paylasabilecegini secebilir

          Cunku Java'da parent'lar child edinmez
          child class'lar parent edinirler

          herhangi bir class'da
          ozellikliklerini (var olan variable ve method'lari)
          otomatik olarak sahiplenmek istedigimniz bir class varsa
          o class'i extends keyword ile parent edinirsiniz

         */

        Doktor dr= new Doktor();
        dr.isim="Recep";
        dr.soyisim="Yilmaz";
        dr.raporluMu=false;
        dr.sgkNo="3423455234";
        dr.minSaatUcreti=25;

        System.out.println(dr.standartMaas()); // 6000 30*25*8


    }
}
