import java.util.ArrayList;

public class Quiz4Problem4 {
	public static void main (String[] args) {
		
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("James");
		myList.add("");
		myList.add("John");
		myList.add("Jack");
		myList.add("");
		myList.add("Jeff");

		for (int i = 0 ; i < myList.size() ; i++)
			if (myList.get(i).equals("James")) {
				System.out.println(myList.get(i));
			}
			else if (myList.get(i).equals("John")) {
				System.out.println(myList.get(i));
			}
			else if (myList.get(i).equals("Jack")) {
				break;
			}
		
		
		
		
	}
}