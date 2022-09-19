package day41_interfaces;

public class NChildOfI06 implements I06_Interface{

    public void method1() {

    }
    public static void main(String[] args) {

        I06_Interface.method3();

        NChildOfI06 obj = new NChildOfI06();
        obj.method2();
    }
}


