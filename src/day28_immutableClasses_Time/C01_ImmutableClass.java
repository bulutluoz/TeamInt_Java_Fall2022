package day28_immutableClasses_Time;

public class C01_ImmutableClass {

    public static void main(String[] args) {

        String str1= "Seher";

        String str2= str1;

        String str3= "Se" + "her";

        String str4=new String("Seher");

        String str5= "Se";
        String str6= "her";
        String str7=str5.concat(str6);

        // String'de == hem metne hem de referans'a bakar, dolayisiyla metin ayni olsa bile
        // bazen false verebilir
        // emin olmak icin == yerine equals kullanmak daha iyidir.

        System.out.println(str1==str2); // true

        System.out.println(str1==str3); // true

        System.out.println(str1==str4); // false
        System.out.println(str1.equals(str4)); // true

        System.out.println(str1==str7); // false
        System.out.println(str1.equals(str7)); // true

        System.out.println(str1=="Seher"); // true

        /*
          Java basit sekilde olusturulan String'leri
          StringPool'da tutar

          Yeni bir String basit sekilde olusturuldugunda
          Java once StringPool'da bu degerde String var mi kontrol eder
          varsa, yeni bir obje olusturmak yerine
          yeni variable'a eskisine ortak yapar
          boylece hem referansi, hem de degeri ayni olan iki String olusur
          ve bu durumda == kullanirsa true doner
         */


    }


}
