package day29_dateTime_varargs;

import java.time.LocalTime;
import java.time.ZoneId;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();

        System.out.println(saat); // 19:03:27.658174

        LocalTime localSaat1=LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println(localSaat1); // 18:06:44.835579

        LocalTime localSaat2=LocalTime.now(ZoneId.of("Turkey"));
        System.out.println(localSaat2); // 20:07:19.380256

        LocalTime localSaat3=LocalTime.now(ZoneId.of("America/New_York"));
        System.out.println(localSaat3); // 13:09:40.408075
    }
}
