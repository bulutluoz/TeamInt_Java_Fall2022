package day23_constructor;

public class CarRunner {
    public static void main(String[] args) {


        Car car1=new Car();
        System.out.println(car1.fiyat+","+car1.ilanNo +","+
                            car1.marka +", "+ car1.model + ", "+
                            car1.yil);

        // 0,0,deger atanmadi, deger atanmadi, 0

        car1.yil=2017;
        car1.model="prius";
        car1.marka="Toyota";
        car1.ilanNo=1234;
        car1.fiyat=12000;

        System.out.println(car1.fiyat+","+car1.ilanNo +","+
                car1.marka +", "+ car1.model + ", "+
                car1.yil);
        // 12000,1234,Toyota, prius, 2017

        Car car2=new Car();
        System.out.println(car2);
        // ilanNo : 0, marka : deger atanmadi, model : deger atanmadi, yil : 0, fiyat : 0
        car2.yil=2019;
        car2.model="corsa";
        car2.marka="Opel";
        car2.ilanNo=1235;
        car2.fiyat=10000;
        System.out.println(car2);
        // ilanNo : 1235, marka : Opel, model : corsa, yil : 2019, fiyat : 10000


        Car car3=new Car(1236,"Volvo","S90",2010,13000);
        System.out.println(car3);
        // ilanNo : 1236, marka : Volvo, model : S90, yil : 2010, fiyat : 13000
    }
}
