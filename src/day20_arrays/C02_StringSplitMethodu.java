package day20_arrays;

import java.util.Arrays;

public class C02_StringSplitMethodu {
    public static void main(String[] args) {

        String str= "Ali topu at, at Ali at";

        String[] kelimeler= str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); // [Ali, topu, at,, at, Ali, at]

        String[] adanAyir=str.split("a");
        System.out.println(Arrays.toString(adanAyir)); // [Ali topu , t, , t Ali , t]

        // str string'inde kac kelime var
        System.out.println(kelimeler.length); // 6

        // str stringinde kullanilan sesli harfleri silin
        // verilen bir string'i karakterlerine ayirmak istersek

        String[] tumkarakterler= str.split("");
        System.out.println(Arrays.toString(tumkarakterler));
        // [A, l, i,  , t, o, p, u,  , a, t, ,,  , a, t,  , A, l, i,  , a, t]

        String sesliHarfOlmadan="";
        String harf="";
        for (int i = 0; i < tumkarakterler.length ; i++) {
            harf=tumkarakterler[i];

            if (!(harf.equals("A") ||harf.equals("a") || harf.equals("E") || harf.equals("e") ||
                    harf.equals("i") || harf.equals("I") || harf.equals("o") || harf.equals("O")
                    || harf.equals("u") || harf.equals("U"))
            ){
                sesliHarfOlmadan+=harf;
            }

        }

        System.out.println(sesliHarfOlmadan);
    }
}
