package day29_dateTime_varargs;

public class C05_Varargs {
    public static void main(String[] args) {

        /* verilen iki sayiyi toplayip yazdiran bir method olusturun
           eger verilen sayi adedi degisirse her bir sayi adedi icin yeni bir method olusturmamiz gerekir

           Bu cok pratik degil
         */



        topla(3,5); // 8
        topla(3,4,5); // 12
        topla(3,4,5,6); // 18
    }

    public static void topla(int a, int b) {

        System.out.println("2 sayinin toplami : " + (a+b));
    }

    public static void topla(int a, int b, int c) {

        System.out.println("3 sayinin toplami : " + (a+b+c));
    }
    public static void topla(int a, int b, int c,int d) {

        System.out.println("4 sayinin toplami : " + (a+b+c+d));
    }
}
