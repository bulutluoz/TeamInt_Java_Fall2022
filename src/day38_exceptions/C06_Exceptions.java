package day38_exceptions;

public class C06_Exceptions {
    public static void main(String[] args) {

        // 4- NumberFormatException
        //    parseInt () kullandigimizda string'de sayi disinda bir karakter olursa 56a vb..
        String str= "567";

        System.out.println(Integer.parseInt(str) +3); // NumberFormatException


        // 5 - ClassCastException  uygun olmayan cast islemlerinde ortaya cikar

        String a= "Java";

        //  Integer b= a;  farkli data turlerindeki variable'lari birbirine atayamayiz

        Object b = a; // Object class'i String'in parent class'i oldugundan kabul eder

        Integer c= (Integer)b;
        // object class'i Integer'in da parent'i oldugundan casting ile kabul etti

        System.out.println(c);
    }
}



