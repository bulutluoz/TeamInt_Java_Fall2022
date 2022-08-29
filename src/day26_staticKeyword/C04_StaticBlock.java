package day26_staticKeyword;

public class C04_StaticBlock {
    static int sayi;


    C04_StaticBlock(){
        System.out.println("Constructor calisti");
    }

    public static void main(String[] args) {
        C04_StaticBlock obj1=new C04_StaticBlock();

        System.out.println("sayi : " + sayi);
    }

    static {
        System.out.println("ustteki static block calisti");
    }

    static {
        System.out.println("static block calisti");
        sayi=40;
    }

}
