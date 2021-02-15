//package stdio;

import java.lang.Math;
import java.util.Scanner;
import java.math.*;

public class BackupCalc2 {

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
                if ((operand.length() < 2) & ((operand.contains("+")) || (operand.contains("-")) ||(operand.contains("*")) || (operand.contains("/")))) {
                 } else {
                    System.out.println("Incorrect input type");
                    j--;
                }
            }

            System.out.print("Print first value: ");
            DataValidation dv = new DataValidation();

            double x = 0;
            double y = 0;

            for (int g = 0; g < 1; g++) {
                try {
                String str = scanner.nextLine();
                if(dv.isNumber(str)) {
                 x = Double.parseDouble(str);
                }
                }
                catch(Exception e) {
                    g--;
                    System.out.println("Oops! Input a number please!");
                }
            }
        
            System.out.print("Print second value: ");

            for (int h = 0; h < 1; h++) {
                try {
                String str = scanner.nextLine();
                    y = Double.parseDouble(str);
                }
                catch(Exception e) {
                    h--;
                    System.out.println("Oops! Input a number please!");
                }

            }   

            double result = 0; 

            if (operand.indexOf("*") == 0) {
            result = x*y;
            } else if (operand.indexOf("/") == 0) {
            result = x/y;
            } else if (operand.indexOf("+") == 0) {
            result = x+y;
            } else if (operand.indexOf("-") == 0) {
            result = x-y;
            }
            
            BigDecimal bd = new BigDecimal(result).setScale(2,RoundingMode.HALF_UP);

            System.out.print("\nYour result is: " + bd.doubleValue());

            System.out.print('\n');
            System.out.print("Do you want to do another calculation? (Enter Y or N): ");
            String boo = scanner.nextLine();
            if (boo.indexOf("N") == 0) {
                i++;
            }
        }
    }
}
