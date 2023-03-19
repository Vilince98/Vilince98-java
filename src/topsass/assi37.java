package topsass;

import java.util.Scanner;

public class assi37 {
	public static void main(String argd[]) {
		Scanner sc1 = new Scanner(System.in);
		int n1,n2,ans;
				
		try {
			System.out.println("Enter dividend");
			n1 = sc1.nextInt();
			System.out.println("Enter divison");
			n2 = sc1.nextInt();
			
			ans = n1/n2;
			System.out.println("Result is"+ans);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error occured!! can not divide By zero");
		}
		
	}
	
}
