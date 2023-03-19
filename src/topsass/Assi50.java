/*rite a Java program to iterate through all elements in an array list.  */

package topsass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assi50 {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		list.add(1);
		list.add("Vilince");
		list.add("Patel");
		
		System.out.println("Iterating List elements");
		
		Iterator i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
