/*Print the sum, difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by user.   */

package topsass;

import java.util.Scanner;

class Complex{
	float r1,r2,i1,i2;
	public Complex(float r1, float r2, float i1, float i2) {
		this.r1 = r1;
		this.r2 = r2;
		this.i1 = i1;
		this.i2 = i2;
	}
	
	public void sum() {
		System.out.println("sum of complex number: "+(r1+r2)+" + "+(i1+i2)+"i");
		
	}
	public void diff() {
		System.out.println("Diffrence of complex number: "+(r1-r2)+" + "+(i1-i2)+"i");
	}
	
	public void product() {
		System.out.println("Product of complex number: "+((r1*r2)-(i2*i1))+" + "+((r1*i2)+(r2*i1))+"i");
	}
}

public class Assi28 {
	public static void main(String[] args) {
		float r1,r2,i1,i2;
		
		Scanner sc  =new Scanner(System.in);
		
		System.out.println("Enter real part of 1 number: ");
		r1 = sc.nextFloat();
		System.out.println("Enter real part of 2 number: ");
		r2 = sc.nextFloat();
				
		System.out.println("Enter imaginary part of 1 number: ");
		i1 = sc.nextFloat();
		System.out.println("Enter imaginary part of 2 number: ");
		i2 = sc.nextFloat();
		
		Complex c =new Complex(r1, r2, i1, i2);
		c.sum();
		c.diff();
		c.product();
	}
}
