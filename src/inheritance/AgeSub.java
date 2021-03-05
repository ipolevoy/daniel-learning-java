package inheritance;

public class AgeSub extends AgeSuper {
    AgeSub(int age) {
        super(age);
    }

    public static void main(String args[]) {
        AgeSub s = new AgeSub(24);
        s.getAge();
    }
}
