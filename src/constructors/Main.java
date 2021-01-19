package constructors;

public class Main {

    public static void main(String[] args){

        Puppy p1 = new Puppy();
        System.out.println(p1.toString());

        Puppy p2 = new Puppy("Coco");
        System.out.println(p2.toString());


        Puppy p3 = new Puppy("Ma");
        System.out.println(p3.toString());

    }
}
