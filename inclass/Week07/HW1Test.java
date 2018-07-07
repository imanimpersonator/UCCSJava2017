import java.util.Scanner;

public class HW1Test {
	public static void main (String[] args) {
		
		System.out.println("Enter a Celsius. ");
		
		Scanner input = new Scanner(System.in);
		
		double celsius = 0.0;
		double fahrenheit = 0.0;
		
		celsius = input.nextDouble();
		
		fahrenheit = (celsius * 9 / 5 + 32);
		
		System.out.println("a celsius of " + celsius + " is equal to " + fahrenheit);
	
	
	}





















}