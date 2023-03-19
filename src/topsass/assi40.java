/* W.A.J. P to demonstrate try catch block, take two numbers from the user by Command line argument and perform the division operation and handle Arithmetic O/PException in thread main java. Lang. Arithmetic Exception:/ by zero */

package topsass;

public class assi40 {
	public static void main(String args[]) {
		
	
		int ca1 = Integer.parseInt(args[0]);
		int ca2 = Integer.parseInt(args[1]);
		
		
		try {
			System.out.println("Enter first argument number: "+ca1);
			System.out.println("Enter Second argument number: "+ca2);
			
			int ans = ca1/ca2;
			
			System.out.println("Division is: "+ans);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error found!! Can not divided by zero");
			e.printStackTrace();
		}
	 }
	}
