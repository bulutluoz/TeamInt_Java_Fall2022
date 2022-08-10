package day10_stringManipulations;

public class C02_isEmpty {

    public static void main(String[] args) {


        String str= "Java ogren, 70000 euro offer al";

        System.out.println(str.isEmpty()); // false

        String str2="";

        System.out.println(str2.isEmpty()); // true


        String str3= "   ";
        System.out.println(str3.isEmpty()); // false
        System.out.println(str3.isBlank()); // true

        System.out.println(str2.length()); // 0
        System.out.println(str3.length()); // 3

        /*
        Java'da null pointer diye bir isaretci var
        null pointer bir deger degildir
        ama bir String'in degerinin atanmadigini isaret eder

        Java'da bir String variable'a basta deger atamamak istersek
        iki ihtimal var
        ya null ile isaretleriz
        String str4=null;
        java yazdirdiginizda bunun null oldugunu yazdirir
        ama baska bir method calistirmak isterseniz RTE verir

        veya sadece deklare eder, deger atamayiz
        String str5;
        ne yazdirabilirsiniz, ne de herhangi bir kodda kullanabilirsiniz
        bu variable'i yazarsaniz java CTE verir

         */

        String isim1=null;  // null bir deger degildir, bu satirda bir deger atamasi yoktur
                            // sadece isim1 null olarak isaretlenmistir.
        String isim2;

        String isim3="";

        System.out.println(isim3);
        //hiclik yazdirir, konsolda birsey gorunmez

        System.out.println(isim3.length()); // 0

        //System.out.println( isim2 ); // CTE
        //System.out.println( isim2.length()); // CTE

        System.out.println(isim1); // null
        System.out.println(isim1.length()); // NullPointerException

        // sen isim1'e deger atamadin, sadece onu bos olarak isaretledin
        // deger atamadigin bir ismi herhangi bir method'la kullanamazsin


        // System.out.println(isim1.isEmpty()); calisir ama RTE verir
        // System.out.println(isim2.isEmpty()); hic calismaz CTE verir

    }
}
