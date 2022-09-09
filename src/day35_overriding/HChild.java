package day35_overriding;

public class HChild extends GParent{

    void method1() {
        System.out.println("child method1");
    }
    void method2() {
        System.out.println("child method2");
    }


    public static void main(String[] args) {

        GParent obj = new HChild();
        obj.method2();
        //obj.method1();
    }

    /*
    Kural 1 : private, static ve final method'lar override edilemez
    Child class'da, parent'da static veya final olarak
    tanimlanan bir method'un ismi ile ayni isimde
    method olusturursak java CTE verir

    Ancak parent'daki private bir method'un
    ismi ile ayni olan bir method'u child class'da olustursak
    Java CTE vermez
    Cunku private method'lar override edilemeyecegi icin
    child class'daki method'u
    tamamen farkli bir method olarak algilar.
     */

    // parent'daki private method'u override edemez
    // bagimsiz bir method olur
    // @Override notasyonu kullanmak istersek CTE verir
}
