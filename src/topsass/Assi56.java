/*Write a Java program to sort a given array list.  */

package topsass;

import java.util.ArrayList;
import java.util.List;

public class Assi56 {
	public static void main(String[] args) {
		List<String> list = new  ArrayList<String>();
		list.add("Cricket");
		list.add("Badminton");
		list.add("Hockey");
		list.add("Foot Ball");
		
		System.out.println("List about sport:  " +list);
		System.out.println("List after sorting...");
		list.sort(null);
		System.out.println(list);
	}
}
