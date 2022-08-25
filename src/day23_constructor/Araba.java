package day23_constructor;

public class Araba {

    /*
        Bir class olusturuldugunda
        Java o class'dan obje olusturulmasina imkan vermek icin
        class'a bizim goremedigimiz bir constructor yerlestirir

        Java'nin koydugu ve bizim goremedigimiz bu constructor'a
        default constructoe denir
        ve default constructor objenin hic bir ozelligini degistirmeden
        instance variable degerleriyle obje olusturur

        default constructor parametresizdir
        ve body'sinde hic kod yoktur
     */

    String model;
    String marka;

    Araba(){
        /*
        Default constructor parametresiz bir constructor'dir
        Ama bizim manuel olarak yazacagimiz parametresiz constructur'a
        default constructor DENMEZ

        Cunku default constructor'in body'sinde kod olmaz
        ama parametresiz constructor'larda body'ye kod ekleyebiliriz
         */
    }

    Araba(String model){
        /*
        Biz bir class'da manuel olarak constructor olusturdugumuzda
        Java default constructor'i siler

        Bu icinde bulundugumuz class'da olmasa bile
        bu class'dan obje olusturan diger class'larda CTE'ye sebep olabilir
        Cunku kullanilan default constructor artik olmayacaktir

        Bunun cozumu adina
        bir class'da herhangi bir parametreli constructor olusturursak
        diger class'larda sorun olusturmamasi icin
        default comnstructor yerine parametresiz bir constructor da
        olusturmaliyiz.
         */
    }
}
