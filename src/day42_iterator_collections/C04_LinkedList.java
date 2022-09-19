package day42_iterator_collections;

import java.awt.geom.QuadCurve2D;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C04_LinkedList {
    public static void main(String[] args) {

        /*
          temel ozelligi linked olmasi (elementlerin birbirine bagli sekilde siralanmasidir)

          LinkedList 3 interface'i implement etmistir
          1- List
          2- deque
          3- queue
          data turunu hangisinden secersek, onun ozelliklerini tasir
         */

        LinkedList<Integer> ll1 = new LinkedList<>(); // List, Queue ve deque ozelliklerinin hepsini tasir
        List<Integer> ll2 = new LinkedList<>();
        Deque<Integer> ll3 = new LinkedList<>();
        Queue<Integer> ll4 = new LinkedList<>();



        ll2.add(10);
        ll2.add(20);
        System.out.println(ll2); // [10, 20]
        ll2.add(0,30);
        System.out.println(ll2); // [30, 10, 20]

        System.out.println(ll2.subList(0, 2)); // [30, 10]
        // element 30'u silmek istersek, index olarak algilanmamasi icin once bir variable'a atamaliyiz
        Integer silinecek=30;
        ll2.remove(silinecek);

        System.out.println(ll2); // [10, 20]

        System.out.println(ll2.hashCode()); // 1291

        ll2.add(40);
        System.out.println(ll2.hashCode()); // 40061

        ll2.remove(1);
        System.out.println(ll2.hashCode()); // 1311

        System.out.println(ll2); // [10, 40]
        List<Integer> ll5 = new LinkedList<>();
        ll5.add(10);
        ll5.add(20);
        ll5.add(30);
        System.out.println(ll5); // [10, 20, 30]

        ll2.retainAll(ll5);

        System.out.println(ll2); // [10]
        System.out.println(ll5); // [10, 20, 30]

        ll5.retainAll(ll2);
        System.out.println(ll2); // [10]
        System.out.println(ll5); // [10]



    }
}
