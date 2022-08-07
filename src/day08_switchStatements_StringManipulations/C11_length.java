package day08_switchStatements_StringManipulations;

public class C11_length {
    public static void main(String[] args) {
        // String kac karakterden olustugunu(uzunluk) bize dondurur

        String str= " Uzunkavaklaraltindayataruyumazoglu";

        System.out.println(str.length()); // 35

        // bu string'in son karakterini yazdirin

        System.out.println(str.charAt(str.length()-1)); // u

        // sondan 3.karakteri yazdirin

        System.out.println(str.charAt(str.length()-3)); // g


    }
}
