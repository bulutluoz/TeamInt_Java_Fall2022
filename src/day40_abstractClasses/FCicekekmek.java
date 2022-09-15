package day40_abstractClasses;

public class FCicekekmek extends CAbstractEkmek{

    @Override
    public void un() {
        System.out.println("Cicek ekmekte beyaz un kullanilir");
    }

    @Override
    public void maya() {
        System.out.println("Cicek ekmekte binde 2 maya kullanilir");
    }

    @Override
    public void bicim() {
        System.out.println("cicek ekmek cicek biciminde olur");
    }

    @Override
    public void gramaj() {
        System.out.println("cicek ekmek 350 gramdir");
    }

    @Override
    public void tuz() {
        System.out.println("cicek ekmekte binde 1 tuz kullanilir");
    }


}
