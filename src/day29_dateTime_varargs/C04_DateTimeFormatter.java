package day29_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt); //  2022-09-01T19:23:27.851814

        DateTimeFormatter dtf=DateTimeFormatter.BASIC_ISO_DATE;

        System.out.println(dtf.format(ldt)); // 20220901

        DateTimeFormatter dtf2=DateTimeFormatter.ISO_WEEK_DATE;
        System.out.println(dtf2.format(ldt)); // 2022-W35-4

        // 01/09/2022
        // 1/9/2022
        // 1/9/22
        // 1/Eylul/2022

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd/MM/YYYY"); // 01/09/2022
        System.out.println(dtf3.format(ldt));


        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("d/M/YY");
        System.out.println(dtf4.format(ldt)); // 1/9/22

        DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("d/MMM/YY"); //
        System.out.println(dtf5.format(ldt)); // 1/Sep/22

        /*
		 format olustururken
		 GUN
		 d : basta 0 varsa onu yazmadan gun numarasi
		 dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
		 DDD : yilin kacinci gunu oldugunu yazar
		 E, EE, EEE : gun isminin ilk 3 harfi
		 EEEE : gun isminin tamamini

		 AY (Ay icin M, dakika icin m kullanilir)
		 M : basta 0 varsa onu yazmadan ay numarasi
		 MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 MMM : Ay isminin ilk 3 harfi
		 MMMM : Ay isminin tamami

		 YY : yilin son iki rakamini
		 YYYY : Yilin tamamini

		 Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

		 HH : saatin tamami, tek rakamli saat olursa 02 gibi
		 H  : tek rakamli saat olursa sadece saati

		 a yazarsak AM veya PM degerini yazar


		 */

        // 19:38

        DateTimeFormatter dtf6=DateTimeFormatter.ofPattern("HH:mm"); //
        System.out.println(dtf6.format(ldt)); // 19:39

        // 7:38 pm

        DateTimeFormatter dtf7=DateTimeFormatter.ofPattern("h:mm a"); //
        System.out.println(dtf7.format(ldt)); // 7:40 PM

    }
}
