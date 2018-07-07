import java.util.ArrayList;

public class IfStatementHW3 {
	public static void main (String[] args) {
		
		ArrayList<String> NamesList = new ArrayList<String>();
		
		NamesList.add("James");
		NamesList.add("Joe");
		NamesList.add("Josh");
		NamesList.add("Jason");
		NamesList.add("Jenny");
		NamesList.add("Jeff");
		NamesList.add("Tee-Tee");
		
		ArrayList<Integer> AgeList = new ArrayList<Integer>();
		AgeList.add(25);
		AgeList.add(58);
		AgeList.add(16);
		AgeList.add(18);
		AgeList.add(21);
		AgeList.add(44);
		AgeList.add(8);
		
		for (int t = 0 ; t < AgeList.size(); t++ ) {
			if (AgeList.get(t) >= 21) {
				System.out.println(NamesList.get(t) + ": You are " + AgeList.get(t) + ". You can drink and drive. Yay! ");
			}
			else if (AgeList.get(t) < 21 && AgeList.get(t) >= 16) {
				System.out.println(NamesList.get(t) + ": You are " + AgeList.get(t) + ". You can drive but cannot drink. ");
			}
			else if (AgeList.get(t) < 16) {
				System.out.println(NamesList.get(t) + ": You are " + AgeList.get(t) + ". You are too young to drink or drive. ");
			}
		}
	}
}