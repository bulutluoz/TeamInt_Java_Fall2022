package day29_dateTime_varargs;

    public class C09 {

        public static void main(String[] args) {
            new C09().C09(1,"Java");

            C09 obj=new C09();
            obj.C09(2,"Java","Guzeldir");
        }


        public void C09(int a, String... b){

            System.out.print(b[b.length-a]+ " ");
        }
    }




