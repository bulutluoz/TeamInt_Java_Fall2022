package day32_encapsulation_inheritance;

public class Muhasebe extends IK{
    /*
    Muhasebe'de de personelin kisisel bilgilerine ihtiyac vardir.
    Bu bilgilere ulasmak icin 2 ihtimal var

    1- IK class'indan obje olusturabiliriz.
    2- Daha kolayi ve sagliklisi
       Muhasebe class'indan IK class'ini inherit ederiz
       yani parent ediniriz

     */

    protected String sgkNo="Deger atanmamis";
    protected boolean raporluMu;
    protected int minSaatUcreti=12;

    protected int fazlaMesai(int fazlaMesaiSuresi){

        return fazlaMesaiSuresi*minSaatUcreti*2;
    }

    protected int standartMaas(){
        return 30*8*minSaatUcreti*2;
    }

}
