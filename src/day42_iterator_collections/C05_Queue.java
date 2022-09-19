package day42_iterator_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C05_Queue {

    public static void main(String[] args) {


        Queue<String> yemekSirasi= new LinkedList<>();

        yemekSirasi.add("ali");
        yemekSirasi.add("veli");
        yemekSirasi.add("ayse");
        yemekSirasi.add("kemal");

        System.out.println(yemekSirasi); // [ali, veli, ayse, kemal]
        System.out.println(yemekSirasi.element()); // ali
        System.out.println(yemekSirasi); // [ali, veli, ayse, kemal]

        System.out.println(yemekSirasi.peek()); // ali
        System.out.println(yemekSirasi); // [ali, veli, ayse, kemal]

        Queue<String> queDeneme= new LinkedList<>();

        System.out.println(queDeneme.peek()); // null
        // System.out.println(queDeneme.element()); // exception

        yemekSirasi.offer("Fatma");
        System.out.println(yemekSirasi); // [ali, veli, ayse, kemal, Fatma]

        System.out.println(yemekSirasi.poll()); // ali
        System.out.println(yemekSirasi); // [veli, ayse, kemal, Fatma]

        System.out.println(yemekSirasi.remove()); // veli
        System.out.println(yemekSirasi); // [ayse, kemal, Fatma]

        System.out.println(queDeneme.poll()); // null
        //System.out.println(queDeneme.remove());// exception




    }

}
