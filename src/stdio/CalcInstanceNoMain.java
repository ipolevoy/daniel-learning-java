package daniel_files;

public class CalcInstanceNoMain {
	
	int a = 2;
	int b = 3;
	int d = 4;

	int add (int x, int y) {
		return x+y+b; 
	}


	int subtract (int x, int y) {
                return x-y;
	}

	int multiply (int x, int y) {
                return x*y;
	}

	int divide (int x, int y) {
                return x/y;
	}

	void addThreeNums (int x, int y, int z) {
		System.out.println (x+y+z);
	} 	

}
