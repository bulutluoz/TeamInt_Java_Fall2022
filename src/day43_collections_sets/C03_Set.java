package day43_collections_sets;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C03_Set {

    public static void main(String[] args) {

        /*
        Soru :  Integer'lardan olusan Bir HashSet ve TreeSet olusturun.
        Bir loop ile bu set’lere rastgele sayilari element olarak ekleyip sureleri karsilastirin.

         */


        Set<Integer> hashSet= new HashSet<>();

        Set<Integer> treeSet= new TreeSet<>();

        Random rnd= new Random();
        int temp;

        Long hashSetBaslangic=System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            temp= rnd.nextInt(1000);
            hashSet.add(temp);
        }
        Long hashSetBitis=System.currentTimeMillis();

        System.out.println("HashSet islem suresi : "+(hashSetBitis-hashSetBaslangic));


        Long treeSetBaslangic=System.currentTimeMillis();
        for (int i = 0; i <100000 ; i++) {
            temp= rnd.nextInt(1000);
            treeSet.add(temp);
        }
        Long treeSetBitis=System.currentTimeMillis();

        System.out.println("TreeSet islem suresi : "+(treeSetBitis-treeSetBaslangic));


    }
}
