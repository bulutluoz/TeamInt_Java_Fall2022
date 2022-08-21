package day19_arrays;

public class C10_EnUzunKelime {
    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun.


        String[] arr ={"Fatih","Muhammet","Jacob","Dalyan","Bora","Esra","Naci"};

        String enUzun= arr[0]; // fatih  // Muhammet
        String enKisa=arr[0];  // fatih // Bora

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].length()>enUzun.length()){
                enUzun=arr[i];
            }

            if (arr[i].length()<enKisa.length()){
                enKisa=arr[i];
            }
        }

        System.out.println("En uzun Kelime : " + enUzun+
                            "\nEn Kisa Kelime : " + enKisa);


        // method olarak yapalim

        enUzunVeEnKisayiYazdir(arr);

    }

    public static void enUzunVeEnKisayiYazdir(String[] arr) {
        String enUzun= arr[0]; // fatih
        String enKisa=arr[0];  // fatih

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].length()>enUzun.length()){
                enUzun=arr[i];
            }

            if (arr[i].length()<enKisa.length()){
                enKisa=arr[i];
            }
        }

        System.out.println("En uzun Kelime : " + enUzun+
                "\nEn Kisa Kelime : " + enKisa);


    }


}
