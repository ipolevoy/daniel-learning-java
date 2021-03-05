package inheritance;

public class My_Calculation extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers: " + z);
    }

    public static void main(String args[]) {
        int a = 20, b = 10;
        My_Calculation ref = new My_Calculation();
        ref.addition(a, b);
        ref.Subtraction(a, b);
        ref.multiplication(a, b);
    }
}
