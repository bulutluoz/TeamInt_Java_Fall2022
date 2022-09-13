package day38_exceptions;

public class C05_Exceptions {
    public static void main(String[] args) {

        // 1- NullPointerException
        String str=null;

        System.out.println(str); // null

        // System.out.println(str.concat("Ali")); // NullPointerException

        // 2- StringIndexOutOfBoundsException

        String str2="Java";
        // System.out.println(str2.charAt(6)); // StringIndexOutOfBoundsException

        // 3- ArrayIndexOutOfBoundsException

        int[] arr={3,5,7,9};
        System.out.println(arr[8]); // ArrayIndexOutOfBoundsException
    }
}

