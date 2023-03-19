/*Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.  */

package topsass;

import java.util.Scanner;

public class assi2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s1;
		System.out.println("Enter Character :");

		s1 = sc.next();

		if(s1.length() > 1) {
			System.out.println("Enter only one character");
		}
		
		else if(s1.matches("[aeiouAEIOU]?")) {
			System.out.println("Entered character is vowel");
		}
		
		else if(!s1.matches("[a-z A-Z]")) {
			System.out.println("Please...Enter alphabets only");
		}
		
		else {
			System.out.println("Enter character is constatnt");
		}
		

	}

}
