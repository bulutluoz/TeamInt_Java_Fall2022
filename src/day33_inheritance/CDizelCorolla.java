package day33_inheritance;

public class CDizelCorolla extends BCorolla{

    CDizelCorolla(){
        super();
        System.out.println("dizel corolla cons");
    }

    public static void main(String[] args) {

        CDizelCorolla arb1=new CDizelCorolla();

        System.out.println(arb1.marka); // Toyota
        System.out.println(arb1.uretimYeri); // Turkiye
        System.out.println(arb1.model); // Corolla
    }
}
/*
 Bir child class'da bir obje olusturdugumuzda
 bu obje sadece kendi class'indaki ozelliklere degil
 tum parent class'lardaki ozelliklere de erisebilir

 Bunun altinda Java'daki super() constructor call
 mekanizmasi yatmaktadir

 Bir class olusturdugumuzda Java'nin o class'a
 default constructor yerlestirdigi gibi
 extends keyword kullanilan class'larda olusturulan
 her bir constructor'in ilk satirina da
 super() constructor call yerlestirir
 */