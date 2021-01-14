class GoodDog {

	private int size;
	
       	GoodDog() {
                size = 0; 
	 }
	
	public int getSize() {
		return size;
	}

	public void setSize(int s) {
		size = s;
	}

	void bark() {
		if (size > 60) {
			System.out.println("Woof! Woof!");
		}
		else if (size > 14) {
			System.out.println("Ruff! Ruff!");
		}
		else {
			System.out.println("Yip! Yip!");
		}
	}

	// 3 arguments constructor 
	GoodDog(int x,int y,int z) {
		size = x + y + z;
	}

	
}
