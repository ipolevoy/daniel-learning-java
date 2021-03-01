package stdio;


import java.util.Scanner;

public class UpdatedCalculator {

    private static final String OPERATORS = "+-/*";
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULT = "*";
    private static final String DIVIDE = "/";
    private static final Scanner scanner = new Scanner(System.in);
    private static final CalcMethods CM = new CalcMethods();

    public static void main(String args[]) {
        System.out.println("Welcome to the Java Calculator!" + '\n');
        doWork();
    }

    private static void doWork(){

        while (true) {
            String operator = getOperator();
            double valFirst = getValue("Print first value: ");
            double valSecond = getValue("Print second value: ");
            double result = calculate(operator, valFirst, valSecond);
            System.out.println("The result is: " + result);
            System.out.print('\n' + "Do you want to do another calculation? (Enter Y or N): ");
            String boo = scanner.nextLine();
            if (boo.indexOf("N") == 0) {
                break;
            }
        }
    }

    private static double calculate(String operator, double valFirst, double valSecond){
        if (operator.indexOf(MULT) == 0) {
            return CM.multiply(valFirst, valSecond);
        } else if (operator.indexOf(DIVIDE) == 0) {
            return CM.divide(valFirst, valSecond);
        } else if (operator.indexOf(PLUS) == 0) {
            return CM.add(valFirst, valSecond);
        } else if (operator.indexOf(MINUS) == 0) {
            return CM.subtract(valFirst, valSecond);
        }else {
            throw new RuntimeException("Bad operator");
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


    private static double getValue(String prompt ) {
        System.out.println(prompt);
        String first;
        double val1;
        while (true) {

            try {
                first = scanner.nextLine();
                val1 = Double.parseDouble(first);
                return val1;
            } catch (Exception e) {
                System.out.println("Oops! Input a number please!");
            }
        }
    }
}



