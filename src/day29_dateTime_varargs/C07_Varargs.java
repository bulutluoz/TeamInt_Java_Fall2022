package day29_dateTime_varargs;

public class C07_Varargs {
    public static void main(String[] args) {

        /*
           verilen sayilardan ilki haric digerlerini toplayip
           bulunan toplam degerini ilk sayi ile carpip
           yazdiran bir method olusturun
           input 3,4,5,6
           output 3 * (4+5+6) = 45
         */

        islemYap(3,4,5,6,7,8,9,8,7,6,6,6,6,6,2,4);
    }

    public static void islemYap(int a, int... b) {

        int toplam=0;

        for (int each:b
             ) {
            toplam+=each;
        }
        System.out.println("istenen islemin sonucu : " + a*toplam);
    }
}
