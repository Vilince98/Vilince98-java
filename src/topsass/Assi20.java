/*W.A.J.P to find the second most frequent character in a given string. The given string is: successes The second most frequent char in the string is: c  */

package topsass;

import java.util.Scanner;

public class Assi20 {
	
	static final int total_char = 256;
	
	static char seconfMostFrequentChar(String str) {
		int count[] = new int[total_char];
		int i;
		for(i=0;i<str.length();i++) {
			(count[str.charAt(i)])++;
			
		}
		int first=0, second=0;
		
		for(i=0; i<total_char; i++) {
			if(count[i] > count[first]) {
				second = first;
				first = i;
				
			}
			else if(count[i] > count[second] && count[i] != count[first]) {
				second = i;
			}
		}
		return (char)second;
	}
	
	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String: ");
		str = sc.next();
		char res = seconfMostFrequentChar(str);
		
		if(res != '\0') {
			System.out.println("The second most Frequent character:  "+res);
		}
		
		else {
			System.out.println("No second most frequent character");
		}
	}
}
