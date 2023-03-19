/*Write a Java program to get the number of elements in a hash set.  */

package topsass;

import java.util.HashSet;
import java.util.Set;

public class Assi61 {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(24);
		set.add(74);
		set.add(20);
		set.add(52);
		System.out.println("Set: " +set);
		
		System.out.println("Number of element in set:  "+set.size());
		
		
	}
}
