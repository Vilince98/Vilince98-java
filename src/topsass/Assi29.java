/*Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.   */

package topsass;

abstract class Pr {
	public abstract void message();
}

class ChildA extends Pr {
	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is first subclass");
		
	}
}

class ChildB extends Pr {
	@Override
	public void message() {
		// TODO Auto-generated method stub
		System.out.println("This is second subclass");
	}
}


public class Assi29 {
	public static void main(String[] args) {
		
		ChildA c1 = new ChildA();
		c1.message();
		
		ChildB c2 = new ChildB();
		c2.message();
	}
}
