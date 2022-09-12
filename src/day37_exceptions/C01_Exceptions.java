package day37_exceptions;

import java.util.Scanner;

public class C01_Exceptions {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bolunecek tamsayiyi girin");
        int a= scan.nextInt();
        System.out.println("Lutfen bolecek tamsayiyi girin");
        int b= scan.nextInt();

        if (b==0){
            System.out.println("Bolecek sayi 0 olamaz");
        }else{
            System.out.println("Bolme isleminin sonucu : "+  a/b);
        }
        System.out.println("Iyi gunler");

        /*
            Exception in thread "main" java.lang.ArithmeticException: / by zero
        at day37_exceptions.C01_Exceptions.main(C01_Exceptions.java:15)

        Java sizin ongormediginiz bir problemle karsilasirsa
        hatanin turunu, kaynagini ve hangi satirda olustugunu hata mesaji olarak verir
        ve calismayi durdurur
         */
    }
}














