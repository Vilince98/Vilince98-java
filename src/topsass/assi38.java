/*W.A.J. P to demonstrate multiple catch blocks, (one is to handle divide by zero exception and another one is to handle ArrayIndexOutOfBoundException) int a [] =new int [5]; a [5]=30/0;  */

package topsass;

import java.util.Scanner;

public class assi38 {
	public static void main(String args[]) {
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);

		
		try {
			for(int i=0;i<a.length;i++)
			{
			System.out.print("Enter a["+i+"]: ");
			a[i] = sc.nextInt();
			System.out.println("10 divided by "+a[i]+" : "+(10/a[i]));
			}
			System.out.println("Array elements");
			for(int i=0;i<=a.length;i++)
			{
			System.out.print(a[i]+" ");
			}

				
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("\nCannot divide by zero");
			
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("\nArray index is out of bound");
			e.printStackTrace();

		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
