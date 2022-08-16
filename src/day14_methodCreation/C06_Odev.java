package day14_methodCreation;

import java.util.Scanner;

public class C06_Odev {

    public static void main(String[] args) {
        /*
          Basit bir islem merkezi olusturma
          Kullaniciya 4 tercih sunup istedigini gerceklestirecek 4 method olusturun
          1- girilen sayi asal sayi mi ?
          2- girilen sayi palindrome mu ?
          3- girilen sayiyi tam olarak bolen tamsayilarin adedi kac ?
          4- sayinin rakamlar toplami

          4 method'da string olarak sonucu donecek
          main method'da sonuc bir variable'a kaydedecek
          ve sonra yazdiracak

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayi giriniz");
        int sayi1 = scan.nextInt();

        System.out.println("Lütfen yapmak istediginiz islemi seciniz" +
                "\n1- Asal sayi mi?" +
                "\n2- Sayi palindrome mu?" +
                "\n3-tam bolen sayisi kac tane " +
                "\n4-Sayinin rakamlar toplami kac?");
        int tercih = scan.nextInt();
        String sonuc="";

        switch (tercih) {
            case 1 :
                sonuc = sayiAsalMi(sayi1);
                break;
            case 2 :
                sonuc = sayipalindromeMu(sayi1);
                break;
            case 3 :
                sonuc = tamBolensayisiBul(sayi1);
                break;
            case 4 :
                sonuc = rakamlarToplaminiBul(sayi1);
                break;
        }

        System.out.println("istediginiz sayi icin sonuc : " + sonuc);

    }

    public static String sayiAsalMi(int sayi1) {

        boolean sayiAsalMi = true;
        String sonuc = "";

        for (int i = 2; i < sayi1; i++) {

            if (sayi1 % i == 0) {
                sonuc = "Girdiğiniz sayi asal sayi değil";
                sayiAsalMi = false;
                break;
            }
        }
        if (sayiAsalMi) {
            sonuc = "Girdiginiz sayi asal";

        }
        return sonuc;
    }

    public static String sayipalindromeMu(int sayi1){

        String sayiStr=sayi1+"";
        String tersSayi="";
        String sonuc="";

        for (int i = sayiStr.length()-1; i >= 0; i--) {

            tersSayi+=sayiStr.substring(i,i+1);

        }
        if (sayiStr.equals(tersSayi)){
            sonuc="Sayi Palindrome";
        }else {
            sonuc="Sayi palindrome degil";
        }
        return sonuc;
    }

    public static String tamBolensayisiBul(int sayi1) {
        int tamBolenSayisi=0;

        for (int i = 1; i <= sayi1; i++) {
            if (sayi1 % i ==0) {
                tamBolenSayisi++;
            }
        }
        {
        }
        return tamBolenSayisi+"";
    }

    public static String rakamlarToplaminiBul(int sayi1) {


        String sayiStr = sayi1 + "";
        int basSayisi = sayiStr.length();

        int birlerBas = 0;
        int rakamlarTop = 0;

        for (int i = 1; i <= basSayisi; i++) {

            birlerBas = sayi1 % 10;
            rakamlarTop += birlerBas;
            sayi1 = sayi1 / 10;

        }

        return rakamlarTop+"";
    }

}

