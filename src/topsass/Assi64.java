/*Write a Java program to reverse elements in an array list.  */

package topsass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assi64 {
	public static void main(String[] args) {
		
		List<String> list = new  ArrayList<String>();
		list.add("Cricket");
		list.add("Badminton");
		list.add("Hockey");
		list.add("Foot Ball");
		
		System.out.println("List:  " +list);
		System.out.println("List after reversing...");
		
		Collections.reverse(list);
		System.out.println(list);
	}

}
