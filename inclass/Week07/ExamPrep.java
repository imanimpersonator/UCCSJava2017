public class ExamPrep {
	public static void main (String[] args) {
		
		int age = 12;
		boolean isDrunk = true;

		if (age >= 14 && isDrunk) 
			System.out.println("You can drive.");
		
		else 
			System.out.println("You can NOT drive.");
			System.out.println("Because you are too young or too drunk.");
			System.out.println(age);
		
		// in this case, the if else statement applies to either "You can drive" and
		// "You cannot drive. " the other two println are printed regardless, because
		// else and if are not closed off. 
		
		
		
		
	}
}