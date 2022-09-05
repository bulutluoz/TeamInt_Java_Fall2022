package day32_encapsulation_inheritance;

public class C02_Encapsulation {

    public static void main(String[] args) {

        C01 obj= new C01();
        System.out.println(obj.getYas()); // 0

        obj.setYas(-20);

        System.out.println("yas : "+ obj.getYas()); // 0

        /*
         biz bir objeye deger atamasini kontrol edemeyiz
         kullanici kac degerini atarsa
         Java o degeri kullanir

         Encapsulation'in faydalarindan biri de
         bu deger atamasini getter veya setter method'larinda kontrol edebilmektir.
         */

        System.out.println(C01.getHastaneAdi()); // Yildiz Hastanesi
        //C01.hastaneAdi="Gicik Hastane";

        System.out.println(C01.getHastaneAdi()); // Yildiz Hastanesi

    }
}
