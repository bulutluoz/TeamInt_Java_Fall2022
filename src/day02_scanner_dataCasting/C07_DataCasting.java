package day02_scanner_dataCasting;

public class C07_DataCasting {

    public static void main(String[] args) {
        String isim="Esra";

        isim="Ayse";


        // isim= 's';   String bir variable'a boolean, int veya char bir deger atayamazsiniz

        boolean iyiMi=true;

        // iyiMi='r'; boolean data turundeki bir variable'a da String, char veya int atayamazsiniz

        int sayiInt= 12;
        short sayiShort=20;
        byte sayiByte=21;
        double sayiDouble=14;

        // ayni veya benzer datalar iceren variable'larda ise kontrollu gecis mumkundur

        sayiDouble = sayiInt; // b = k
        sayiInt = sayiShort; //  b = k

        sayiByte = (byte) sayiInt;   // k = b
        sayiShort = (short)sayiDouble; // k = b

        System.out.println(sayiByte);
        System.out.println(sayiShort);


    }
}
