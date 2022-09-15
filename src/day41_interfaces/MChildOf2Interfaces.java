package day41_interfaces;



public class MChildOf2Interfaces implements I04_Parent1,I05_Parent2{

    public static void main(String[] args) {
        System.out.println(I04_Parent1.sayi1); //10
        System.out.println(I04_Parent1.sayi2);

    }

    @Override
    public void method1() {

    }

    @Override
    public int method2() {
        return 0;
    }



}
