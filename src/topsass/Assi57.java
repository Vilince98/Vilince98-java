/*Write a Java program to copy one array list into another.  */

package topsass;

import java.util.ArrayList;
import java.util.List;

public class Assi57 {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list1 = new ArrayList<Integer>();
		
		list.add(2);
		list.add(4);
		list.add(6);
		
		System.out.println("First List: " +list);
		
		list1.add(1);
		list.add(8);
		
		System.out.println("Second List:  " +list1);
		
		System.out.println("Copy first list into second list...");
		list.addAll(list1);
		System.out.println(list);
	}
}
