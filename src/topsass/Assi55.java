/*Write a Java program to search an element in an array list.  */

package topsass;

import java.util.ArrayList;
import java.util.List;

public class Assi55 {
	public static void main(String[] args) {
		
		List<String> list = new  ArrayList<String>();
		list.add("Cricket");
		list.add("Badminton");
		list.add("Hockey");
		list.add("Foot Ball");
		
		System.out.println("List about sport:  " +list);
		System.out.println("Search Cricket in list...");
		int s = list.indexOf("Cricket");
		System.out.println("Cricket found at "+s+" postion");
		
	}
}
