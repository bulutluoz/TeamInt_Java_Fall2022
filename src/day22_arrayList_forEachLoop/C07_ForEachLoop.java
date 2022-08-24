package day22_arrayList_forEachLoop;

public class C07_ForEachLoop {

    public static void main(String[] args) {

        // Verilen bir array'in tum elementlerini yazdirin

        int [] arr ={2,3,4,5,6};

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("");
        /*
        For Each Loop index yapisi kullanmadan
        array ve list gibi yapilarin
        tum elementlerini bize getirir.
         */

        for (int each: arr
             ) {
            System.out.print(each + " ");
        }


    }
}
