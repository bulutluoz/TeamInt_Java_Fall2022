package day33_inheritance;

public class FXC90 extends DVolvo{
    String model="XC90";
    FXC90(){
    }
    FXC90(String renk){
        System.out.println(renk+ " renginde bir "+model);
    }
    FXC90(String renk,String yakit){
        // super(String renk,String yakit); parent class'da yok CTE olusur
        this("mavi");
        System.out.println(renk+ " renginde bir "+ yakit+"li " +marka);
    }
    public static void main(String[] args) {
        FXC90 arb1=new FXC90("Kirmizi","Benzin");
    }
}

/*
extends keyword kullanilan bir class'da
olusturulan her constructor'in ilk satirinda
otomatik olarak super() parametresiz constructor call vardir
biz istersek her constructor'in icinde farkli constructor call yapabiliriz
ancak
1- yaptigimiz constructor call parent class'da yoksa CTE olusur
2- biz super() disinda herhangi bir constructor call yaparsak
   bir constructor'in icinde sadece 1 tane constructor call olabileceginden
   super() silinir
3- her constructor'da super() olmak zorunda degildir
   this() de olabilir.
   this() icinde bulundugumuz class'daki constructor'lari calistirir
   super() ise parent class'daki constructor'lari calistirir
 */