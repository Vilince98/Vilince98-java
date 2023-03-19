/*  W.A.J.P to check whether a given string starts with the contents of another string. Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts with Red? False I3. */

package topsass;

import java.util.Scanner;

public class assi18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter content of another string to compare start: ");
		String s2 = sc.nextLine();

		System.out.println("Comparison:  " + s1.startsWith(s2));
	}

}
