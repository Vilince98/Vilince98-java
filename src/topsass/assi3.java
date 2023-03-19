/*Write a Java program that takes a year from user and print whether that year is a leap year or not.  */

package topsass;

import java.util.Scanner;

public class assi3 {
	public static void main(String[] args) {
		int year;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year:  ");
		year  = sc.nextInt();
		
		if(((year %4 == 0) && (year %100 != 0)) || (year %400 == 0)){
			System.out.println("Enter Year is Leap Year");
			
		}
		else {
			System.out.println("Enter year is not Leap Year");
		}
		
	}
}
