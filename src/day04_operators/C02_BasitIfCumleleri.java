package day04_operators;

public class C02_BasitIfCumleleri {


    public static void main(String[] args) {

        int a= 10;
        int b= 20;

        if (a*b>100){
            System.out.println("Carpilari 100'den buyuk"); // OK
        }

        if (a>b) System.out.println("a b'den buyuk"); // OK degil
        System.out.println("2.sartin ikinci satiri");
        System.out.println("2.sartin 3.satiri");

        // if sartindan sonra sadece 1 satir kod yazacaksak {} kullanmasak da olur

        if (b<0){ // OK degil
            System.out.println("b 0'dan kucuk");
            System.out.println("3.sartin ikinci satiri");
            System.out.println("3.sartin 3.satiri");
        }

        /*
        Basit if cumleleri kodun geri kalani ile ilgilenmez
        dolayisiyla tum basit if cumlelerinin body'leri calisabilecegi gibi

         */


        boolean c= false;

        if (c){ // Ok
            System.out.println("c li if calisti");
        }

        String str="java";
        c= a * 5 > b*3;

        if (c){
            System.out.println("2.c'li if calisto'");
        }
    }

}
