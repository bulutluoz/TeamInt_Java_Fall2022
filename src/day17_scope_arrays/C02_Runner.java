package day17_scope_arrays;

public class C02_Runner {

    public static void main(String[] args) {

        /*
         bir class'dan baska bir class'daki static variable
         ve method'lara ulasmak icin
         classismi.variableIsmi yazmak yeterlidir.

        bir class'dan baska bir class'daki
        instance variable'lara erismek icin
        object olusturmamiz lazim
         */

        System.out.println(C01.meslek);
        C01.meslek="Hemsir";
        System.out.println(C01.meslek);
        C01.method1();


        C01 obj1= new C01();
        obj1.isim="Ayse";
        obj1.soyisim="Yildiz";
        obj1.aktifMi=true;

        System.out.println(obj1.isim); // Ayse
        System.out.println(obj1.meslek); // hemsir
        System.out.println(C01.meslek); // hemsir

        C01.meslek="Yardimci Doktor";

        C01 obj2=new C01();

        System.out.println(obj2.isim); // Isim atanmadi
        System.out.println(obj2.meslek); // yardimci doktor

    }
}
