package day08_switchStatements_StringManipulations;

public class C07_equals {
    public static void main(String[] args) {
        /*
          Equals method'u verilen iki String'in
          metin olarak ayni olup olmadigini kontrol eder
         */

        int sayi=20;

        if (sayi==20){
            System.out.println("esitlik dogru");
        }

        char harf='b';
        if (harf=='c'){
            System.out.println("Harf c");
        }else {
            System.out.println("harf c degil");
        }

        String str1= "Fatih";
        String str2= "fatih";
        String str3= new String("Fatih"); // Fatih


        System.out.println("str3 : " + str3);

        System.out.println(str1==str2); // false
        System.out.println(str1==str3); // false


        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str2)); // false

        /*
          Eger iki String'in metin olarak ayni olup olmadigini kontrol etmek istersek
          equals method'u kullaniriz.

          Java String'leri karsilastirirken
          == kullanirsak hem metni, hem de referansini kontrol eder
          equals() kullanirsak SADECE METNE bakar
         */




    }
}
