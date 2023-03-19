/* W.A.J. P to implement the above program (pro.no-B27) using nesting of try-catch block. try { try {//code} catch (Exception e) {//code} catch (Exception e) {//code}  */

package topsass;

public class Assi39 {
	public static void main(String[] args) {
		int a[] = new int[5];
		try {
			try {
				for(int i = 0; i < a.length; i++) {
					a[i] = 100/i;
					System.out.println(a[i]);
				}
			} catch (ArithmeticException e) {
				// TODO: handle exception
				System.out.println("Can not divided by zero");
			}
			for(int i = 1; i < a.length; i++) {
				a[i] = 100/i;
				System.out.println(a[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array size is out of bound");
			e.printStackTrace();
		}
	}
}
