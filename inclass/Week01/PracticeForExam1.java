import java.util.Scanner;



public class PracticeForExam1 {
	public static void main (String[] args) {
		int i = 4;
		double t = 2;
		i ++;
		t = t * i;
			System.out.println(t);
		
		
		// math test;
		
		int e = 4 * 12 / 15 + 2 / 2;
			System.out.println(e);
		int q = (4 + 12) * (19-5) / 9;
			System.out.println(q);	
				
		// In this case, i = 4, and t = 2. Then, i is incremented, so add one to it. 
		// next, t multiplied by 4, but incremented once. so t * 5, which is 2 * 5, which is ten. 
		// remember, since we multiply a double by an integer, we get a double value. 
		
		//figure out a batting average calculator:
			
//		System.out.println("Please enter hits. ");
//		Scanner input = new Scanner(System.in);
//		
//		double BA = input.nextDouble();
		
		int hits = 150;
		int AtBats = 550;
		double BA = 0.0;
		
		BA = hits / AtBats;
		System.out.println(BA);
		
		
		
	}
}