package day20_arrays;

public class C05_MDAElementleriYazdirma {
    public static void main(String[] args) {

        // verilen multi imensional bir array'in tum elementlerini yazdiran
        // bir method olusturun


        /*
          multidimensional bir array'in ic elementlerine ulasmak ve
          onlarla ilgili isleme yapmak istedigimizde
          MDA'in kat sayisi kadar ic icice loop'lar olusturmaliyiz
         */


        //int[][] arr= {{1,2,3,4} , {3,4,2}, {2,4}};
        int[][] arr= {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};

        elementleriyazdir(arr);

    }

    public static void elementleriyazdir(int[][] arr) {

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                System.out.print(arr[i][j] +" ");
            }

        }

    }
}
