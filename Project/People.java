import java.util.ArrayList;

public class People {
	private ArrayList<Person> people = new ArrayList<Person> ();
	
	// Constructor method. You do not have to modify it.
	People () {
		;
	}
	
	// The following 2 methods are setters and getters.
	//   You do not have to modify them
	public void setPeople(ArrayList<Person> ppl) {
		this.people = ppl;
	}
	
	public ArrayList<Person> getPeople() {
		return this.people;
	}
	
	// Given a pair of first and last name, return the index number if 
	//   the input name exists in this.people. Return -1 only when the
	//   input name does NOT exist in this.people. 
	public int findPerson (String fn, String ln) {
		int yourIndex = -1;
		for (int i = 0; i < this.people.size(); i++) {
			if (this.people.get(i).getFirstName().equals(fn) && this.people.get(i).getLastName().equals(ln)) {
				yourIndex = i;
			}
		}
		return yourIndex;
	}
	
	// Given a person's index, yourIndex, first find that Person p. Then
	//   find the array of match numbers between p and any other Persons 
	//   in this.people except p him/her-self. 
	//   Note: You definitely will need to call method findMatchNum()
	//   in Person.java to find the match number between two Persons.
	public int[] findAllMatchNums (int yourIndex) {
		Person p = this.people.get(yourIndex);		
		int[] matchNums = new int [this.people.size()];
		for (int i = 0; i < this.people.size(); i++){
			if (i == yourIndex) {
				matchNums[i] = -1;
				i++;
			}
			else {
				matchNums[i] = p.findMatchNum(this.people.get(i));
			}
		}
		return matchNums;
	}
	
	// Given an array of integers, find the maximum integer
	//   NOTE: This method actually does not need to use this.people. :) 
	public int findMaxMatchNum (int[] matchNums) {
		int maxMatchNum = 0;
		for (int i = 0; i < matchNums.length; i++) {
			if (matchNums[i] > maxMatchNum) {
				maxMatchNum = matchNums[i];
			}
		}
		return maxMatchNum;
	}
	
	// Given the array of match numbers and the max number of match numbers, 
	//   find the list of ALL best matching person's index numbers.
	//   Note: This method does not utilize this.people either. 
	//   Note2: the return value has to be an ArrayList instead of an array
	//   because we can not foresee how many people will be the best matches. 
	public ArrayList<Integer> bestMatchPersons (int[] matchNums, int maxMatchNum) {
		ArrayList<Integer> bestMatchIndices = new ArrayList<Integer>();
		for (int i = 0; i < matchNums.length; i++) {
			if (matchNums[i] == maxMatchNum) {
				bestMatchIndices.add(i);
			}
		}
		return bestMatchIndices;
	}
	
	// Given the list of best matching Persons' indices, display their names and 
	//   hobbies by following the requirements in the Project Description document. 
	public void displayPersons (ArrayList<Integer> bestMatchIndices) {
		for (int i = 0; i < bestMatchIndices.size(); i++) {
			Person person = this.people.get(bestMatchIndices.get(i));
			System.out.print(person.getLastName()+", "+person.getFirstName() + " : ");
			String [] hobbies = person.getHobbies();
			for (int j = 0; j<hobbies.length; j++) {
				System.out.print(hobbies[j] + ", ");
			}
				System.out.println();
			}
		}
}
		
