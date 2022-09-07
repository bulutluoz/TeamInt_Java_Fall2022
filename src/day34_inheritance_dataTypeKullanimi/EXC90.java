package day34_inheritance_dataTypeKullanimi;

public class EXC90 extends DVolvo{

    void yakit(){
        System.out.println("XC90 benzin kullanir");
    }

    void motor(){
        System.out.println("XC90 2000 motor kullanir");
    }

    void kasa(){
        System.out.println("XC90 SUV kasa kullanir");
    }

    public static void main(String[] args) {

        EXC90 arb1= new EXC90();

        arb1.yakit(); // E
        arb1.motor(); // E
        arb1.kasa(); // E
        arb1.guvenlik(); // D
    }
}
