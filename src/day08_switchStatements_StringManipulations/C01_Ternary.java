package day08_switchStatements_StringManipulations;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /*
        Kullanicidan bir tamsayi alin.
	    Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
	    Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi= scan.nextInt();

        String sonuc = sayi>0 ?                                            // sart
            (sayi%2==0 ? "Cift Sayi" : "Cift Sayi degil") : // sart dogru ise calisacak kod
            (sayi<=-100 && sayi>=-999 ?  "3 Basamakli" : "3 Basamakli degil " ) ; // sart dogru degilse calisacak kod

        System.out.println(sonuc);

    }
}
