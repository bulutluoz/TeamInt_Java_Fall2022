package day12_forLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        // kullanicidan 20'den kucuk bir pozitif tamsayi alip
        // bu sayinin faktoryel'ini yazdirin
        // 5 ! = 5 * 4 * 3 * 2 * 1 = 120

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk pozitif bir tamsayi girin");
        int sayi= scan.nextInt(); // 12

        int faktoryel=1;

        System.out.print(sayi + "! = ");
        for (int i = sayi ; i >=1 ; i--) {

            faktoryel *=i;
            if (i>1){
                System.out.print( i + " * ");
            }else System.out.print( i);
        }

        System.out.println(" = " + faktoryel);


        // 5 ! = 5 * 4 * 3 * 2 * 1 = 120   bu sekilde yazdirarak sonucu kullaniciya verelim



    }
}
