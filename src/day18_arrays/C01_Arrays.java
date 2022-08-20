package day18_arrays;

public class C01_Arrays {


    public static void main(String[] args) {

        System.out.println("Hello World");

        String str ="Java Candir";
        System.out.println(str.length()); // 11

        int[] arr1={3,5,7,8};

        System.out.println(arr1.length); // 4

        System.out.println("1.indexdeki eleman : " + arr1[1]); // 5

        // 8'i silip yerine 10 yazalim
        arr1[3]=10;
        System.out.println(arr1[3]); // 10

        // System.out.println(arr1[5]); //  Run Time Error  ArrayIndexOutOfBoundsException


    }
}
