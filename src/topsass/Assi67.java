/*Write a Java program of swap two elements in an array list. */

package topsass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assi67 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Kiwi");
		list.add("Orange");
		list.add("Grapes");
		
		System.out.println("List:  "+list);
		
		System.out.println("Kiwi swapping with Grapes...");
		Collections.swap(list, 2, 4);
		System.out.println("Swapping:  "+list);
		
	}

}
