package day07_ternary;

public class C05_Ternary {
    public static void main(String[] args) {

        int sayi= 10;

        // sayiyi kontrol edin
        // sayi cift ise sayi cifttir yazin
        // tek ise sayinin degerini 5 artirin

        /*
          ternary isleminin sonucunu bir variable'a atama yapacaksak
          ternary'nin true ve false bolumlerindeki data turlerinin ayni olmasi gerekir

          sayi = sayi%2==0 ? "cift sayi" : sayi+5 ;

          yazdigimizda sayi'ya String bir deger atanamayaci icin
          Java hata verir
         */


        System.out.println(sayi % 2 == 0 ? "cift sayi" : (sayi=sayi + 5));

        System.out.println("sayinin yeni degeri : " + sayi);
    }
}
