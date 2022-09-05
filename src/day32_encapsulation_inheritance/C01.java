package day32_encapsulation_inheritance;

public class C01 {

    private int yas;
    private String isim;

    public static String getHastaneAdi() {
        return hastaneAdi;
    }

    private static String hastaneAdi="Yildiz Hastanesi";

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if (yas>=0){
            this.yas = yas;
        }else{
            System.out.println("Negatif yas giremezsiniz");
        }

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}
