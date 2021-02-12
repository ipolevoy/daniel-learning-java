package stdio;

import java.util.Scanner;

public class MainCalculator {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int i = 0;	
		while(i == 0) {
			System.out.print("Type of operation: ");
			
			String operand = scanner.nextLine();
			String s1 = "M";
			String s2 = "A";
			String s3 = "S";
			String s4 = "D";	
			char ch = operand.charAt(0);
			System.out.print("Print first value: ");
			int x = Integer.parseInt(scanner.nextLine());
	
			System.out.print("Print second value: ");
			int y = Integer.parseInt(scanner.nextLine());
			int result = 0;
			
			CalcMethods cm = new CalcMethods();
		
			if (operand.indexOf("M") == 0) {
				result = cm.multiply(x,y);
				//System.out.print("The result is: " + x + " * " + y + " = " + (x*y));
			} else if (operand.indexOf("D") == 0) {
				result = cm.divide(x,y);
				//System.out.print("The result is: " + x + " / " + y + " = " + (x/y));
			} else if (operand.indexOf("A") == 0) {
				result = cm.add(x,y);
				//System.out.print("The result is: " + x + " + " + y + " = " + (x+y));
			} else if (operand.indexOf("S") == 0) {
				result = cm.subtract(x,y);
				//System.out.print("The result is: " + x + " - " + y + " = " + (x-y));
			}
			System.out.println('\n' + result);
			System.out.print("Do you want to do another calculation? ");
			String boo = scanner.nextLine();
				if (boo.indexOf(("N")) == 0) {
					i++;
				}
		}	
	}
}
