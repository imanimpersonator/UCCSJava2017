public class Person {
	private String firstName = "";
	private String lastName = "";
	private String[] hobbies = null;

	// Constructor method. You do not have to modify it.
	Person () {
		;
	}

	// The following 6 methods are setters and getters.
	//   You do not have to modify them
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String[] getHobbies() {
		return this.hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}	
	
	// Complete this method to find the match number (number of common hobbies)  
	//   between this Person and Person p
	public int findMatchNum (Person p) {
		int matchNum = 0;
		String[] theirHobbies = p.getHobbies();
		for (int i  = 0; i< hobbies.length; i++) {
			for (int j = 0; j< theirHobbies.length; j++) {
				if (theirHobbies[j].equals(hobbies[i])) {
					matchNum++;
				}
			}
		}
		return matchNum;
	}
}