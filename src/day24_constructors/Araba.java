package day24_constructors;

public class Araba {
    int ilanNo;
    String marka="deger atanmadi";
    String model="deger atanmadi";
    int yil;
    int fiyat;

    /* ozellikleri bastan atayabilmek icin parametreli cons. olusturalim
       parametre isimlerinin instance variable isimleri ile ayni olup olmamasi onemlidir
       once parametre isimlerini farkli yapalim
     */

    public Araba(int ilnNo, String mrk, String mdl, int yl,int fyt){
        ilanNo=ilnNo;
        marka=mrk;
        model=mdl;
        yil=yl;
        fiyat=fyt;
    }
    /*
       Parametre isimleri ile instance variable isimleri ayni olursa
       icinde oldugumuz scope'da istenen isimde variable varsa java onu kullanacaktir
       class level'daki variable oldugunu Java'ya belirtmek icin
       this. keyword kullanilmalidir.
     */
    public Araba(int ilanNo, String marka, String model, int yil) {
        this.ilanNo = ilanNo;
        this.marka = marka;
        this.model = model;
        this.yil = yil;
    }

    public Araba(String marka, int ilanNo , String model, int yil, int fiyat){

        this.ilanNo=ilanNo;
        this.marka=marka;
        this.model=model;
        this.yil=yil;
        this.fiyat=fiyat;
    }

    public Araba(){

    }

    @Override
    public String toString() {
        return "Araba ozelllikler : " +
                "ilanNo=" + ilanNo +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat;
    }
}
