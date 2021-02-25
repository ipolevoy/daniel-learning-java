package stdio;


import java.lang.Math;
import java.util.Scanner;

public class UpdatedCalculator {

    private static final String OPERATORS = "+-/*";
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {

        System.out.println("Welcome to the Java Calculator!" + '\n');

        String operand = "";

        CalcMethods cm = new CalcMethods();
        while (true) {
            String operator = getOperator();
            System.out.println("Print first value: ");
            double valFirst = getFirstValue();
           System.out.println("Print second value: ");
            double valSecond = getFirstValue();
       
            if (operator.indexOf("*") == 0) { 
                System.out.print("The result is: " + cm.multiply(valFirst, valSecond));
            } else if (operator.indexOf("/") == 0) {
                System.out.print("The result is: " + cm.divide(valFirst, valSecond));
            } else if (operator.indexOf("+") == 0) {
                System.out.print("The result is: " + cm.add(valFirst, valSecond));
            } else if (operator.indexOf("-") == 0) {
                System.out.print("The result is: " + cm.subtract(valFirst, valSecond));
            }

            System.out.print('\n' + "Do you want to do another calculation? (Enter Y or N): ");
            String boo = scanner.nextLine();
            if (boo.indexOf("N") == 0) {
                break;
            }
     }
                        
    }

        private static String getOperator() {
            String operator;
            while (true) {
                System.out.println("List of possible operations: +, -, *, /");
                System.out.print("Type of operation: ");

                operator = scanner.nextLine();
                if (OPERATORS.contains(operator)) {
                    break;
                } else {
                    System.out.println("Incorrect input type");
                }
            }
            return operator;
    }


        private static double getFirstValue() {
            String first;
            double val1;
            while (true) {
   //             System.out.println("Print first value: ");
                try {
                    first = scanner.nextLine();
                        val1 = Double.parseDouble(first);
                    return val1;
                }
                catch (Exception e) {
                    System.out.println("Oops! Input a number please!"); 
                }
            }
    }
}



