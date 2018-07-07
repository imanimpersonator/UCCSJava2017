import java.util.ArrayList;

public class CarList {
	// this is setting up an ArrayList of
	// car attributes given in Car.java class.
	// Need to initialize ArrayList
	private ArrayList<Car> allCars = new ArrayList<Car>();
	
	// a is a Car object. 
	// Below is a LIST of cars
	public void	setAllCars(ArrayList<Car> a) {
		this.allCars = a;
	}
	
	// can have methods in one class, but their
	// parameters must be different. 
	// return value is NOT a part of method signature.
	// method signature: method name, and method parameter. 
	
	// this method is just one car. 
	// this method is how to add just one car to list.
	
	// how do we know which method to get?
	// A: depends on what the parameters are,
	// and what is used in main for the parameters.
	// give me one car, and this method will add it to the CarList
	public void	setAllCars(Car c) {
		allCars.add(c);
//		this.allCars = a;
	}
	//
	
	public ArrayList<Car> getAllCars () {
		return this.allCars;
	}
	// no parameters, because method doesn't need one. 
	public int getCarNum () {
		return this.allCars.size();
	}
	//.get(i) gets an index, and then getMake gets make from the given index
	// to count int, use loop.
	// in if statement, both objects are cars. 
	//this.getAllCars is a car, 
	// c is also a car. so can do c.isSameMake
	public int getTotalMakeNum(Car c) {
		int count = 0;
		for (int i = 0 ; i < this.allCars.size() ; i++ ) {
			 if (this.getAllCars().get(i).isSameMake(c)) {
				count ++;
			 }
			 else {
				 ;
			 }
		}
		
		return count;
	}
	
	
	
	
	
	
	
}