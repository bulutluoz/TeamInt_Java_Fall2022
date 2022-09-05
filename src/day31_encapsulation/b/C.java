package day31_encapsulation.b;


import day31_encapsulation.a.A;

public class C extends A{

    public static void main(String[] args) {
        // extends A : C class'ini A'nin Child'i yapar

        /*
        Bugune kadar hep erisim kelimesini kullandik cunku
        yetki ayirimi yapmadik

        Java'da ve gercek hayatta bir veriye ulasmak dedigimizde
        2 farkli islemi ayrmamiz gerekir

        get (gorme): veriyi gorebiliriz ama degistiremeyiz
        set (degistirme) : veriyi degistirebilme yetkisi

        access modifier ile yapilan erisim yetkilendirmesi
        hem get hem de set'i icerir
        birbirinden ayrilamaz

        Bu ayirimi ENCAPSULATION ile yapabiliriz

        Encapsulation 2 temel adimdan olusur
        1- Encapsule edilecek datalar private yapilir
        2- private yaptigimiz datalardan
            - gorunmesini istediklerimiz icin getter
            - degistirilmesini istediklerimiz icin setter method'u olustururuz.
         */
        A objA= new A();
        System.out.println(objA.pblc); // null
        objA.pblc="10";
        System.out.println(objA.pblc); //10


        C objC=new C();
        objC.prtctd="A class'indaki protected variable'a ObjeC ile eristik ";
        System.out.println(objC.prtctd);



        B objB= new B();
        objB.dfltB="Java";
        System.out.println(objB.dfltB); // Java
        objB.prtctdB="Guzel";
        objB.pblcB="Degil mi?";

        /*
        Ornegin A class'indaki private datalara
        icinde oldugumuz C class'indan ulasamadik

        simdi prvt1 icin get(okuma) yetkisi
        prvt2 icin de set(degistirme) yetkisi olusturalim

        prvt1 icin getter, prvt2 icin setter method'u olusturduk
         */

        System.out.println(objA.getPrvt1()); // private

        objA.setPrvt2("Java");


        objA.setPrvt3("Dalyan");
        System.out.println(objA.getPrvt3()); // Dalyan
    }
}
