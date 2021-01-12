package scoping;

public class Scoping {

    private int x = 1;

    public void test(){
        int x = 2;
        System.out.println(x);
    }

    public  void test2(){
        System.out.println(x);
    }

    public  void test3(){

        int x = 2;

        {
            x = 3;
        }

        System.out.println(x);
    }

    public void test4(){

        for(int x = 0; x < 9; x++){
             System.out.println(x);
        }

    }

    public static void main(String[] args) {

        Scoping t =  new Scoping();
        t.test();
        t.test2();
        t.test3();
        System.out.println("Test4: *****************");
        t.test4();
    }
}
