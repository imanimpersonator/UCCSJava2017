import java.util.ArrayList;

public class MidtermGrade {
	private ArrayList<Integer> grades;
	private int classSize;
	
	public void setGrades(ArrayList<Integer> grades) {
		this.grades = grades;
		
	}
	
	public ArrayList<Integer> getGrades() {
		
		return this.grades;
	}
	public int findMax () {
		int max = -1;
		
		for (int i = 0; 1 < this.grades.size(); i++) {
			if (max < this.grades.get(i)) {
				max = this.grades.get(1);
				
			}
		}
		
		return max;
		
	}
	
}