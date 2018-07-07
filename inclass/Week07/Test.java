import java.util.ArrayList;

public class Test {
	public static void main (String[] args) {
	
		ArrayList<String> names = new ArrayList<String>();
		names.add("Spence");
		names.add("Cameron");
		names.add("Mitchell");
		names.add("James");
		names.add("Kevin");
//
		ArrayList<Integer> age = new ArrayList<Integer>();
		age.add(31);
		age.add(23);
		age.add(45);
		age.add(93);
		age.add(55);
	
	
	//	for (int i = 0 ; i < names.size(); i++) {
		//	System.out.println(names.get(i) + " age is " + age.get(i));
		
//		int i = 0;
//		while (i < names.size()) {
//			System.out.println(names.get(i) + " is " + age.get(i) + " year's old. ");
//				i++;
//		}
//		
		int i = 0;
		do {
			i++;
		} while (i < names.size());
			System.out.println(names.get(i) + " is " + age.get(i) + " year's old. ");
		
		
//		String names = "Green";
//		String wantedValue = names.equalsIgnoreCase("Green") ? "Spencer" : "Mitchell";
	
	
	
		
	}
}