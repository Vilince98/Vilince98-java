/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.   */

package topsass;

class Triangle{
	public Triangle() {
		
	}
	public void calc(float s1, float s2, float s3) {
		System.out.println("Perimeter of triangle: "+(s1+s2+s3));
		System.out.println("Area of trriangle: "+(0.5*(s2*s3)));
	}
}

public class Assi27 {
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.calc(7, 4, 2);
	}
}
