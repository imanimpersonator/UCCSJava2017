import java.util.ArrayList;

public class Loop02 {
	public static void main (String[] args) {
	//	System.out.println("Hello World! ");
		
	ArrayList<String> NameList = new ArrayList<String> ();
	
	NameList.add("Jacob F");
	NameList.add("Kim");
	NameList.add("James");
	NameList.add("Jack");
	
	//for (int i = 0 ; i < NameList.size() ; i++ ) {
		//System.out.println(NameList.get(i) + " is absent. ");
		
	// use index to get names.
	// rather, get i.
	// Keep in mind how many indexes there are. 
	// Can use variable NameList.size() to get all values from array.
	
		for (int i = 0 ; i < NameList.size() ; i++ ) {
		
			if (      NameList.get(i).equals("James")     ) {
				System.out.println(" James is indeed absent. He is the " + (i + 1) + "rd person in the absent list. ");
				break; // key word: Continue; 
			}
		}
		
	}
}