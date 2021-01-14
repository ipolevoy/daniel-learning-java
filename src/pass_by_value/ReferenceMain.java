package pass_by_value;

public class ReferenceMain {

    public static void main(String[] args) {
        Person p = new Person();
        p.height = 6;
        printPerson(p);
        System.out.println(p.height);
    }


    private static void printPerson(Person p1){
        System.out.println(p1.height);
    }
}
