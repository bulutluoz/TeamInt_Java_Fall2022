package day15_whileLoop_doWhileLoop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // iki basamakli sayilardan 7 ile bolunebilenleri yanyana yazdirin

        for (int i = 10; i <100 ; i++) {

            if (i%7==0){
                System.out.print(i + " ");
            }
        }
    }
}
