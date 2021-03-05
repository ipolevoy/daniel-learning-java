package inheritance;

public class SubClass extends SuperClass {
    int num = 10;

    public void display() {
        System.out.println("This is the display method of subclass");
    }

    public void my_method() {
        SubClass sub = new SubClass();

        sub.display();
        super.display();
        System.out.println("value of the variable named num in sub class: " + sub.num);

        System.out.println("value of the variable named num in super class: " + super.num);
    }

    public static void main(String args[]) {
        SubClass obj = new SubClass();
        obj.my_method();
    }
}

