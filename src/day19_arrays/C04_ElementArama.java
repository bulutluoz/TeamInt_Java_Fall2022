package day19_arrays;

public class C04_ElementArama {
    public static void main(String[] args) {
        // Soru 4- Verilen bir array’de
        // istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        String[] arr= {"A","G","F","A","K","F","F"};
        String arananElement="F";


        elemanVarMi(arr,arananElement);
    }

    public static void elemanVarMi(String[] arr, String arananElement) {

        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].equals(arananElement)){
                sayac++;
            }
        }


        if (sayac==0){
            System.out.println("Aradaginiz element array'de yok");
        } else {
            System.out.println("Aradiginiz element array'de " + sayac + " defa kullanilmis");
        }

    }
}
