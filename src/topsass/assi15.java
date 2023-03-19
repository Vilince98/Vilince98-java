//W.A.J.P to concatenate a given string to the end of another string. 

package topsass;

import java.util.Scanner;

public class assi15 {
	public static void main(String[] args) {
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1");
		s1 = sc.next();
		System.out.println("Enter string 2");
		s2 = sc.next();
		
		System.out.println("Concataining: "+s1.concat(s2));
	}
}
