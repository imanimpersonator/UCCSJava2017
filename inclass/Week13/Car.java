public class Car {
	private String make = "";
	private String model = "";
	private int age = -1;
	
	public void setMake (String m) {
		this.make = m;
	}
	
	public String getMake () {
		return this.make;
	}
	
	public void setModel (String m) {
		this.model = m;
	}
	
	public String getModel () {
		return this.model;
	}
	
	public void setAge (int a) {
		this.age = a;
	}
	public int getAge () {
		return this.age;
	}
	// First things to ask for methods: 
	// do you need parameters for this? If so, what is needed? 
	// Need to know other car make most likely.
	// Could ask for the class car,
	// or could just ask for the name of the car. 
	// c.getMake gets other the make of the car
	// c.getMake doesn't need parameters, because getMake is a getter, which doesn't have a parameter. 
	// needs a parameters, because we need an EXTERNAL car to compare to our car. 
	// this.methodName refers to the current object, not a method from another class. 
	public boolean isSameMake (Car c) {
		String m = c.getMake();
		boolean same = false;
		
		// m is assigned as getMake, which is the car from the list. 
		// so the argument is: is someone else's car's make(getMake)
		// the same as the list's make(this.make)? 
		if(m.equalsIgnoreCase(this.make)) {
			// thus, if if statement is true, 
			// the variable same is switched to true. 
			return true;
		}
		// otherwise, return true. 
		return false;
	}

	
	
}
