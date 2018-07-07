import java.util.Scanner;

public class DrivingTest {
	public static void main (String[] args) {
		System.out.println("Welcome to the Drive verifier! Please answer a few short questions. ");
		
		Scanner input = new Scanner(System.in);
		Scanner Scan = new Scanner(System.in);
		
		System.out.println("How old are you? ");
		int age = 0;
		age = input.nextInt();
		
		if(age < 16) {
			System.out.print("No drive.");// no drive
		}
		else {
			System.out.println("Are you drunk?");
			boolean isDrunk = false;
			isDrunk = Scan.nextBoolean();
			
			if(isDrunk) {
				System.out.println("No you're drunk. "); // no drive
			}
			else {
				System.out.println("You can drive. "); // yes drive
			}
		}
	}
}