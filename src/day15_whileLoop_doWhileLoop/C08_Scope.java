package day15_whileLoop_doWhileLoop;

public class C08_Scope {

    public static void main(String[] args) {

        int a=10;

        String str="Java gun gectikce guzellesiyor";

        // String a="Java";
        // ayni method'da ayni isimde birden fazla variable olusturulamaz

    }


    public static void method1(){

        int a=20;
        //System.out.println(str);
        // bir method'da baska method'daki variable'lara ulasamazsiniz


        /* Scope
           Java'da scope hangi variable'lara nereden ulasabilecegimizi
           ve nereden ulasamayacagimizi bilmemiz acisindan onemlidir.
         */
    }
}
