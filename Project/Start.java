import java.util.ArrayList;
import java.util.Scanner;

public class Start {
	public static void main(String[] args) {
		// You do NOT want to modify before line 14. 
		//   They call methods in ReadFile.java to load ALL person's 
		//   information. 
		String path = "data/Hobby List.txt";
		ReadFile rf = new ReadFile();
		rf.setPeople(path);
		// Note: ppl is very very useful to your code. ALL person's 
		//   information is loaded to ppl. You may read the following
		//   example to see how to exploit ppl.
		ArrayList<Person> ppl = rf.getPeople();
		
		// The object "people" is now loaded! 
		People people = new People();
		people.setPeople(ppl);
		
		System.out.println("Starting Decoders's work: ");
		
		System.out.println("Number of Students: " + ppl.size());
		Scanner scan = new Scanner(System.in);
		
		boolean stop = false;
		while(!stop) {
			System.out.println("Enter your first name: ");
			String firstName = scan.next();
			System.out.println("Enter your last name: ");
			String lastName = scan.next();
	
			//loop start
			int j = people.findPerson(firstName, lastName);
			if (j == -1) {
				System.out.println(firstName + " " + lastName + " not found.");
			}
			else {
				Person person = ppl.get(j);
				System.out.print(firstName + " " + lastName + " found! Hobbies include: ");
				for (int k = 0; k < person.getHobbies().length; k++) {
					System.out.print(person.getHobbies()[k] + ", ");
				}
				System.out.println();
				int[] matchNums = people.findAllMatchNums(j);
				int maxMatchNum = people.findMaxMatchNum(matchNums);
				ArrayList<Integer> bestMatches = people.bestMatchPersons(matchNums, maxMatchNum);
				System.out.println("Best matches for " + firstName + " " + lastName + " are:");
				people.displayPersons(bestMatches);
			}
			System.out.println("Do you want to continue? Y/N");
			String cont = scan.next();
			if (cont.equals("N")) {
				stop = true;
			}
		//loop end
		}
	}
	
}
