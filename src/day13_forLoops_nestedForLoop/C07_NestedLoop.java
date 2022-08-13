package day13_forLoops_nestedForLoop;

public class C07_NestedLoop {
    public static void main(String[] args) {
                /*
         Asagidaki sekli yazdiran bir program yaziniz
         kac satir oldugu ve stirda kac yildiz olacagi input olarak veriliyor
         *
         * *
         * * *
         * * * *
         */

        int satir=8;

        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
