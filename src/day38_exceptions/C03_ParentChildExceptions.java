package day38_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ParentChildExceptions {

    public static void main(String[] args) throws IOException, FileNotFoundException {

        /*
           Eger olusabilecek exception'lar arasinda parent child iliskisi varsa
           daha kapsamli olan varken, child exception'in yazilmasina gerek olmaz

           illa iklisini de yazmak isterseniz once child exception'i yazmalisiniz
           yoksa ikinci exception'in calisma ihtimali olmaz

         */

        String path= "src/day37_exceptions/TextFile";

        FileInputStream fis= new FileInputStream(path);

        int k=0;

        while ((k= fis.read()) != -1){
            System.out.println((char)k);
        }
    }
}
