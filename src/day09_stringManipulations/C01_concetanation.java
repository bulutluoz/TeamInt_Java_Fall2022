package day09_stringManipulations;

public class C01_concetanation {
    public static void main(String[] args) {

        String a= "Java";
        String b= "Guzeldir";
        String c= "";
        String d= " ";

        int s = 5;
        int t = 4;

        // Sadece yukaridaki variable'lari kullanarak

        // Java Guzeldir 9 yazdiralim

        System.out.println(a+d+b+d+s+t); // Java Guzeldir 54

        System.out.println(a+d+b+d+(s+t)); // Java Guzeldir 9

        /*
          String method'lari icerisinde + islemi yerine kullanabilecek
          concat() vardir.
         */

        // Java Guzeldir 9 yazdiralim

        System.out.println(a.concat(b)); // JavaGuzeldir
        System.out.println(a.concat(d).concat(b).concat(d).concat(s+t+c)); // Java Guzeldir 9



    }
}
