/* W.A.J.P to create the validate method that takes integer value as a parameter. If the age is less than 18, then throw an Arithmetic Exception otherwise print a message welcome to vote. O/P- Enter your age: 16 Exception in thread main java. Lang. Arithmetic Exception: not valid  */

package topsass;

import java.util.Scanner;

public class Assi41 {
	int validate(int age) {
		try {
			if(age < 18) {
				throw new ArithmeticException("You can't vote...");
			}
			else {
				System.out.println("Welcome to vote!!");
			}
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return 0;
	}
	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		
		Assi41 ob = new Assi41();
		ob.validate(age);
		
	}
}
