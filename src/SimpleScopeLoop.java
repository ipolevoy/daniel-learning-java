class SimpleScopeLoop {

	int x = 12;
	int y = 36;

	public static void main(String args []) {
		SimpleScopeLoop ref = new SimpleScopeLoop();
		while (ref.x <= 140) {
			ref.x = ref.x + ref.y;
			ref.x = ref.x - 5;
			
		}
		System.out.println("The final value is " + ref.x);
	}
}
