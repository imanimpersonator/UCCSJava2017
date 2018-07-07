public class LoopPractice2 {
	public static void main (String[] args) {
		
		String[] array =  {"Danny", "Phillip", "Steve", "Dan", "Patrick"};
		
		int i = 0;
		while ( array[i].equals("Danny")) {
			System.out.println(i + " is a Leotard. ");
			i++;
		}
		i = -1;
		do {
			i++;
		}
		while ( array[i].equals("Phillip"));
		System.out.print(i);
		
	}
}

// while loop terminates if there are no conditions initially met.
// i.e., it basically won't do anything if 