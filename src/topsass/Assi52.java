/*Write a Java program to retrieve an element (at a specified index) from a given array list.  */

package topsass;

import java.util.ArrayList;
import java.util.List;

public class Assi52 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Vilince");
		list.add("Patel");
		list.add("8.14");
		list.add("MCA");
		list.add("Java");
		
		System.out.println("List is: "+list);
		System.out.println("Element at 3rd position: "+list.get(2));
	}
}
