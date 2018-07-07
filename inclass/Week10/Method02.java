import java.util.ArrayList;


public class Method02 {
	public static void main (String[] args) {
		
		System.out.println("Hello World! ");
		
		int i = sumUp(3, 50);
		System.out.println("The Summation from 3 to 50 is " + i); 
		
		ArrayList<Integer> scores = new ArrayList<Integer> ();
		scores.add(70);
		scores.add(80);
		scores.add(75);
		scores.add(95);
		scores.add(95);
		scores.add(70);
		
		findMax(scores);
		int maxScore = findMax(scores);
		System.out.println("The Max score is " + maxScore);
		// so findMax is method, and is being used on ArrayList, which is what it was supposed to find,
		// next, need to assign to new value. 
	}
	
	public static int sumUp(int a, int b) {
		int sum = 0;
		
		for (int i = a; i <= b; i++){
			sum = sum + i;
			
		}
		return sum;
		
	}
	
	
	public static int findMax (ArrayList<Integer> grades) {
		int max = -1;
		
		for (int i = 0; i < grades.size(); i++) {
			if (max < grades.get(i)) {
				max = grades.get(i);
				
			}
		}
		
		return max;
		
	}
}