package day32_encapsulation_inheritance;

public class Hemsire extends Muhasebe{

    public static void main(String[] args) {
        /*
        Extends keyword ile parent edindigimizde
        parent class'daki access modfier'i
        public ve protected olanlari inherit edebiliriz
        access modifier'i default ise sadece ayni package'da isek inherit edebiliriz
        access modfier'i private ise inherit edemeyiz
        (encapsule edilmisse getter setter ile kullanabiliriz)

         */

        Hemsire hmsr1=new Hemsire();

        hmsr1.isim="Ayse";
        hmsr1.soyisim="Yilmaz";


    }
}
