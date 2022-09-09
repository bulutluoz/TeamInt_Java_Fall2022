package day35_overriding;

public class FChild extends EParent{

    @Override
    void method1() {
        System.out.println("child method1");
    }


    void method2() {
        System.out.println("child method1");
    }

    /*
      Istersek IntelliJ bizim yerimize overriding method'lari olusturabilir
      Bunun icin code menusunden generate secip ovverride methods deriz

      Bu durumda intelliJ @Override notasyonu kullanir
      Bu notasyonu kullanmak mecburi degildir
      ANCAK kullanmakta fayda vardir

      Cunku @Override notasyonu kullanilirsa
      Java bu iki method'u gozetim altinda tutar
      ve overridden method silinirse CTE verir
     */
}
