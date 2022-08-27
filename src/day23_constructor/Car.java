package day23_constructor;

public class Car {

    int ilanNo;
    String marka="deger atanmadi";
    String model="deger atanmadi";
    int yil;
    int fiyat;

    public void maxHiz(String yakit){

        if (yakit.equalsIgnoreCase("benzin")){
            System.out.println("Benzinli araclar icin max hiz 240 km/h");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("dizel araclar icin max hiz 260 km/h");
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            System.out.println("elektrikli araclar icin max hiz 200 km/h");
        }else{
            System.out.println("Girilen yakit turu gecerli degil");
        }
    }

    public Car(int ilanNo, String marka, String model, int yil, int fiyat) {
        this.ilanNo = ilanNo;
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.fiyat = fiyat;
    }

    public Car(){

    }

    public void vites(String yakit){

        if (yakit.equalsIgnoreCase("benzin")){
            System.out.println("Benzinli araclar otomatik veya duz vites olabilir");
        } else if (yakit.equalsIgnoreCase("dizel")) {
            System.out.println("dizel araclar otomatik veya duz vites olabilir");
        } else if (yakit.equalsIgnoreCase("elektrikli")) {
            System.out.println("elektrikli araclar otomatik vites olabilir");
        }else{
            System.out.println("Girilen yakit turu gecerli degil");
        }
    }
    @Override
    public String toString() {
        return
                "ilanNo : " + ilanNo +
                        ", marka : " + marka  +
                        ", model : " + model  +
                        ", yil : " + yil +
                        ", fiyat : " + fiyat ;
    }
}
