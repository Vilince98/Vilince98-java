/* W.A.J.P to create a custom exception if Customer withdraw amount which is greater than account balance then program will show custom exception otherwise amount will deduct from account balance. Account balance is: 2000 Enter withdraw amount: 2500 Sorry, insufficient balance, you need more 500 Rs. To perform this transaction. */

package topsass;

import java.util.Scanner;

class InfBalance extends Exception {
	public InfBalance(String str) {
		super(str);
	}
}


public class Assi42 {	
	public static void main(String[] args) throws InfBalance {
		int b = 2000;
		System.out.println("Account Balance is: "+b);
		Scanner sc = new Scanner(System.in);
	
		try {
			int w;
			System.out.println("Enter withdraw amount: ");
			w = sc.nextInt();
			Withdraw(b,w);
		} catch (InfBalance e) {
			System.out.println("\nException Occured..."+"\n"+e);

}
}

	private static void Withdraw(int b, int w) throws InfBalance {
		// TODO Auto-generated method stub
		if(w > b)
		{
			int r = w-b;
			throw new InfBalance("\n nSorry insufficient balance, you need more "+r+" Rs to perform this transaction");
		}
		else {
			b = b - w;
			System.out.println("Balance after withdrawal: "+b);
		}
		
	}
	}
