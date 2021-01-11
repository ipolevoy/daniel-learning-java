public class Puzzle4c {
	public static void main(String [] args) {
		Puzzle4b [] obs = new Puzzle4b[6];
		int y = 1;
		int x = 0;
		int result = 0;
		int d;
		
		while (x < 6) {
			obs[x] = new Puzzle4b();
			obs[x].ivar = y;
			y = y * 10;
			x = x + 1;
			d = obs[x].doStuff(20);
		 	System.out.println("result " + d);
			 

		}
		
		x = 6;
	}	
}
