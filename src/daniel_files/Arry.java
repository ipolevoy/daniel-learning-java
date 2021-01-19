package daniel_files;

public class Arry {
	
  public static void main (String args[]) {
    
    int[] numbers;
    numbers = new int[5];

	numbers[3] = 324;
	numbers[4] = 21;
	numbers[2] = 34;	
	numbers[0] = 12;
	numbers[1] = 34;

	System.out.println("Element 1: " + "\n\b\n" +  numbers[1]);
	System.out.println(numbers[1]);
	System.out.print(numbers[1]);

	int a = 0;
	
	while (a < 4) {
		System.out.println(a);
		System.out.println(numbers[a]);
		a = a + 1;
	
	}
		
  }

}
