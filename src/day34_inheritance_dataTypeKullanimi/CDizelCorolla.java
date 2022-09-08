package day34_inheritance_dataTypeKullanimi;

import java.util.ArrayList;
import java.util.List;

public class CDizelCorolla extends BCorolla{
    String yakit="Dizel";
    String motor="1.4 dizel motor";
    String renk="Tanimlanmadi";

    public static void main(String[] args) {

        CDizelCorolla arb1=new CDizelCorolla();
        System.out.println(arb1.motor);  // C 1.4 dizel motor
        System.out.println(arb1.renk); // C Tanimlanmadi
        System.out.println(arb1.yakit); // C Dizel
        System.out.println(arb1.uretimYeri); // B Turkiye
        System.out.println(arb1.marka); // A Toyota

        BCorolla corolla= new BCorolla();
        BCorolla arb2=new CDizelCorolla();
        System.out.println(arb2.yakit); // B Tanimlanmadi
        System.out.println(arb2.renk); // B Belirtilmedi
        // arb2.motor data turu olarak secilen
        // BCorolla class'inda motor variable'i olmadigindan CTE verir
        System.out.println(arb2.uretimYeri); // B Turkiye
        System.out.println(arb2.marka); // A Toyota

        AToyota arb3= new CDizelCorolla();
        // arb3.motor  A'da motor yok
        // arb3.renk   A'da renk yok
        // arb3.yakit  A'da yakit yok
        System.out.println(arb3.uretimYeri); // A Deger atanmadi
        System.out.println(arb3.marka); // A Toyota

        /*
           Bir child class'da obje olusturulurken
           data turu olarak parent class'lar secilebilir
           Bu durumda obje child class'in objesi olmakla birlikte
           ozellikleri data turu olarak secilen parent class'a ait olacaktir.

           Bir obje olusturulurken data turu constructor'dan farkli ise
           o objeye ait variable degerlerinin ne oldugunu bulmak icin
           ilk bakmamiz gereken scope data turu olarak secilen parent class olmalidir.
           Eger data turu olarak atanan class'da variable bulunamazsa, parent'larina baklilir

           Eger aranan variable data turu olarak secilen class ve onun parent'larinda yoksa
           CTE olusur.

           Boyle bir obje olusturmanin temel amaci
           constructor kullanilan class'in degil parent class'in
           sahip oldugu ozellikleri (variable) kullanmaktir.

           Yani variable'larin degeri icin
           onemli olan constructor degil, data turudur.
         */

        /*
          18.satirda olusturulan obje inheritance ile ilgili degildir
          data turu ve constructor ayni oldugundan
          standart bir obje olusturulmustur.
          ve bu objenin tum ozellikleri BCorolla class'indan alinir.

          19.satirda ise biz Dizel bir Corolla uretiyoruz
          ancak bu dizel corolla'nin Corolla olarak ozelliklerini gormek istiyoruz
         */

    }
}
