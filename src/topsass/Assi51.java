/*Write a Java program to insert an element into the array list at the first position.  */

package topsass;

import java.util.ArrayList;
import java.util.List;

public class Assi51 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(51);
		list.add(52);
		list.add(56);
		
		System.out.println(list);
		
		list.add(0, 24);
		System.out.println("List After inserting...");
		System.out.println(list);
	}
}
