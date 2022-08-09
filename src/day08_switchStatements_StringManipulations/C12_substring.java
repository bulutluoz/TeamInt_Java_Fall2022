package day08_switchStatements_StringManipulations;

public class C12_substring {


    public static void main(String[] args) {
        // substring() : verilen bir String'in istenen bir parcasini bize dondurur

        String str= "Java Guzeldir";

        System.out.println(str.substring(2)); // va Guzeldir

        System.out.println(str.substring(10)); // dir

        System.out.println(str.substring(str.length()-3)); // dir

        System.out.println(str.substring(str.length()-1)); // r

        System.out.println(str.substring(str.length())); // java hiclik dondurur

        // System.out.println(str.substring(14)); // StringIndexOutOfBoundsException

        System.out.println(str.substring(0)); // Java Guzeldir

        System.out.println(str.substring(3)); // a Guzeldir

    }
}
