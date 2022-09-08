package day35_overriding;

public class LChild extends KParent{

        /*
    Kural 2 : Child class'daki overriding method'un
    access modifier'i parent class'dakinden daha kisitlayici olamaz

    cocuk babayi kisitlayamaz
     */

    /*
    parent'daki method1'in access modifier'i default
    child class'daki method1'in access modifier'i daha dar olamaz
    yani default, protected veya public olabilir
    ama private olamaz
     */
    @Override
    public void method1() {

    }

    @Override
    /*
    parent'daki method2 protected
    child'daki method 2 protected veya public olabilir
    ama default ya da private olamaz
     */
    protected void method2() {

    }


}
