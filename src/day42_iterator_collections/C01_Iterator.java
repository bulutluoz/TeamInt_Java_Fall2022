package day42_iterator_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        for (Integer each:sayilar
             ) {
            each=each+5;
            System.out.print(each + " ");

        }

        System.out.println("");
        System.out.println(sayilar);
        /*
        Iterator interface'dir, dolayisiyla constructor'i yoktur ve obje olusturulamaz
        concrete class'lardan iterator'in ozelliklerini kullanmak isteyenler
        iterator interface'indeki method'lari kendilerine uyarlamis olmalidir
        biz de o uyarlanan method'lari kullanacagiz.
         */

        Iterator itr= sayilar.iterator();

        System.out.println(itr.next());
        System.out.println(itr.next());
        System.out.println(itr.next());

        // iterator en son biraktigimiz yerde durur, yeniden bastan baslamak icin yeni bir iterator olusturmaliyiz

        Iterator itr2= sayilar.iterator();

        while(itr2.hasNext()){
            System.out.print(itr2.next() + " ");
        }
        System.out.println("");
        // iterator kullanarak listenin tum elementlerini silin
        Iterator itr3= sayilar.iterator();

        while (itr3.hasNext()){
            itr3.next();
            itr3.remove();
        }

        System.out.println(sayilar);

        // listede 20'den buyuk olan elementleri silin
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);

        // iterator ile calisirken next() method'unu nerede gorurse gorsun bir sonraki elemente gecer
        Iterator itr4 = sayilar.iterator();
        while (itr4.hasNext()){

            if ((Integer)itr4.next()>20){
                itr4.remove();
            }
        }

        System.out.println(sayilar);
    }
}
