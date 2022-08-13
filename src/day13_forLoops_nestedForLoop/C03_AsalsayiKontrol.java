package day13_forLoops_nestedForLoop;

import java.util.Scanner;

public class C03_AsalsayiKontrol {
    public static void main(String[] args) {
        /* Kullanicidan bir sayi alip asal sayi olup olmadigini yazdirin
          Asal sayi : kendisi ve 1 disinda hicbir poitif tamsayiya bolunemeyen

          For loop'un herhangi bir durumda calismayi durdurmasini istiyorsak
          break; kullanabiliriz


         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        boolean flagAsalMi=true;


        // 25457 2==> 25456'ya kadar her hangi bir sayiya bolunurse
        // asal olmadigini anliyoruz
        // bunu Javanin da anlamasini saglayalim
        // bunu javanin anlamasi icin bir bayrak kullanabiliriz
        // bayrak degisti ise istenmeyen durum gerceklesti demektir

        for (int i = 2; i < sayi ; i++) {

            if (sayi%i==0){
                flagAsalMi=false;
                break;
            }

        }

        // burada nasil bir sonuc yazilmali
        // asal iken mi ? asal degilken mi ?
        if (flagAsalMi){
            System.out.println("Girdiginiz deger asal sayi");
        }else {
            System.out.println("Girdiginiz deger asal sayi degil");
        }
    }
}
