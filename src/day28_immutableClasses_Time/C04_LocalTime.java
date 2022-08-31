package day28_immutableClasses_Time;

import java.time.LocalDate;
import java.time.LocalTime;

public class C04_LocalTime {

    public static void main(String[] args) {

        LocalTime saat=LocalTime.MAX;

        System.out.println(saat); // 23:59:59.999999999

        saat=LocalTime.now();

        System.out.println(saat); // 21:32:35.244410

        System.out.println(saat.getSecond()); // 35

        /*
          bir for loop olusturalim
          1'den 10000'e kadar olan sayilari toplatalim
          ve bu islemi ne kadar surede yaptigini bulalim
         */

        LocalTime forLoopBasi=LocalTime.now();
        System.out.println(forLoopBasi);

        int toplam=0;
        for (int i = 1; i <=100000 ; i++) {
           toplam+=i;
        }
        LocalTime forLoopSonu=LocalTime.now();
        System.out.println(forLoopSonu);

        int nanoSaniye= forLoopSonu.getNano()- forLoopBasi.getNano();
        System.out.println(nanoSaniye);

        System.out.println(saat.plusMinutes(1000)); // 14:21:20.718762

        System.out.println(saat.minusNanos(556677889)); // 21:42:30.527213111

        System.out.println(saat.withMinute(50));

    }
}
