package stdio;

import java.util.Scanner;

public class Calculator2 {

    public static void main(String args[]) {


        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i == 0) {
            System.out.print("Type of operation: ");

            String operand = scanner.nextLine();

            System.out.print("Print first value: ");
            int x = Integer.parseInt(scanner.nextLine());

            System.out.print("Print second value: ");
            int y = Integer.parseInt(scanner.nextLine());


            if (operand.indexOf("*") == 0) {
                System.out.print("The result is: " + x + " * " + y + " = " + (x * y));
            } else if (operand.indexOf("/") == 0) {
                System.out.print("The result is: " + x + " / " + y + " = " + (x / y));
            } else if (operand.indexOf("+") == 0) {
                System.out.print("The result is: " + x + " + " + y + " = " + (x + y));
            } else if (operand.indexOf("-") == 0) {
                System.out.print("The result is: " + x + " - " + y + " = " + (x - y));
            }

            System.out.print('\n');
            System.out.print("Do you want to do another calculation? ");
            String boo = scanner.nextLine();
            if (boo.indexOf("N") == 0) {
                i++;
            }
        }
    }
}
