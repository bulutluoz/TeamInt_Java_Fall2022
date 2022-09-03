package day29_dateTime_varargs;

public class C11_SB_capacity_length {

    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder(7);

        System.out.println(sb1.capacity()); // 7
        System.out.println(sb1.length()); // 0

        sb1.append("Ali Can");
        System.out.println(sb1.capacity()); // 7
        System.out.println(sb1.length()); // 7

        sb1.append("Bilmeyen var mi ? ");
        System.out.println(sb1.capacity()); // 25
        System.out.println(sb1.length()); // 25

        sb1.append("Inanmayan beri gelsin.");
        System.out.println(sb1.capacity()); // 52
        System.out.println(sb1.length()); // 47

        sb1.trimToSize();
        System.out.println(sb1.capacity()); // 47
        System.out.println(sb1.length()); // 47
    }
}
