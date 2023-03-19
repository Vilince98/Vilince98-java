/*Write a Java program to compare two sets and retain elements which are same on both sets. */

package topsass;

import java.util.HashSet;
import java.util.Set;

public class Assi75 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Black");
		set.add("White");
		set.add("Red");
		set.add("Green");
		
		System.out.println("Set one: "+set);
		
		
		Set<String> set1 = new HashSet<String>();
		set1.add("Orange");
		set1.add("White");
		set1.add("Red");
		set1.add("Blue");
		System.out.println("List Two: "+set1);
		
		System.out.println("Same element in both set..");
		set.retainAll(set1);
		System.out.println("Hash set content: "+set1);
		
	}
}
