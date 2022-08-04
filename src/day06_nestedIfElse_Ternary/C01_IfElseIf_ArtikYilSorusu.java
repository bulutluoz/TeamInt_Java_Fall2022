package day06_nestedIfElse_Ternary;

import java.util.Scanner;

public class C01_IfElseIf_ArtikYilSorusu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Artik yil kontrolu icin yil giriniz");
        int yil= scan.nextInt();

        if(yil%4 != 0){  // yil 4'e bolunuyor mu ==> Hayir
            System.out.println("Girilen yil artik yil degil");

        }else if (yil%100 != 0){ // yil 100'e bolunuyor mu ==> Hayir
            System.out.println("Girilen yil artik yil");

        }else if (yil%400 ==0){ // yil 400'e bolunuyor mu ==> Evet
            System.out.println("Girilen yil artik yil");
        }else{
            System.out.println("Girilen yil artik yil degil");
        }

        /*
        if (sart){
            sart saglanirsa calisacak kod
        }else {
            ya if body calisir ya da else body
        }

        if(not>85){
           AA
           } else if(sayi>65){
           BB
           } else if (sayi>50){
           CC
           } else {
           DD
           }


         */


    }
}
