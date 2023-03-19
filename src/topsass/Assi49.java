/* Write a Java program to create a new array list, add some colors (string) and print out the collection.  */

package topsass;

import java.util.ArrayList;
import java.util.List;

public class Assi49 {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Black");
		list.add("White");
		list.add("Red");
		list.add("Blue");
		list.add("Green");
		list.add("Cyan");
		list.add("Yellow");
		list.add("Orange");
		list.add("Pink");
		System.out.println("List of colors:  "+list);
	}

}
