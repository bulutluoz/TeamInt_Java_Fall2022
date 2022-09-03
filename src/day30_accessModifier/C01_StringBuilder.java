package day30_accessModifier;

public class C01_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder(10);

        System.out.println(sb.capacity()); // 10

        System.out.println(sb.length()); // 0

        sb.append("Ali Can");

        System.out.println(sb.capacity()); // 10

        System.out.println(sb.length()); // 7

        sb.trimToSize();
        // SB'in kapasitesini fiili olarak kullanilan boyuta yani length'e esitler

        System.out.println(sb.capacity()); // 7

        System.out.println(sb.length()); // 7


        StringBuilder sb2=new StringBuilder("Ali Can");

        System.out.println(sb==sb2); // false
        System.out.println(sb.equals(sb2)); // false

        System.out.println(sb.compareTo(sb2)); // Ali Can ==> Ali Can ve sonuc 0
        // arada hic fark yok ise sonuc 0 olur

        StringBuilder sb3=new StringBuilder("Ali Cem"); // Ali Can ==> Ali Cem  ve sonuc -8
        System.out.println(sb.compareTo(sb3)); // -4

        /*
        Bizim icin onemli olan 0 mi degil mi ?
        0 ise iki SB ayni
        0 degilse iki SB farkli
         */

    }
}
