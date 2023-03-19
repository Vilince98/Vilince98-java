/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods. */

package topsass;

abstract class Shape {
	public abstract void  rectArea(float l, float b);
	public abstract void squareArea(float s);
	public abstract void cirArea(float r);
}

class Area1 extends Shape {
	@Override
	public void rectArea(float l, float b) {
		// TODO Auto-generated method stub
		float a = l*b;
		System.out.println("Area of Rectangle: "+a);
	}

	@Override
	public void squareArea(float s) {
		// TODO Auto-generated method stub
		float s1 = s*s;
		System.out.println("Area of Square: "+s1);
	}

	@Override
	public void cirArea(float r) {
		// TODO Auto-generated method stub
		double c = (3.14)*(r*r);
		System.out.println("Area of Circle: "+c);
	}
}

public class Assi33 {
	public static void main(String[] args) {
		Area1 d = new Area1();
		d.rectArea(4, 5);
		d.squareArea(5);
		d.cirArea(8);
	}
	

}
