package day16_scope;

public class C01_Scope {
    // class level demek class'in icinde ama tum method'larin disinda demektir

    static int s1=12;
    public static void main(String[] args) {
        /*
          Java'da scope hangi variable'in nereden kullanilabilecegini
          yada hangi satirda hangi variable'lari kullanabilecegimizi
          belirleyen kurallardir.

          bir variable'in scope'undan bahsedersek
          o variable'in nerelerde kullanilabilecegini konusmamiz gerekir

          bir method icin scope'dan bahsedersek
          o method icerisinde kullanilabilecek variable'lardan bahsederiz

          1- bir method'un icerisinde olusturulan variable baska method'da direk kullanilamaz

          Bu durumda class icerisinde tum method'lardan kullanilmasini istedigimiz
          variable'lari class level'da olustururuz.
         */
        int sayi= 10;
        // System.out.println(str);
        System.out.println(s1); // 12
    }

    public static void digerMethod(){

       // System.out.println(sayi);

        String str="java";
        System.out.println(s1); // 12
    }
}
