package day20_arrays;

import java.util.Arrays;

public class C03_MultiDimensionalArrays {

    public static void main(String[] args) {


        int[] arr ={2,3,4};

        int[][] mda={{1,2,3}, {3,4},{4,2,5,6}};

        /*
        Bu array'de ic ice 2 kat var
        outer array'i dusunursek  int[] = { mda[0], mda[1], mda[2]}
         */

        System.out.println(mda.length); // 3
        System.out.println(mda[0].length); // 3
        System.out.println(mda[1].length); // 2

        // en bastaki 1 elementini yazdiralim

        System.out.println(mda[0][0]); // 1

        // 2. 4'u yazdiralim

        System.out.println(mda[2][0]); // 4

        // 5'in degerini 9 yapalim

        mda[2][2]=9;

        // mda'yi yazdiralim
        // {{1,2,3}, {3,4},{4,2,5,6}};

        System.out.println(Arrays.toString(mda)); //  [[I@2752f6e2, [I@e580929, [I@1cd072a9]

        // multi dimensional array'lerde tek toString() ise yaramaz
        // ya tek tek ic array'leri yazdirabliriz

        System.out.println(Arrays.toString(mda[2])); //  [4, 2, 9, 6]

        // veya tum mda'yi yazdirmak istersek
        System.out.println(Arrays.deepToString(mda)); // [[1, 2, 3], [3, 4], [4, 2, 9, 6]]

    }
}
