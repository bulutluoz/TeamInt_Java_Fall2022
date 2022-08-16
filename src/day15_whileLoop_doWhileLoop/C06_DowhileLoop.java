package day15_whileLoop_doWhileLoop;

public class C06_DowhileLoop {
    public static void main(String[] args) {


        int sayi = 15;

        while(sayi<14){

            System.out.println(sayi);

            sayi++;

        }

        /*
        1- While loop loop sayisindan bir fazla sart kontrolu yapar
        bunun onune gecmek icin do-while loop kullanabiliriz

        2- while loop'da ilk deger sarti saglamiyirsa
          while body'si hic calismayabilir
          ancak do-while loop kullanirsak
          body en az bir kere MUTLAKA calisir
         */

        sayi=15;
        do {
            System.out.println(sayi);

            sayi++;

        }while (sayi<14);

    }
}

