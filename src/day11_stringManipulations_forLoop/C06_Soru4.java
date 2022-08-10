package day11_stringManipulations_forLoop;

public class C06_Soru4 {

    public static void main(String[] args) {
        // asagidaki str'i String methodlari kullanarak temizleyin
        // output : Java ogrenmek ne guzel

        String str= "java1 ogRe2@nMek3 #ne +Gu=zel";

        str=str.replaceAll("\\d","");
        str=str.replaceAll("\\s","3");
        System.out.println(str);
        str=str.replaceAll("\\W","");
        str=str.replace("3"," ");
        // bu islem bosluk'lari da yok ettigi icin
        // once bosluklari garantiye almamiz lazim..

        // buyuk harfleri kucuk harf yapalim
        str=str.toLowerCase();

        str= str.substring(0,1).toUpperCase() + str.substring(1)+".";
        System.out.println(str); // Java ogrenmek ne guzel.




    }
}
