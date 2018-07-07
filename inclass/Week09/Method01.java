public class Method01 {
	public static void main (String[] args) {
//		int answer = narwhal(2, 5);
		narwhal(2, 5);
		
		double i = 3.5;
		double j = 4.1;
		panda(i, j);
		double sum = panda(i, j);
		
		System.out.println(i + " + " + j + " = "  + sum );
		
		double pi2 = pi();
		
		System.out.println("PI Squared is " + pi2);
			
	}
	
	
	public static double panda(double a, double b) {
		double c = a + b;
		return c;
	}
	
	public static void narwhal(int a, int b) {
		for (int i = a; i <= b; i ++) {
			System.out.println(i);
		}
	}
	
	public static double pi() {
		return Math.PI * Math.PI;
		
	}
	
}



// both parameters must be double
// main doesn't even know panda exists
// void means no return value. 
// in the place of third, its what the return value will return.
// first parameters, then return values. 
// name of method must not be capitalized. 
// if there's a return value, make sure to catch it. 
// Order does matter. 
// note: no return value == void. 
// For calling a method, you do not need to use variables. 
// if no return value, then no assignment. 
// 4 possible types of methods: with parameter, with return value.
// with parameter, without return value: without parameter, with return value:
// without parameter, without return value. 
// always call back to main, to make it easier to understand. 
// statics must call statics inside a single file. 
// how do we make a large project, and make it smaller?
// read chapter 6, and 9, and review project requirements. 
// around friday, check email for teammates. 