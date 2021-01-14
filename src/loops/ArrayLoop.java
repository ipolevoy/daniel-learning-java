class ArrayLoop {

	String [] strArray = {"Hello", "Wow", "The", "Fox"};
		

	private static void printStaticArray(int[] localArray) {
	        System.out.println("Static " + localArray);	
		for(int xx: localArray) {
		  System.out.println(xx);
		}
	}
	
	 private void printArray(int[] localArray) {
               System.out.println("Instance Method " + localArray);
               for(int val: localArray) {
                  System.out.println(val * 1000);
		}

		ArrayLoop r3 = new ArrayLoop();
		for(String val: r3.strArray) {
                  	System.out.println("String instance array: ");
			System.out.print(val + " ");
                }

	}


	  private void printInstanceArray() {
               System.out.println("Instance Array " ); 
               ArrayLoop r2 = new ArrayLoop();
		
		
		for(String val: r2.strArray) {
                  System.out.println("My instance array values: " + val);
                }
        }

	public static void main(String[] args) {
		//int [] intArray = {46,14,16,18,20}; // declare local five element array + assign 5 values
		int [] intArray = new int[5];
		int x = 0;
		
		// overrides local array values
		while(x <= 4) {
			intArray[x] = x + 120;
			x++;
		}
		// prints array elements
		for(x = 0; x < intArray.length; x++) {
			System.out.print(intArray[x] + " ");
		}
		
		System.out.println(intArray);
		printStaticArray(intArray);
		
		ArrayLoop r = new ArrayLoop();	
		r.printArray(intArray);
		r.printInstanceArray();
	}	

}
