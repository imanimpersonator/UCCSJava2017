import java.util.ArrayList;

public class LoopPractice03 {
	public static void main (String[] args) {
		
		

		ArrayList<String> myList = new ArrayList<String>();
		myList.add("James");
		myList.add("");
		myList.add("John");
		myList.add("Jack");
		myList.add("");
		myList.add("Jeff");

		int i = 0;
		while (! myList.get(i).equals("Jack")) {
			System.out.println("Their index is "  + (i));
			i++;
		}
		
		
	}
}