/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize the length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square.*/ 

package topsass;

class Rectangle{
	int l,b;
	public Rectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}
	
	public void perimeter() {
		System.out.println("Perimeter of rectangle: "+(2*(l+b)));
	}
	
	public void area() {
		System.out.println("Area of rectangle: "+(l*b));
	}
	
}
class Square extends Rectangle{
	public Square(int l, int b) {
		super(l, b);
		System.out.println("Perimeter of sqaure: "+(4*l));
		System.out.println("Area of square: "+(l*b));

	}
}
public class Assi26 {
	public static void main(String[] args) {
		Square s = new Square(4, 2);
		s.perimeter();
		s.area();
	}
}
