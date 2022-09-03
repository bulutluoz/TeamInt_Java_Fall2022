package day29_dateTime_varargs;

import java.time.LocalDate;
import java.time.Period;

public class C03_PeriodOfTime {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dogumTarihi=LocalDate.of(1972,01,01);

        Period yas=Period.between(dogumTarihi,bugun);

        System.out.println(yas); // P50Y8M

        System.out.println(yas.getYears()); // 50

    }
}


