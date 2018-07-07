public class Rectangle {
	private double width = 0.0;
	private double height = 0.0;
	
	Rectangle() {
		;
	}
	
	// For setter, must have something to input to change value of given set value
	public void setWidth (double width) {
		this.width = width;
	}
	
	// the getter will tell you what you were looking for. No parameter, but will return the value back to main. 
	public double getWidth () {
		return this.width;
	}
	
	public void setHeight (double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	// we already know the width and height, so no need to insert into parameter
	public double getPerimeter() {
		return (this.height + this.width) * 2;
	}
	
	//
	public double getArea() {
		return (this.height * this.width);
	}
	
	// Boolean because must return if the rectangle is a square or not
	public boolean IsSquare() {
		boolean temp = false;
		
		if (this.width == this.height) {
			temp = true;
		}
		
		
		return temp;
	}
	
	
	
}	
	
	
	// only one main: only parameters and methods
	// parameters first always
	// then constructors
	// then setters and getters
	// if method has no return value, then cannot print anything, and nothing will show. 
