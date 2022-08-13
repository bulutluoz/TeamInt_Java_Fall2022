package day13_forLoops_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        /*
         Asagidaki sekli yazdiran bir program yaziniz
         kac satir oldugu ve stirda kac yildiz olacagi input olarak veriliyor
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
         */

        int satirsayisi= 6;
        int satirdakiyildizSayisi=13;

        for (int i = 1; i <=satirsayisi ; i++) {

            for (int j = 1; j <=satirdakiyildizSayisi ; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
