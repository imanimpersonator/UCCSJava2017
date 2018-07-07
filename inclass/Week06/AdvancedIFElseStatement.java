import java.util.Scanner;

public class AdvancedIFElseStatement {
	public static void main (String[] args) {
		
		System.out.println("Welcome to the Stupid Test. Please Enter your age.");
		
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		
		if (age < 16) {
			System.out.println("You're too young for this. ");
		}
		else {
			System.out.println("What is your brother's age? ");
			int bro = 0;
			bro = input.nextInt();
			
			if (bro < 12) {
				System.out.println("Your brother is way too young. ");
			}
			else {
				System.out.println("Give me your weight. ");
				
				int weight = 0;
				weight = input.nextInt();
				
				if (weight > 100) {
					System.out.println("your weight of " + weight + " is amazing! ");
				}
				else {
					System.out.println("You Suck! ");
				}
			}
		}
		
		
		
		
		
		
	}
}