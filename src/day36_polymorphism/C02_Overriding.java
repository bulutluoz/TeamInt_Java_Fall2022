package day36_polymorphism;

public class C02_Overriding extends C01_Overloading{

    public static void main(String[] args) {
        /*
          Overriding parent class'daki bir method'u child class'a uyarlamak icin kullanilir

          Overriding yapmak icin parent class'daki method ile child class'daki method'un
          signature'lari AYNI OLMALIDIR.
          Child class'a uyarlamayi method body'sinde

          Signature farkli olursa bu iki method overriden / overriding method olmaz
          farkli 2 method olur

         */
        C02_Overriding obj=new C02_Overriding();
        obj.islem(4,5); // 20.0
        obj.islem("Veli", "Cem"); // Veli
        obj.islem("Hasan", 4); // Hasan

        C01_Overloading obj2=new C02_Overriding();
        obj2.islem(5,6.4); // 32.0
        obj2.islem(5,"Ali"); // 5 Ali

        C01_Overloading obj3=new C01_Overloading();
        obj3.islem(5,6); ; // 11.0
        obj3.islem(5,"Ali"); // 5 Ali
    }

    public void islem(double a, double b){
        System.out.println(a * b);
    }
    public void islem(String c, int d){
        System.out.println(c);
    }
}
