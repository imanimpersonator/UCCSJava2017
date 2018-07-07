import java.util.ArrayList;

public class Start {
	public static void main (String[] args) {
	
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.setAge(20);
		c1.setMake("Honda");
		c1.setModel("Civic");
		
		c2.setAge(5);
		c2.setMake("Honda");
		c2.setModel("Accord");
		
		c3.setAge(1);
		c3.setMake("BMW");
		c3.setModel("M6");
		
		// Uses isSameMake method to compare
		// one car to another.
		System.out.println(c1.isSameMake(c2));
		
		ArrayList<Car> c = new ArrayList<Car>();
		// each of the cars are Car.
		// c only has three operations available:
		// .add, .get, .remove.
		c.add(c1);
		c.add(c2);
		c.add(c3);
		// NOTE: this is same but different from below list. 
		
		// cl has much more behavior and methods
		
		// declares an object cl, which is an instance of class CarList
		CarList cl = new CarList();
		cl.setAllCars(c);
		// Above method needs an ArrayList first, because thats
		// what setAllCars's parameter is. 
		// This method is simply setting the list
		//cl.setAllCars(c3);
		// While this method is simply adding cars to the CarList.
		// getAllCars will return an ArrayList<Car>, which we cannot do.
		// Below is ArrayList<Car>
		// Thus, cannot print getAllCars
		// cl.getAllCars(c);
		
		// So below code is essentially:
		// the first car, c1, search through ArrayList<Car>
		// Then, we get the first index of the ArrayList<Car>, 
		// which returns an ArrayList<Car>
		// Finally, to be able to print, we must get getMake,
		// who's return type is a String, which we can print out
		System.out.println(cl.getAllCars().get(1).getModel());
		
		// Important to pay attention to return values!
		// Essentially, we need to "convert" non-printable types
		// to printable types. 
		cl.getAllCars();
		
		System.out.println(cl.getCarNum());
		System.out.println(cl.getTotalMakeNum(c1));
		
		
	}
	

}