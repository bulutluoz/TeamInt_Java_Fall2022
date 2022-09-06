package day33_inheritance;

public class GXC90 extends DVolvo{

    String model="XC90";
    GXC90(){
        System.out.println("parametresiz xc90");
    }

    GXC90(String renk){
        super(renk);
        System.out.println(renk+" renginde bir " + model);
    }

    GXC90(String renk,String yakit){
        this("mavi");
        System.out.println(renk+ " renginde bir "+ yakit+"li " +marka);
    }


    public static void main(String[] args) {

        GXC90 arb3=new GXC90("Mavi", "elektrik");
        // Volvo parametreli cons
        // mavi renginde bir XC90
        // Mavi renginde bir elektrikli volvo

        GXC90 arb2 = new GXC90("Sari");
        //Volvo parametreli cons
        //Sari renginde bir XC90
        GXC90 arb1=new GXC90();
        // Volvo parametresiz cons
        // parametresiz xc90
    }
}
