public class Start {
	public static void main (String[] args) {
		
		Rectangle rt = new Rectangle();
		
		//So the getter grabs the value and has THE ABILITY to display.
		// Setter sets a new value to the value. 
		rt.setHeight(3.0);
		rt.setWidth(2.0);
		
		
		//only three things you can print: numeric values, boolean statements, and strings
		System.out.println(rt.getPerimeter());
		System.out.println(rt.getArea());
		System.out.println(rt.IsSquare());
		
		
		
		
	}

}
//pages for good examples: 323, 368, 371, and 377. 