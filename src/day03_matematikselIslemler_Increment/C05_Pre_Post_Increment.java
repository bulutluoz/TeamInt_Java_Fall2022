package day03_matematikselIslemler_Increment;

public class C05_Pre_Post_Increment {
    public static void main(String[] args) {

        int a=10;
        System.out.println(a++); // 10
        System.out.println(a); // 11


        a=10;
        System.out.println(++a); // 11
        System.out.println(a); // 11


        a=10;
        int b= a++; // b=10 , a=11

        System.out.println("a : " + a + ",b : " + b);


        a=10;
        b= ++a; // a=11 , b=11

        System.out.println("a : " + a + ",b : " + b);


    }
}
