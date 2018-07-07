import java.util.Scanner;

public class TestingFiles {
	public static void main (String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String MyChar  = "";
		MyChar = input.next();
		
		String Name = "Mitchell";
		
		if (MyChar.equalsIgnoreCase(Name)) {
			System.out.print("Why, " + Name + " is the best name in the world! ");
		}
		else {
			System.out.print("Who died and named you? ");
			}
		
	}
}
// On line 13, for strings, to get it to catch red, need to add .equals