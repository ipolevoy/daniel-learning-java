package classez;

public class ClassAttributes {
    int x; // instance variable - need instance of a class to access
    static int y; // class variable - do not need instance of a class to access

    private void foo(){
        int x = 1;  // local variable
        System.out.println(x); // can access a local var here only.
    }


    public static void main(String[] args) {
        ClassAttributes ca = new ClassAttributes();
        System.out.println(ca.x); // accessing instance var
        System.out.println(ClassAttributes.y); // accessing a static class variable
    }
}
