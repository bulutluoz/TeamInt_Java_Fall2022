package day38_exceptions;

import java.util.Scanner;

public class C07_IllegalArgumentException {
    public static void main(String[] args) {

        /*
          Biz istersek, kontrollu olarak da exception firlatabiliriz

          Kullanicidan yasini isteyin
          Kullanici negatif yas girerse
          illegalInputException firlatip calismayi durdurun
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int sayi=scan.nextInt();

        if (sayi<0){
            throw new IllegalArgumentException("Yas negatif olamaz");
        }

    }
}
