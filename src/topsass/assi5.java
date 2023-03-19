/*Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.  */

package topsass;

import java.util.Scanner;

public class assi5 {
	public static void main(String[] args) {
		int i;
		float sum=0,avg;
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		for(i=0;i<5;i++)
		{
			System.out.print("Enter number "+(i+1)+": ");
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
			avg = sum / 5;
			System.out.println("Sum of numbers: "+sum);
			System.out.println("Average of numbers: "+avg);
		}
		

	}
