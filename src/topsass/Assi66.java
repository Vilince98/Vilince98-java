/*Write a Java program to compare two array lists. */

package topsass;

import java.util.ArrayList;
import java.util.List;

public class Assi66 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Kiwi");
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Apple");
		list1.add("Banna");
		list1.add("Kiwi");
		
		System.out.println("List one: "+list);
		System.out.println("List two: "+list1);
		
		System.out.println("Comparing List... "+list.equals(list1));
 	}
}
