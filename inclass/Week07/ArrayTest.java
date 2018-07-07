import java.util.ArrayList;

public class ArrayTest {
	public static void main (String[] args) {
		
		
		ArrayList <String> Cool = new ArrayList<String>();
		
		
		Cool.add("Happy");
		Cool.add("Angry");
		Cool.add("Ready");
		Cool.add(2,"Super mad");
		System.out.println(Cool);
		System.out.println(Cool.get(2));
		System.out.println(Cool.remove("Happy"));
		System.out.println(Cool.size());
		
		
		String[] ArrayTotal = {"","","","","james", "Paul"};
		
		String[] ArrayCool = new String[10];
		ArrayCool[0] = "Rob";
		ArrayCool[1] = "Kyle";
		System.out.println(ArrayCool[1]);
		
		System.out.println(ArrayTotal.length);
		System.out.println(ArrayTotal);
		
		
		
		
	}
}