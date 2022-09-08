package day35_overriding;

public class DAvciKuslar extends BKuslar{
    String tur="Avci Kusu";
    String isim="Avci kusu Isim belirtilmedi";
    String yasamYeri="Avci kuslar yabanda yasar";
    String enSevdikleriYiyecek="Yaban tavsani";

    void hareket(){
        System.out.println("Avci kuslar ucarlar");
    }

    void beslenme(){
        System.out.println("Avci kuslar et yerler");
    }

    void pence(){
        System.out.println("Avci kuslarin penceleri vardir");
    }

    void gaga(){
        System.out.println("Avci kuslar sivri gagalidir");
    }

    public static void main(String[] args) {

        DAvciKuslar avk1= new DAvciKuslar();
        System.out.println(avk1.tur); // D Avci Kusu
        System.out.println(avk1.isim); // D Avci kusu Isim belirtilmedi
        System.out.println(avk1.yasamYeri); // D Avci kuslar yabanda yasar
        System.out.println(avk1.enSevdikleriYiyecek); // D Yaban tavsani
        System.out.println(avk1.ayak); // B Kuslarin ayagi vardir

        avk1.hareket(); // D Avci kuslar ucarlar
        avk1.beslenme(); // D Avci kuslar et yerler
        avk1.pence(); // D Avci kuslarin penceleri vardir
        avk1.gaga(); // D Avci kuslar sivri gagalidir
        avk1.kanat(); // B Kuslar kanatlidir
        avk1.solunum(); // B Kuslar akcigerle nefes alirlar
        avk1.cogalma(); // B Kuslar yumurtayla cogalir
        avk1.omur(); // A Hayvanlar yasar ve olur

        BKuslar avk2= new DAvciKuslar();
        System.out.println(avk2.tur); // B Kus
        System.out.println(avk2.isim); // B Kus Isim belirtilmedi
        //System.out.println(avk2.yasamYeri); // B'de yok CTE
        //System.out.println(avk2.enSevdikleriYiyecek); // B'de yok CTE
        System.out.println(avk2.ayak); // B Kuslarin ayagi vardir

        avk2.hareket(); // D Avci kuslar ucarlar
        avk2.beslenme(); // D Avci kuslar et yerler
        // avk2.pence(); // B veya A'da yok CTE
        avk2.gaga(); // D Avci kuslar sivri gagalidir
        avk2.kanat(); // B Kuslar kanatlidir
        avk2.solunum(); // B Kuslar akcigerle nefes alirlar
        avk2.cogalma(); // B Kuslar yumurtayla cogalir
        avk2.omur(); // A Hayvanlar yasar ve olur

        AHayvanlar avk3= new DAvciKuslar();
        System.out.println(avk3.tur); // A Hayvan
        System.out.println(avk3.isim); // A hayvan Isim belirtilmedi
        //System.out.println(avk3.yasamYeri); // A'da yok CTE
        //System.out.println(avk3.enSevdikleriYiyecek); // A'da yok CTE
        //System.out.println(avk3.ayak); // A'da yok CTE

        avk3.hareket(); // D Avci kuslar ucarlar
        avk3.beslenme(); // D Avci kuslar et yerler
        //avk3.pence(); // A'da yok CTE
        //avk3.gaga(); // A'da yok CTE
        //avk3.kanat(); // A'da yok CTE
        avk3.solunum(); // B Kuslar akcigerle nefes alirlar
        avk3.cogalma(); // B Kuslar yumurtayla cogalir
        avk3.omur(); // A Hayvanlar yasar ve olur

    }

}
