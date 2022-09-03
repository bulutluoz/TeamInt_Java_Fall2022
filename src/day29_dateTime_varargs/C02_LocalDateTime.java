package day29_dateTime_varargs;

import java.time.LocalDateTime;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();

        System.out.println(ldt); // 2022-09-01T19:11:45.014862

        /*
        Date ve time'i DateTimeFormatter ile
        istedigimiz gibi manipule edebiliriz
        veya bugune kadarki bilgilerimizle bu isi cozmek istersek
         */

        String tarihVeSaat=ldt.toString();

        // bu tarih 2022'e mi ait ?
        System.out.println(tarihVeSaat.startsWith("2022")); // true

    }
}
