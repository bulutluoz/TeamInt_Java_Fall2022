package day17_scope_arrays;

public class C03_Runner {


    public static void main(String[] args) {

        System.out.println(C01.meslek); // Hemsire
        C01.meslek="Hemsir";

        C01 obj=new C01();
        System.out.println(obj.isim); // IA
        System.out.println(obj.meslek); // Hemsir


        obj.method2();

        System.out.println(obj.isim); // Recep
        System.out.println(obj.soyisim); // Lejon
        System.out.println(obj.aktifMi); // true

        C01 obj2=new C01();
        System.out.println(obj2.isim); // IA
        System.out.println(obj2.meslek); //

    }
}
