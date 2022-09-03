package day29_dateTime_varargs;

public class C10_StringBuilder {
    public static void main(String[] args) {

        /*
         Java'da metin ifadeler icin olusturulmus 3 class vardir
         String : Immutable

         String Builder : Mutable , Multi Thread uygulamalarda kullanilamaz, hizlidir

         String Buffer : Mutable , Multi Thread uygulamalarda kullanilabilir , yavastir
         */

        StringBuilder sb1=new StringBuilder();
        // kapasitesi 16 olan bos bir SB olusturur
        System.out.println(sb1.capacity()); // 16

        StringBuilder sb2= new StringBuilder("Ali Can");
        // yazilan String'e uygun kapasitede SB olusturur
        // ve icine Ali Can yazar
        System.out.println(sb2.capacity()); // 23

        StringBuilder sb3= new StringBuilder(7);
        // kapasitesi 7 olan bir SB olusturur
        System.out.println(sb3.capacity()); // 7


        sb3.append("Ali Can");
        System.out.println(sb3.capacity()); // 7

        sb3.append(" iyi adamdir.");
        System.out.println(sb3.capacity()); // 20

        sb3.append("Bunu herkes bilir.");
        System.out.println(sb3.capacity()); // 42
    }
}
