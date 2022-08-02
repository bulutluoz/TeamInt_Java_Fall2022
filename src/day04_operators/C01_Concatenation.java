package day04_operators;

public class C01_Concatenation {

    public static void main(String[] args) {

        //Dataları, değerleriyle yazalım
        String s1= "Java";
        String s2= " ";
        String s3= "kolay";
        String s4= "";

        int a= 3;
        int b= 4;
        /* 12 Java kolay
        7 Java kolay
        34Java kolay
        Java12kolay
        Java34kolay
        Java7kolay
        */

        System.out.println(a*b+s2+s1+s2+s3); //12 Java kolay
        System.out.println(a+b+s2+s1+s2+s3); // 7 Java kolay
        System.out.println(s4+a+b+s1+s2+s3); // 34Java kolay
        System.out.println(s1+a*b+s3); // Java12kolay
        System.out.println(s1+a+b+s3); // Java34kolay
        System.out.println(s1+(a+b)+s3); // Java7kolay

    }
}
