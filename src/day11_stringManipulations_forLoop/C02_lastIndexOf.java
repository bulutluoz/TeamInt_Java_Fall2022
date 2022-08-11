package day11_stringManipulations_forLoop;

public class C02_lastIndexOf {

    public static void main(String[] args) {

        String str= "Java cok guzel, cok";

        System.out.println(str.indexOf("cok")); // 5
        System.out.println(str.lastIndexOf("cok")); // 16

        System.out.println(str.indexOf('o')); // 6
        System.out.println(str.lastIndexOf('o')); // 17


        System.out.println(str.indexOf("cok",10)); // 16
        // 10.index ve sonrasinda arama yapar

        System.out.println(str.lastIndexOf("cok" , 10)); // 5
        // 10.index ve oncesinde arama yapar
        System.out.println(str.lastIndexOf('x')); // -1
        System.out.println(str.lastIndexOf("x",10)); // -1

        /*
          Kullanicidan bir cumle ve bir kelime isteyin
          cumlede kelimenin kullanimina gore
          asagidaki cumlelerden uygun olani yazdirin
          - cumle aradiginiz kelimeyi icermiyor
          - aradiginiz kelime cumlede sadece 1 tane var
          - aradiginiz kelime cumlede birden fazla var
         */

        String aranankelime="guzel";

        int ilkIndex= str.indexOf(aranankelime);
        int sonIndex= str.lastIndexOf(aranankelime);

        if (!str.contains(aranankelime)){
            System.out.println("cumle aradiginiz kelimeyi icermiyor");
        } else if (ilkIndex==sonIndex) {
            System.out.println("aradiginiz kelime cumlede sadece 1 tane var");
        }else {
            System.out.println("aradiginiz kelime cumlede birden fazla var");
        }



    }
}
