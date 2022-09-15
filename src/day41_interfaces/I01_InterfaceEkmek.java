package day41_interfaces;

public interface I01_InterfaceEkmek {
    /*
      Interface'ler tam abstraction saglar
      iclerinde CONCRETE method BULUNMAZ
      Interface'ler concrete child class'lar icin blueprint(sablon) ozelligi tasir

      Interface'in class'a gore cok buyuk bir avantaji vardir
      Java'da bir class sadece bir class'i parent edinebilir
      Eger birden fazla class'i parent edinmek istersek hiyerarsi ile parent zinciri olustururuz

      Interface'lerde durum farklidir
      bir class istedigi kadar interface'i implement edebilir.

      Bir class'i bir interface'e child yapmak icin extends degil implements keyword kullanilir
      istenirse interface de baska bir interface'i parent edinebilir
      bu durumda interface'ler arasinda extends keyword kullanilir

      Bir class hem baska bir class'a extends ile child olup,
      hem de istedigi kadar interface'i implement edebilir

      Interface'lerde sadece public ve abstract method'lar bulunur
      Interface'lerde variable'lar da public, static ve final'dir.
      variable'lar final oldugu icin sonradan degeri degistirilemez
      olustururken deger atamasi yapmak zorunludur.

      birden fazla interface'i implement eden bir class
      tum interface'lerdeki variable'lara ulasabilir
      eger ayni isimde bir variable birden fazla parent interface'de varsa
      Java static yolu kullanarak interfaceAdi.variableAdi ile karisikligin onune gecer

      eger farkli iki parent Interface'de ayni isimde method varsa
      biz bir kere override etsek yeterli olacaktir
      Ancak farkli intrface'lerdeki method'larin return type'lari da farkli ise
      bu durumda her method kendi return type'ni isteyecektir
      birini yapsak oteki kabiul etmeyecektir
      Bu sorunun cozumu parent interface'lere mudahale edip
      ayni isimdeki method'un return type'ini esitlemek gerekir


     */

    public abstract void un( );
    public abstract void maya( );
    public abstract void bicim( );
    public abstract void gramaj( );


}
