package stdio;


import java.lang.Math;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TheCalculator {

    public static void main(String args[]) {

        System.out.println("Welcome to the Java Calculator!" + '\n');
        Scanner scanner = new Scanner(System.in);
        String operand = "";
     
       int i = 0;
    
        while (i == 0) {
            for (int j = 0; j < 1; j++) {
                System.out.println("List of possible operations: +, -, *, /");
                System.out.print("Type of operation: ");

                operand = scanner.nextLine();
                if (!((operand.length() < 2)
                        & ((operand.contains("+"))
                            || (operand.contains("-"))
                            ||(operand.contains("*"))
                            || (operand.contains("/"))))) {
                    System.out.println("Incorrect input type");
                    j--;
                }
            }

            System.out.print("Print first value: ");
            double x = 0;
            double y = 0;
    
            for (int g = 0; g < 1; g++) {
                try {
                    x = Double.parseDouble(scanner.nextLine());
                }
                catch(Exception e) {
                    g--;
                    System.out.println("Oops! Input a number please!");
                }
            }

            System.out.print("Print second value: ");

            for (int h = 0; h < 1; h++) {
                try {
                    y = Double.parseDouble(scanner.nextLine());
                }
                catch(Exception e) {
                    h--;
                    System.out.println("Oops! Input a number please!");
                }

            }   
 
            if (operand.indexOf("*") == 0) {
                System.out.print("The result is: " + x + " * " + y + " = " + (x * y));
            } else if (operand.indexOf("/") == 0) {
                System.out.print("The result is: " + x + " / " + y + " = " + (x / y));
            } else if (operand.indexOf("+") == 0) {
                System.out.print("The result is: " + x + " + " + y + " = " + (x + y));
            } else if (operand.indexOf("-") == 0) {
                System.out.print("The result is: " + x + " - " + y + " = " + (Math.round((x - y))));
            }

            System.out.print('\n');
            System.out.print("Do you want to do another calculation? (Enter Y or N): ");
            String boo = scanner.nextLine();
            if (boo.indexOf("N") == 0) {
                i++;
            }
        }
    }
}
