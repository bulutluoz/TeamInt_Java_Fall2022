package day29_dateTime_varargs;

public class C12_SB {

    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Veli Cem");

        sb1.delete(4,7); // ilk index dahil, 2.index haric olarak aradakile

        System.out.println(sb1); // Velim

        sb1.deleteCharAt(4);

        System.out.println(sb1); // Veli

        sb1.insert(4, " Han");

        System.out.println(sb1); // Veli Han

        sb1.replace(5,8,"Tan");

        System.out.println(sb1); // Veli Tan

        sb1.reverse();

        System.out.println(sb1); //  naT ileV

        StringBuilder sb3= new StringBuilder("12Java45");
        String isim = "Mesut";

        sb3.append(isim,2,4);

        System.out.println(sb3);


    }
}
