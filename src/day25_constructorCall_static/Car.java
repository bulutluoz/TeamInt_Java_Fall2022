package day25_constructorCall_static;

public class Car {

    String marka="Toyota";

    public static void main(String[] args) {

        Car car1;

        // System.out.println(car1.marka);
        // car1 olusturmak icin deger atanmadigindan
        // olusturmaya itiraz etmez ama kullanmaya izin vermez

        Car car2=null;
        // System.out.println(car2.marka);
        // null ile isaretlendiginde Java = isaretini gordugunden CTE vermez
        // ama calistirmaya kalkisinca nullPointerException verir
        car2.method1();

        System.out.println(new Car().marka); //Toyota
    }

    public void method1(){

    }
}
