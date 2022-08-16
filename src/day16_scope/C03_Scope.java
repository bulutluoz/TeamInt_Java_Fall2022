package day16_scope;

import java.util.Scanner;

public class C03_Scope {

    /*
       static variable'lar tum class ve tum objeler icin tekdir

     */

    String str="Java";
    int a= 10;
    int b= 20;


    public static void main(String[] args) {
        /*
          variable'lar instance oldugundan (non static) main method icerisinden
          direk ulasamayiz

          static method icerisinde instance variable'lara ulasmak istyerseniz
          obje olusturup, objke uzerinden ulasabilirsiniz.

          static variable'lar clas uyelrinin tamami icin gecerlidir ve bir tanedir
          degisirse tum class uyeleri icin degismis olur
          okulun ismi veya adresi gibi

          instance variable'lar ise sadece bir objeyi ilgilendirir
          degisirse sadece o obje icin degisir, diger objeleri ilgilendirmez
          bir ogretmenin bransi veya bir ogrencinin matemetik notu gibi

         */

        Scanner scan = new Scanner(System.in);

        C03_Scope obj1 = new C03_Scope();

        C03_Scope obj2 = new C03_Scope();

        C03_Scope obj3 = new C03_Scope();

        /*
          Bir obje olusturdugumuzda java heap memory'de o objeyi olusturur
          ve o obje'ye ozel instance variable'lari objeye ekler

          Her hangi bir satirda obje'ye ait instance deger sorulursa
          obje'nin olusturuldugu satira gidip
          objeyi o satirdan, bize sorulan satira kadar takip etmeliyiz
         */

        obj1.a=11;
        obj2.a++;
        obj3.b=22;


        C03_Scope obj4 = new C03_Scope();

        System.out.println(obj1.a); // 11
        obj1.a+=3;

        System.out.println(obj1.a); // 14
        System.out.println(obj2.a); // 11


        obj2.a +=5;
        System.out.println(obj2.a); // 16

    }




























}
