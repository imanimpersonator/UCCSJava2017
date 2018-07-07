import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// You do NOT want to modify this file, especially the setPeople() method. This file 
//   reads a text file, import the information, and set up the ArrayList people. 

public class ReadFile {
	private ArrayList<Person> people = new ArrayList<Person> ();
	
	// Constructor method. You do not have to modify it.
	ReadFile () {
		;
	}
	
	// Read a text file and set up a list of people with their names and hobbies
	public void setPeople (String path) {
		// path is where the input file locates
//        System.out.println(path);		

	    String line = "";
		
		// Any potential "dangerous" statements have to be included in a "try block"
		try {
			// This is how to read a text file
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			// Keep read the next line until no line is available
		    while ((line = br.readLine()) != null) {	
				String firstName = "";
				String lastName = "";
				String[] hobbies = null;
				Person p = new Person ();
			
				// This is a typical regular expression to split a string based on a diliminator. The result is a string array
				// The first element of the array is "Lastname, Firstname"
				// The second element of the array is "Hobby1, Hobby2, ..., HobbyN"								
		        String[] arr1 = line.split(" : ");	
				
				// Test to see if the read-in works				
//		        System.out.println(arr1[0]);
//		        System.out.println(arr1[1]);

				// Split the name string so that we can have separated first and last names
		        String[] arr2 = arr1[0].split(", ");				
				lastName = arr2[0];
				firstName = arr2[1];				

				// Split the hobby string to get the array of hobbies
		        hobbies = arr1[1].split(", ");		

				// Test to see if the read-in works
//		        System.out.println(firstName);
//		        System.out.println(lastName);
//		        System.out.println(hobbies[0]);
//		        System.out.println(hobbies[1]);
//		        System.out.println(hobbies[3]);				
				
				// Set up the Person object p. You need to implement your Person class to realize those following methods
		        p.setFirstName (firstName);
		        p.setLastName (lastName);
		        p.setHobbies (hobbies);
				
				// After the Person object p is successfully created, add it to the people list
				this.people.add(p);
		    }
		    
			// Close buffer reader object to release the occupied memory
		    br.close();
		}
		// Every "try" block needs to have at least one "catch" block to handle the possible errors
		catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	// Return the created people list
	public ArrayList<Person> getPeople () {
		// "this." specifies that the variable should belong to THIS object, and not other overwritten objects.
		return this.people;
	}
}