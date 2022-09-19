package day42_iterator_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C06_Deque {
    public static void main(String[] args) {

        Deque<String> stokList= new LinkedList<>();

        stokList.addLast("Malz1");
        stokList.addFirst("Malz2");
        System.out.println(stokList); // [Malz2, Malz1]

        System.out.println(stokList.pop()); // Malz2
        System.out.println(stokList); // [Malz1]

        stokList.push("Malz3");
        System.out.println(stokList); // [Malz3, Malz1]

    }
}
