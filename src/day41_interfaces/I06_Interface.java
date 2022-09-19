package day41_interfaces;

public interface I06_Interface {

    // Bir interface'de body'si olan method olur mu ?

    /*
     Interface'lerde concrete method olmaz
     tum method'lar public ve abstract'dir

     Java'da bir interface'e sonradan bir abstract method eklersek
     O interface'i implement etmis tum class'lar bu yeni method'u implement etmek zorunda kalir

     Java gelen talepler dogrultusunda
     eklenen yeni method tum child class'lar tarafindan implement edilmek zorunda kalmasin diye
     bir istisna olusturmus

     eger yeni olusturulan method static veya default keyword'unu kullaniirsa
     Java bu method'un body'si olmasina ve
     tum child class'lar tarafindan implement etme mecburiyeti olmamamsina izin vermis

     buradaki default access modifier olmadigi icin public ile kullanilabiliyor

     Bu istisnai durum icin 2 keyword arasindaki fark
     default ile olusturulan method'a obje ile ulasabiliriz
     static ile olusturulan method'a static yontemle ulasabiliriz

     */

    void method1(); // bu method public ve abstractir

    public default void method2(){
        System.out.println("interface default method");
    }

    public static void method3(){
        System.out.println("interface static method");
    }
}
