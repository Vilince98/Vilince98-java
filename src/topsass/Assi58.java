/*Write a Java program to shuffle elements in an array list.  */

package topsass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assi58 {
	public static void main(String[] args) {
		List<String> list = new  ArrayList<String>();
		list.add("Cricket");
		list.add("Badminton");
		list.add("Hockey");
		list.add("Foot Ball");
		
		System.out.println("List about sport:  " +list);
		System.out.println("List after shuffling...");
		
		Collections.shuffle(list);
		System.out.println(list);
	}
}
