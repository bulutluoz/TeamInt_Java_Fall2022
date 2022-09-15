package day40_abstractClasses;

public abstract class CAbstractEkmek {

    /*
      Bir abstract class'in amaci object olusturmak degil
      child class'lari icin bir kalip olusturmaktir

      Ornegin adi sadece ekmek olan bir obje yoktur
      Bu class'in gorevi farkli ekmek turlerinin ortaya koyacaklari ozellikleri standartlastirmaktir.

      Bunu saglayabilmek icin
      1- class abstract yapilir
         bunun icin class keyword'den once abstract yazilir
         bugune kadar olusturdugumuz abstract olmayan class'lara da concrete class denir
      2- bir class'i abstract yapinca o class'da abstract method olusturabiliriz.
         abstract method :  body'si olmayan,
                            child class'lar icin zorunlu standart olacak methodlardir
      3- bir abstract class'in icinde abstract ve concrete method'lar bulunabilir
         abstract method'lar child class'lar tarafindan uyarlanmak (implement edilmek) zorundadir
         ancak concrete method'lari implement etme mecburiyeti yoktur
      4- Concrete class'larin icerisinde abstract method olmaz
      5- Abstract bir class abstract baska bir class'a extends edilirse
         abstract method'lari implement etmek zorunda degildir
         abstract class kural koyucudur, kurallari uygulayacaklar concrete class'lardir
         bir abstract class yeni kurallar koyabilir ancak
         obje olusturulamayacagi icin koyulan kurallara uymak zorunda degildir
         Ancak isterse parent class'daki method'lardan istedigini kendine uyarlayabilir
      6- Birden fazla abstract parent'i olan ilk concrete class
         parent abstract class'lardaki concrete hale donusturulmeyen
         tum abstract method'lari implement etmek zorundadir
      7- Abstract class'larin constructorlari vardir ama
         Abstract class'lardan obje uretilemez
      8- Abstract method'lar final veya private olamaz
         abstract method'lar override edilmek icin olusturulur
         static, final ve private method'lar override edilemez

     */


    public abstract void un( );

    public abstract void maya( );

    public void tuz( ){

        System.out.println("Ekmekte tuz kullanilabilir");
    }
    public abstract void bicim( );
    public abstract void gramaj( );
}



