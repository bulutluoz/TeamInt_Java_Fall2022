package day35_overriding;

public class CKumesKuslari extends BKuslar{
    String tur="Kumes Kusu";
    String isim="Kumes kusu Isim belirtilmedi";
    String yasamYeri="Kumes kuslari kumeste yasar";

    void hareket(){
        System.out.println("Kumes hayvanlari yurur");
    }
    void beslenme(){
        System.out.println("Kumes hayvanlari et veya ot yerler");
    }
    public static void main(String[] args) {
        CKumesKuslari kk1= new CKumesKuslari();
        System.out.println(kk1.tur); // C Kumes Kusu
        System.out.println(kk1.isim); // C Kumes kusu Isim belirtilmedi
        System.out.println(kk1.yasamYeri); // C Kumes kuslari kumeste yasar
        System.out.println(kk1.ayak); // B Kuslarin ayagi vardir
        kk1.hareket(); // C Kumes hayvanlari yurur
        kk1.beslenme(); // C Kumes hayvanlari et veya ot yerler
        kk1.kanat(); // B Kuslar kanatlidir
        kk1.solunum(); // B Kuslar akcigerle nefes alir
        kk1.gaga(); // B Kuslarin gagalari vardir
        kk1.cogalma(); // B Kuslar yumurtayla cogalir
        kk1.omur(); // A Hayvanlar yasar ve olur


        BKuslar kk2= new CKumesKuslari();
        System.out.println(kk2.tur); // B Kus
        System.out.println(kk2.isim); // B Kus Isim belirtilmedi
        // System.out.println(kk2.yasamYeri); // CTE
        System.out.println(kk2.ayak); // B Kuslarin ayagi vardir

        kk2.hareket(); // C Kumes hayvanlari yurur
        kk2.beslenme(); // C Kumes hayvanlari et veya ot yerler
        kk2.kanat(); // B Kuslar kanatlidir
        kk2.solunum(); // B Kuslar akcigerle nefes alir
        kk2.gaga(); // B Kuslarin gagalari vardir
        kk2.cogalma(); // B Kuslar yumurtayla cogalir
        kk2.omur(); // A Hayvanlar yasar ve olur


        AHayvanlar kk3=new CKumesKuslari();
        System.out.println(kk3.tur); // A Hayvan
        System.out.println(kk3.isim); // A Hayvan Isim belirtilmedi
        // System.out.println(kk3.yasamYeri); // CTE
        // System.out.println(kk3.ayak); // CTE

        kk3.hareket(); // C Kumes hayvanlari yurur
        kk3.beslenme(); // C Kumes hayvanlari et veya ot yerler
        //kk3.kanat(); // A'da bu method yok CTE
        kk3.solunum(); // B Kuslar akcigerle nefes alir
        // kk3.gaga(); // A'da gaga yok CTE
        kk3.cogalma(); // B Kuslar yumurtayla cogalir
        kk3.omur(); // A Hayvanlar yasar ve olur
    }
}
