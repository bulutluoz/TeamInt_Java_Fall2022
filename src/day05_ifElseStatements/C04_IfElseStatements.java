package day05_ifElseStatements;


import java.util.Scanner;

public class C04_IfElseStatements {

    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char girilenChar=scan.next().charAt(0);

        if (girilenChar>='A' && girilenChar<='Z'){
            System.out.println("Girilen karakter buyuk harf");
        }else{
            System.out.println("Girilen karakter buyuk harf degil");
        }
    }
}
