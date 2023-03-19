/*Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters. For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).  */

package topsass;

class Print {
	public void printIntChar(int i, char c) {
		System.out.println("Method having parameter(int,char)");
		System.out.println("Integer is: " + i);
		System.out.println("Character is: " + c);
	}

	public void printIntChar(char c, int i) {
		System.out.println("Method having parameter(char,int)");
		System.out.println("Character is: " + c);
		System.out.println("Integer is: " + i);
	}
}

public class Assi22 {
	public static void main(String[] args) {
		Print p = new Print();
		p.printIntChar(51, 'V');
		p.printIntChar('J', 24);
	}
}
