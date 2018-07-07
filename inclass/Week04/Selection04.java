//import java.util.Scanner;

public class Selection04 {
	public static void main (String[] args) {
		
//		// String comparison
//		String s = "";
//		s = "Exit";
//		//Scanner input = new Scanner(System.in);
//		//s = input.Next(); 
//				
//		if( s.equalsIgnoreCase("Quit") || s.equalsIgnoreCase("Exit")) {
//			System.out.println("Goodbye! ");
//		}
//		else {
//			System.out.println("let us continue. ");
		
		// Find max num}
//		int i = 0,  j = 0;
//		int max = 0; 
//		i = 4;
//		j = 4;
//				
//		if(i == j ) {
//			max = i;
//			System.out.println(i +" is equal to " + j);
//		}
//		else if (i > j) 
//		{
//			max = i;
//			System.out.println(max + " is greater than " + j);
//		}
//		else {
//			max = j;
//			System.out.println(max + " is greater than " + i);
//		}
		// BMI determination
		double height = 1.72;
		double weight = 59.0;
		double BMI = weight / height / height;
		
		
		// < 18.5, underweight 18.5 - 25: normal > 25: over
		
		if (BMI <= 18.5) {
			System.out.println("Your weight of " + BMI + " is underweight. ");
		} 
		else if (18.5 < BMI && BMI < 25) {
			System.out.println("Your BMI of " + BMI + " is normal weight. ");
		}
		else {
			System.out.println("Your " + BMI + "makes you overweight. ");
		}
	}
		
}
// to declare variables, need to compare both, and possibly store
// another value in an if/else statement. 