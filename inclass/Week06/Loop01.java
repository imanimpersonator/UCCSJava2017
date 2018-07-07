public class Loop01 {
	public static void main (String[] args) {
		// System.out.println("Hello World! ");
		
	//	for (int i = 1 ; i < 11 ; i++ ) {
		//		System.out.println(i);
			//	}
	//	for (int i = 2; i < 11 ; i += 2 ) {
		//	System.out.println(i);
		//}
		
		//for (int i = 1 ; i < 6 ; i ++ ) {
			//System.out.println(i * 2);
		//}
		//for (int i = 1 ;i < 6 ; i ++) {
		//System.out.println(i * 2 - 1);
		//}
		//for (int i = 1; i < 6 ; i ++) {
			//System.out.println(i * 2 - 1);
		//}
		
		for (int i = 5; i > 0 ; i --) {
			System.out.println(i * 2 - 1);
		}
		
		
		// Doesnt work because i disappears after loop.
		// can redeclare outside of loop. 
		// can declare outside of loop, to use for loop. 
		// however, when used for loop, i remains because it was declared outside loop. 
		// better to declare variable INSIDE loop. 
	}
}
// for for statement, First is initiation, then termination, then increment
// immediately check for termination. In this case, i is true,
// because it is less than 11.