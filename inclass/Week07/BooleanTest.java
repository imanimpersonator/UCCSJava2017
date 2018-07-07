import java.util.Scanner;
import java.util.ArrayList;

public class BooleanTest {
	public static void main (String[] args) {
		
		System.out.println("What's my name again?");
		
		Scanner input = new Scanner(System.in);
		String MyString = input.next();
		
		if (MyString.equalsIgnoreCase("Jackie")) {
			System.out.println("You must be Jackie Robinson! ");
		}
		else {
			System.out.println("What's your surname? ");
			
			String Surname = "";
			Surname = input.next();
			
			if (Surname.equals("Joyner")) {
				System.out.println("Youre legendary! ");
			}
			else {
				System.out.println("Who are you again? ");
			}
		}	
	}
}