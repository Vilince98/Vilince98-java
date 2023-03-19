/*Write a Java program to Take three numbers from the user and print the greatest number. */

package topsass;

import java.util.Scanner;

public class assi1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;

		System.out.println("Enter first number: ");
		x = sc.nextInt();
		System.out.println("Enter Seconf number: ");
		y = sc.nextInt();
		System.out.println("Enter thirt number: ");
		z = sc.nextInt();

		if(x >= y && x >= z)
		{
			System.out.println("Maximum number is " +x);
		}
		else if (y >= x && y >= z)
		{
			System.out.println("Maximum number is " +y);
		}
		else
		{
			System.out.println("Maximum number is " +z);
		}


	}
}
