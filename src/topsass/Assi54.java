/*Write a Java program to remove the third element from an array list. */

package topsass;

import java.util.ArrayList;
import java.util.List;

public class Assi54 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Vilince");
		list.add("Patel");
		list.add("8.14");
		list.add("MCA");
		list.add("Java");
		
		System.out.println("List is: "+list);
		System.out.println("List after Removing...");
		list.remove(4);
		System.out.println(list);
		
	}
}
