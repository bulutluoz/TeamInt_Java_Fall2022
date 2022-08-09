package day09_stringManipulations;

public class C03_startsWith {

    public static void main(String[] args) {

        String str="Java cok guzel,cok.";

        System.out.println(str.startsWith("J")); // true
        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("Java cok guzel,cok.")); // true
        System.out.println(str.startsWith("")); // true

        System.out.println(str.startsWith("cok")); // false



        System.out.println(str.startsWith("cok",5)); // true
        System.out.println(str.startsWith("guzel",10)); // false



    }
}
