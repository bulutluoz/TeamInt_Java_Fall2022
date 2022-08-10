package day08_switchStatements_StringManipulations;

public class C13_substring {
    public static void main(String[] args) {

        String str= "Java Guzeldir.";

        System.out.println(str.substring(1,3)); // av

        System.out.println(str.substring(5,10)); // Guzel

        System.out.println(str.substring(0,12)); // Java Guzeldi

        // son 3 karakter haric tum metni yazdiralim

        System.out.println(str.substring(0, str.length()-3)); // Java Guzeld

        System.out.println(str.substring(3,3));
        // hiclik yazdirir, konsolda birsey gorunmez

        // sadece 5.index'deki harfi yazdiralim
        System.out.println(str.substring(5,6));

        // sadece 2.indexteki harfi buyuk harf olarak yazdiralim
        System.out.println(str.substring(2,3).toUpperCase());

        //
        System.out.println(str.substring(5,2));
        // RTE 5.index'den sonra 2.index'i bulamaz


    }
}
