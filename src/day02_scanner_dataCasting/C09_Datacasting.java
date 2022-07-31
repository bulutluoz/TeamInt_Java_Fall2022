package day02_scanner_dataCasting;

public class C09_Datacasting {
    public static void main(String[] args) {

        int intSayi=567;

        byte byteSayi = (byte)intSayi;

        System.out.println("intsayi : " + intSayi +"'yi byte'a cevirirsek degeri : " + byteSayi); // -116

        /*
         Ozet data casting :
         1- Eger kucuk data turundeki datayi, buyuk data turundeki variable'a atama yaparsak--otomatik genisler
         2- Eger buyuk data turundeki datayi, kucuk data turundeki variable'a atama yaparsak,
            Java islemi otomatik yapmaz, bizden sorumlulugu almamizi ister
            data kaybi(ondalikli kismin gitmesi) veya donusum olabilir.
         */
    }
}
