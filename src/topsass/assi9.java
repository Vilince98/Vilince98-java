/* Write a Java program to count the letters, spaces, numbers and other 
  characters of an input string.  */
package topsass;

import java.util.Scanner;

public class assi9 {
	public static void main(String[] args) {
		
		int letter=0, num=0,space=0,other=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		
		for(int i= 0; i<str.length(); i++)
		{
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if(Character.isDigit(ch[i])) {
				num++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				space++;
			}
			else {
				other++;
			}
		}
		System.out.println("There are " +letter+ " Letter");
		System.out.println("There are " +num+ " Digits");
		System.out.println("There are " +space+ " Space");
		System.out.println("There are " +other+ " Other character");
		}
}
