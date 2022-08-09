package day09_stringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {

        String str="Java cok guzel,cok.";

        System.out.println(str.indexOf('a'));
        // buldugu ilk a'nin index'ini verir : 1

        System.out.println(str.indexOf('a',1));
        // 1.index ve sonrasinda a arar : 1

        System.out.println(str.indexOf('a', 2)); // 3

        System.out.println( str.indexOf("cok")); // 5

        System.out.println(str.indexOf("cok",6)); // 15

        // ya olmayan bir char veya String aratirsak ?
        // java indexOf() ile olmayan bir char veya String aranirsa -1 doner


        System.out.println(str.indexOf("Soner")); // -1
        System.out.println(str.indexOf('t')); // -1


        // Yukaridaki str cumlesinin f harfi icerip icermedigini
        // indexOf() kullanarak yazdirin

        System.out.println(str.contains("f")); // false

        int index= str.indexOf("f"); // yoksa -1 doner, varsa f'nin indexini doner

        if (index==(-1)){
            System.out.println("cumle f icermiyor");
        } else{
            System.out.println("cumle f iceriyor");
        }


    }
}
