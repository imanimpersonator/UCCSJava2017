import java.util.ArrayList;

public class Array04 {
	public static void main (String[] args) {
		
		
		String[] ArrayList = new String[10];
		
		ArrayList[0] = "Paul Rudd";
		
		
		ArrayList <String> StringList = new ArrayList <String>();
		
		
		StringList.add("Michael Cera");
		StringList.add("Danny Devito");
		StringList.add("Johnny Depp");
		
		StringList.remove(1);
		System.out.println(StringList.get(0));
		System.out.println(StringList.size());
		System.out.println(ArrayList.length);
		
	}
}