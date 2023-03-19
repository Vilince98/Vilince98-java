/*Write a Java program to extract a portion of an array list. */

package topsass;

import java.util.ArrayList;
import java.util.List;

public class Assi65 {
	public static void main(String[] args) {
		
		List<String> list = new  ArrayList<String>();
		list.add("Cricket");
		list.add("Badminton");
		list.add("Hockey");
		list.add("Foot Ball");
		
		System.out.println("List:  " +list);
		System.out.println("Extracting array list... ");
		System.out.println(list.subList(1, 3));
	}
}
