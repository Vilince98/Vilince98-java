/*Write a Java program to iterate through all elements in a hash list.  */

package topsass;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assi60 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(24);
		set.add(74);
		set.add(20);
		set.add(52);
		System.out.println("Set:  "+set);
		
		System.out.println("Iterating...");
		Iterator<Integer> i = set.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
