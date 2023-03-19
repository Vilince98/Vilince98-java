package topsass;

public class assi36 {
	public static void main(String args[]) {
		int a = 5, b = 0, result;
		try {
			result = a/b;
			System.out.println("Answer is :"+result);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error occured!!");
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in finally block");
		}
	}
}
