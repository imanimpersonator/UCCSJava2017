import java.util.ArrayList;

public class Array01 {
	public static void main (String[] args) {
	//	System.out.println("Hello World! ");
		
		int[] intArray = new int[10];
		ArrayList <Integer> intList = new ArrayList<Integer>();
		
		intArray[0] = 32;
		intArray[9] = 45;
		
		intList.add(32);
		intList.add(60);
		intList.add(45);
		intList.add(1, 60);		
		
		
		
		System.out.println(intList);
		
		System.out.println(intArray[3]);
		
		System.out.println(intList.get(0));
				
		intList.remove(1);
		// you really can only remove from Arraylist. 
		
		System.out.println("the size of ArrayList " + intList.size());
		
		System.out.println("The size of intArray is " + intArray);
		
	
		
		
		
		// to get a certain number, make sure to use variable.get(index);
		// to get size of array, for ArrayList, use variable.size();
		// For array, no values really can be removed. 
		
		
	}
}