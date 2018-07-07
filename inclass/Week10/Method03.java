import java.util.ArrayList;

// an object is an instance of a class
// super class is a car. 
// class is hierarchical in order. 
// inherit classes, 
// attributes

public class Method03 {
	public static void main (String[] args) {
	//	System.out.println("Hello World! ");
		
		ArrayList<Integer> scores = new ArrayList<Integer> ();
		scores.add(70);
		scores.add(80);
		scores.add(75);
		scores.add(95);
		scores.add(95);
		scores.add(70);
		
// 		ClassName cn = new ClassName();
// 		cn.methodName();
		
		MidtermGrade mg = new MidtermGrade();
		mg.setGrades(scores);
		
		
		ArrayList<Integer> s = mg.getGrades();
		for (int i = 0; i < s.size() ; i++ ) {
			System.out.println(s.get(i));
		}
		
		int m = mg.findMax();
		System.out.println("Max's score is " + m);
		
		
		
	}
	
}



