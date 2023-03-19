/*Create a class named 'Print Number' to print various numbers of different data types by creating different methods with the same name 'printn' having a parameter for each data type  */

package topsass;

class Number {
	public void printn(int num) {
		System.out.println("Integer number: " + num);
	}

	public void printn(long num) {
		System.out.println("Long number: " + num);
	}

	public void printn(float num) {
		System.out.println("Float number: " + num);
	}

	public void printn(double num) {
		System.out.println("Double number: " + num);
	}

	public class assi21 {
		public static void main(String[] args) {
			Number n = new Number();
			n.printn(51);
			n.printn(5484165484L);
			n.printn(24.5686F);
			n.printn(5152.465486486);
		}
	}
}
