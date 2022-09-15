package day40_abstractClasses;

import day14_methodCreation.C03_MethodOlusturma;

public class EKepekliEkmek extends CAbstractEkmek{

    @Override
    public void un() {
        System.out.println("kepekli ekmekte %30 kepek iceren un kullanilir");
    }

    @Override
    public void maya() {
        System.out.println("Kepekli ekmekte binde 1 oraninda maya kullanilir");
    }

    @Override
    public void bicim() {
        System.out.println("Kepekli ekmek farkli bicimlerde olabilir");
    }

    @Override
    public void gramaj() {
        System.out.println("Kepekli ekmek farkli gramajlarda olabilir");
    }

    public static void main(String[] args) {



    }
}
