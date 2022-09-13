package day38_exceptions;

import java.util.Scanner;

public class C07_IllegalArgumentException {
    public static void main(String[] args) {

        /*
          Biz kodumuzun istedigimiz satirinda exception firlattirabiliriz
          bu exception'in turu tamamen bizim tercihimize baglidir

          bir throw keyword'u ile sadece 1 exception firlatilabilir
          throw kelimesinden sonra new + exception class'i + ("hata mesaji")  yazilir
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");

        int sayi=scan.nextInt();

        if (sayi<0){
            throw new IllegalArgumentException("Yas negatif olamaz");
        }
    }
}



