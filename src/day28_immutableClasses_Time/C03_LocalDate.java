package day28_immutableClasses_Time;

import java.time.LocalDate;

public class C03_LocalDate {

    public static void main(String[] args) {

        LocalDate trh=LocalDate.now();

        System.out.println(trh); // 2022-08-31

        System.out.println(trh.getDayOfWeek()); // WEDNESDAY

        System.out.println(trh.getDayOfMonth()); // 31

        System.out.println(trh.getDayOfYear()); // 243

        System.out.println(trh.getMonth());// AUGUST

        System.out.println(trh.getMonthValue()); // 8

        System.out.println(trh.plusYears(3)
                                .plusMonths(2)
                                .plusDays(10)); // 2025-11-10

        System.out.println(trh.minusWeeks(3)
                              .minusDays(3));// 2022-08-07

        LocalDate dogTar1=LocalDate.of(2011,10,12);
        LocalDate dogTar2=LocalDate.of(2011,10,14);

        if (dogTar1.isBefore(dogTar2)){
            System.out.println("1.kisi daha yasli");
        }else if(dogTar1.isAfter(dogTar2)){
            System.out.println("2.kisi daha yasli");
        }else{
            System.out.println("2 kisi ayni gun dogmus");
        }


        System.out.println(dogTar1.isLeapYear()); // false

        System.out.println(trh.lengthOfYear()); // 365

        System.out.println(trh.withDayOfMonth(20)); // 2022-08-20



    }
}
