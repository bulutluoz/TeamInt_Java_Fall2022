package day38_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_ParentChildExceptions {
    public static void main(String[] args) {
        /*
           eger parent ve child exception'lari try catch ile handle etmek isterseniz
           once child exception'i
           sonra parent exception'i yazmalisiniz

           diger turlu child exception'a erisme ihtimali olmaz
           Java CTE verir
         */


        String path= "src/day37_exceptions/TextFile";

        try {
            FileInputStream fis= new FileInputStream(path);
            int k=0;

            while ((k= fis.read()) != -1){
                System.out.println((char)k);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
