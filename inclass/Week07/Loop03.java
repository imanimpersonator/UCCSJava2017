public class Loop03 {
	public static void main (String[] args) {
			String[] nameArray = {"James", "Jack", "Jeff", "Jason", "Jane"};
			
			for (int i = 0 ; i < nameArray.length ; i ++ ) {
				//nameArray[i];
				
				// "Jason".equals(nameArray[i])
				if ( nameArray[i].equals("Jason") ) {
					System.out.println("Jason's index is " + (i + 1) );
					break;
				}
				else {
					;
				}
			
			
			}
			int i = 0;
			while ( !	nameArray[i].equals("Jason")) {
				i ++;
			}
			System.out.println("Jason's index is " + (i+1));
			// ! reverses boolean statements. thus, when the answer is true, 
			// when i == Jason, then the code returns false, and the loop is stopped. 
			
			
			
			i = -1;
			do {
				i++;
			}
			while (nameArray[i].equals("Jason")) ;
			System.out.println("Jason's index is " + (i + 1));
			
			// i's value then will be the same one when the loop ended. 
			// the do while loop will skip 0 if i starts at 0. 
			// do-while loop executes at least once. it differs from while loop because it has a semicolon at the end. 
			// while loop is an entry loop. If returns false, then it stops, and the loop is exited
			// a do-while loop first iterates, then looks for true and false statements. 
	}
}	