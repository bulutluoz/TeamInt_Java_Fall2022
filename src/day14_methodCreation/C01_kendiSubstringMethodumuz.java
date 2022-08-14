package day14_methodCreation;

public class C01_kendiSubstringMethodumuz {

    public static void main(String[] args) {

        String str= "Java Candir";

        /*
         kullanicidan input olarak verilen
         baslangic ve bitis indexlerine gore
         baslangic index'i dahil, bitis index'i haric olacak sekilde
         aradaki harfleri yazdirin

         kullanici baslangic degeri olarak,
         bitis degerinden buyuk bir sayi girerse, hata mesaji verin

         kullanici str'da olan index'lerden daha buyuk bir index girerse
         hata mesaji yazdirin
         */

        int basIndex=2;
        int bitIndex=6;

        kendiSubstringMethodumuz(str,basIndex,bitIndex);
        kendiSubstringMethodumuz(str,3,5);
        kendiSubstringMethodumuz(str,0,1); // J
        kendiSubstringMethodumuz(str,-2,3); // hata mesaji

        System.out.println(str.substring(2,6));
        String yeniStr=str.substring(1,4); // ava

        // kendi substring methodumuzu bize String dondurecek sekle getirelim

        System.out.println(stringDondurenKendiSubstringMethodumuz(str,0,1)); // J
        String ilkHarf=stringDondurenKendiSubstringMethodumuz(str,0,1);



    }









    public static void kendiSubstringMethodumuz(String str, int basIndex, int bitIndex) {

        if (basIndex>bitIndex){
            System.out.println("Baslangic indexi, bitis index'inden buyuk olamaz");
        } else if (basIndex<0 || basIndex>str.length()-1 || bitIndex<0 || bitIndex>str.length()-1){
            System.out.println("Gecersiz index kullanimi");
        }else {
            for (int i = basIndex; i <bitIndex ; i++) {
                System.out.print(str.charAt(i)+"");
            }
        }
        System.out.println("");
    }

    public static String stringDondurenKendiSubstringMethodumuz(String str, int basIndex, int bitIndex){
        String istenenSubstring="";
        if (basIndex>bitIndex){
            System.out.println("Baslangic indexi, bitis index'inden buyuk olamaz");
        } else if (basIndex<0 || basIndex>str.length()-1 || bitIndex<0 || bitIndex>str.length()-1){
            System.out.println("Gecersiz index kullanimi");
        }else {

            for (int i = basIndex; i <bitIndex ; i++) {
                istenenSubstring+=str.charAt(i);

            }
        }

        return istenenSubstring;
    }
}
