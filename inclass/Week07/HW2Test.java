import java.util.Scanner;


public class HW2Test {
	public static void main (String[] args) {

	System.out.println("Enter a Down Payment percent");
	
	Scanner input = new Scanner(System.in);
	double DownPayment = input.nextDouble();
	
		if (DownPayment < 15.0) {
			System.out.println("Rejected. ");
		}	
		else {
			System.out.println("Enter a Credit Score");
			int cs = 0;
			cs = input.nextInt();

			if (cs < 500) {
				System.out.println("rejected");
			}	
			else {
				System.out.println("Youre score of " + cs + " has been accepted. ");
			}
		}

	}
}