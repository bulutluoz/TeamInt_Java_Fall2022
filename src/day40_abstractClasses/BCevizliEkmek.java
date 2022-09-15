package day40_abstractClasses;

public class BCevizliEkmek extends AEkmek{

    public static void main(String[] args) {

        /*
          Klasik inheritance ile child class'lari
          kendilerine ozel method'lar uretmeye zorlayamazsiniz

          child class'lar isterlerse
          parent class'daki method'lari override ederek kendilerine uyarlayabilirler
          istemezlerse babam sagolsun deyip parent class'daki method'lari kullanabilirler
         */

        BCevizliEkmek ekmek1=new BCevizliEkmek();
        ekmek1.un();
        ekmek1.bicim();
        ekmek1.gramaj();
        ekmek1.bicim();
        ekmek1.tuz();
    }
}
