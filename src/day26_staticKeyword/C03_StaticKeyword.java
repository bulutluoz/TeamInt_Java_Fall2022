package day26_staticKeyword;

public class C03_StaticKeyword {

    public static void main(String[] args) {

        // hic obje olusturmadan
        // C01'deki static variable'lari kullanabiliriz

        System.out.println(C01_StaticKeyword.sayi); //10


        C01_StaticKeyword.sayi=20;

        System.out.println(C01_StaticKeyword.sayi); //20

        C01_StaticKeyword obj=new C01_StaticKeyword();

        System.out.println(obj.no + ", " + obj.sayi); // 20, 20

        /*
         static variable'lar class'a aittir ve class ile birlikte olusturulur
         hic obje olusturmasak da static variable'lar kullanilabilir
         veya update edilebilir

         19. instance no variable'nin degerini bulmak icin
             objenin olusturuldugu 17.satirdan sonrasini inceleriz

          Ancak
          19.satirda static variable'in degerini gormek icin
          class'in basindan itibaren 19.satira kadar
          static variable'i takip etmeliyiz.
         */


    }
}
