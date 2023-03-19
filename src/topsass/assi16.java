/*W.A.J.P to compare a given string to the specified character sequence. Comparing topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false */

package topsass;

import java.util.Scanner;

public class assi16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string 1: ");
		String s1 = sc.next();
		System.out.println("Enter string 2: ");
		String s2 = sc.next();
		System.out.println("Comparison of given strings:"+s1.equals(s2));
		
	}
}
