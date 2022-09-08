package day35_overriding;

public class NChild extends MParent{
    /*
Kural 3 : Return Type
child class'daki overriding method'un return type'i
parent class'daki ile ya ayni olmali
veya covariant olmali

covariant data turu : data turleri arasinda parent-child iliskisi olmasi demektir
 primitive data turlerinde parent-child iliskisi olmayacagindan
 primitive data turlerinde overridden method ile overriding method'un
 return type'lari ayni olmalidir.


 */

    @Override
    void method1() {

    }
/*
parent class'daki method2'nin return type'i
primitive oldugundan
child class'daki overriding method'un return type'i da
ayni olmalidir
 */
    @Override
    int method2() {
        return 5;
    }

   /*
   child class'daki method3'un return type'i String
   parent class'daki method3'un return type'i
   ya String olmali veya String'in parent'i olan bir class olmali
   (mesela Object)
    */
    @Override
    String method3() {
        return "Hava";
    }
}
