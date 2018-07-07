public class Selection03 {
	public static void main (String[] args) {
		//System.out.println("Hello World!");
		
		int age = 0;
		age = 9;
		boolean isDrunk = false;
		
		age = 18;
		isDrunk = true; 
		if(age < 16) {
			System.out.print("No drive."); // no drive
		}
		else {
			if(isDrunk) {
				System.out.println("No drive. "); // no drive
			}
			else {
				System.out.println("You can drive"); // yes drive
			}
		}
	}
}