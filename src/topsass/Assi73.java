/*Write a Java program to replace the second element of an Array List with the specified element. */

package topsass;

import java.util.ArrayList;

public class Assi73 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(51);
		list.add(20);
		list.add(16);
		list.add(56);
		
		System.out.println("List: "+list);
		System.out.println("Replacing Second Element..");
		list.set(1, 24);
		System.out.println("List: "+list);
	}
}
