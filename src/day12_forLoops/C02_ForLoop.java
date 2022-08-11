package day12_forLoops;

import java.util.Scanner;

public class C02_ForLoop {

    public static void main(String[] args) {

        // kullanicidan baslangic ve bitis sayilarini alin
        // sinirlar dahil olmak uzere
        // sinirlar ve aralarindaki sayilardan 5 ile bolunebilenleri yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("baslangic sayisini girin");
        int bas=scan.nextInt();
        System.out.println("bitis degerini girin");
        int bitis= scan.nextInt();


        for (int i = bas; i <=bitis ; i++) {

            if (i%5==0){
                System.out.print(i + " ");
            }
        }


    }
}
