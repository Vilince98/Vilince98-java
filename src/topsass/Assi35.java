/*Create a class named 'Shape' with a method to print "This is this is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class. */

package topsass;

class Shape1 {
	public void Shape() {
		System.out.println("This is shape...");
	}
}

class Rect extends Shape1 {
	public void rectShape() {
		System.out.println("This is rectnagle shape...");
	}
}

class Circle extends Shape1 {
	public void circleShape() {
		System.out.println("This is circle shape...");
	}
}

class Square1 extends Rect {
	public void squrShape() {
		System.out.println("Square is Retangle");
	}
}
public class Assi35 {
	public static void main(String[] args) {
		Square1 s = new Square1();
		s.Shape();
		s.rectShape();
	}
}
