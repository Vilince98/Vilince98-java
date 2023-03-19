/*Create a class with a method that prints "This is a parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call 1 - method of parent class by object of parent class 2 - method of child class by object of child class 3 - method of parent class by object of child class   */

package topsass;

class Parent
{
	public void superMethod() {
		System.out.println("This is parent class");
	}
}

class Child extends Parent
{
	public void subMethod() {
		System.out.println("This is child class");
	}
}
public class Assi24 {
	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
		
		p.superMethod();
		c.subMethod();
		c.superMethod();
		
	}
}
