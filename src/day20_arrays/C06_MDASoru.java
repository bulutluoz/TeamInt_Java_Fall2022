package day20_arrays;

public class C06_MDASoru {

    public static void main(String[] args) {
        // Verilen 2 katli MDA'de
        // element olarak bulunan cift sayilari toplayip yazdirin

        int[][] arr= {{1,2,3,4} , {3,4,2}, {2,4}};

        int toplam=0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j]%2==0){
                    toplam+= arr[i][j];
                }
            }
        }

        System.out.println("Arraydeki cift sayilarin toplami : " + toplam);
    }
}
