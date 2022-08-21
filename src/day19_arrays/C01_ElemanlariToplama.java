package day19_arrays;

public class C01_ElemanlariToplama {
    public static void main(String[] args) {
        // Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.


        int[] arr = {3,5,7,10,-5,0};
        int sonuc=elemanlariTopla(arr);

        System.out.println("array'deki pozitif elementlerin toplami : "+sonuc);
    }

    public static int elemanlariTopla(int[] arr) {

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>0){

                toplam+=arr[i];
            }
        }

        return toplam;
    }


}
