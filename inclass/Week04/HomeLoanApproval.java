// By Mitchell Stone
// Homework 2, xx/xx/xxxx
// Home Loan Approval Engine

import java.util.Scanner;

public class HomeLoanApproval {
	public static void main (String[] args) {
		
		System.out.println("Please enter your down payment percentage");
		double DownPayment = 0.0;
		Scanner input = new Scanner(System.in);
	//	Scanner scan = new Scanner(System.in);
		DownPayment = input.nextDouble();
				
		if (DownPayment < 15.0) {
			System.out.println("Your application has been rejected. ");
			}
		else {
				System.out.println("Please enter your current credit score");
				int CreditScore = 0;
				CreditScore = input.nextInt();
			
			if (CreditScore < 500) {
				System.out.println("Your application has been rejected due to your low credit score. ");
				}
			else {
				System.out.println("Your application has been approved! ");
				}
			}
	}
}
