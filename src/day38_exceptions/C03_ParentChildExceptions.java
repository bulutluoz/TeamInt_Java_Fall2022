package day38_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ParentChildExceptions {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        String path= "src/day37_exceptions/TextFile";

        FileInputStream fis= new FileInputStream(path);

        int k=0;

        while ((k= fis.read()) != -1){
            System.out.print((char)k);
        }
    }
}
