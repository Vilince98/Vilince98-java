/*W.A.J.P to find all interleaving of given strings. The given strings are: WX YZ The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ   */


package topsass;

import java.util.Scanner;

public class Assi19 {
	
	static void printInterLeaving(String s1, int i, String s2, int j, String s3) {
		if(i == s1.length() && j == s2.length()) {
			System.out.println(s3);
		}
		if(i < s1.length()) {
			printInterLeaving(s1, i+1, s2, j, s3 + s1.charAt(i));
		}
		if(j < s2.length()) {
			printInterLeaving(s1, i, s2, j+1, s3 + s2.charAt(j));
		}
	}
	
	public static void main(String[] args) {
		String s1,s2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First String: ");
		s1 = sc.next();
		
		System.out.println("Enter Second String: ");
		s2 = sc.next();
		
		printInterLeaving(s1, 0, s2, 0, "");
	}
}
