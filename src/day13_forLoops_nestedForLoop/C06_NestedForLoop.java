package day13_forLoops_nestedForLoop;

public class C06_NestedForLoop {

    public static void main(String[] args) {
        /*
          carpim tablosunu asagidaki formatta yazdiralim

          1
          2 4
          3 6 9
          4 8 12 16 ....
          satir sayisi input olarak verilecek
         */

        int satir=7;

        for (int i = 1; i <=satir ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print(i*j + "  ");
            }
            System.out.println("");
        }
    }
}
