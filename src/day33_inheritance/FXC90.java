package day33_inheritance;

public class FXC90 extends DVolvo{
    String model="XC90";

    FXC90(){

    }

    FXC90(String renk){
        System.out.println(renk+ " renginde bir "+model);
    }

    FXC90(String renk,String yakit){
        System.out.println(renk+ " renginde bir "+ yakit+"li " +marka);
    }

    public static void main(String[] args) {

        FXC90 arb1=new FXC90("Kirmizi","Benzin");
    }
}
