package day22_arrayList_forEachLoop;

public class C09_ForEachLoop {
    public static void main(String[] args) {

        /*
          Verilen int bir array'deki
          tum elementlerin karelerini toplayip yazdirin
         */

        int[] arr = {3,4,5,1};

        int toplam=0;

        for (int each: arr
             ) {

            toplam+= each*each;
        }

        System.out.println("arraydeki sayilarin kareleri toplami : " + toplam);
    }
}
