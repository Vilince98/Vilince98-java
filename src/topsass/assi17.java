/* W.A.J.P to check whether a given string ends with the contents of another string. "Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True  */

package topsass;

import java.util.Scanner;

public class assi17 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String s1 = sc.nextLine();
		System.out.println("Enter content of another string to compare end: ");
		String s2 = sc.nextLine();
		
		System.out.println("Comparison:  "+s1.endsWith(s2));
	}
}
