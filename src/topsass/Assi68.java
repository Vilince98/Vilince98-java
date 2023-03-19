//Write a Java program to join two array lists. 

package topsass;

import java.util.ArrayList;
import java.util.List;

public class Assi68 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Banana");
		list.add("Kiwi");
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Oranage");
		list1.add("Grapes");
		list1.add("Berry");
		
		System.out.println("List one: "+list);
		System.out.println("List two: "+list1);
		
		System.out.println("Joining lists....");
		list.addAll(list1);
		System.out.println(list);
	}
}
