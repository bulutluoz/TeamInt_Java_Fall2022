package day01_variables;

public class C01_Variables {

    public static void main(String[] args) {

        System.out.println("Hello World");

        // Buraya yazilan yazilari Java okumaz
        // bu satirlara comment denir
        // kod yazan kisinin kendisine veya takim arkadaslarina
        // kodun nasil calistigini anlatmasi icin kullanilir

        /*
        Java bu
        satirlardaki
        kodlari da
        okumaz
         */
        int sayi=12;

        int numara;

        System.out.println(sayi); //12

        /*
        System.out.println(numara);
        Java deger atamasi olmadan sadece deklarasyon yapmamiza izin verir
        ancak deger atamasi yapmadan kullanmamiza izin vermez
         */

        numara=20;
        System.out.println(numara); //20

        /*
        String numara=40;
        deklarasyon sadece bir kere olur
        ama deger atamasi istedigimiz kadar yapilabilir
         */

    }

}

