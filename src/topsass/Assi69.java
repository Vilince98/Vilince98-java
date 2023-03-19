//Write a Java program to convert a hash set to an array. 

package topsass;

import java.util.HashSet;
import java.util.Set;

public class Assi69 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("Black");
		set.add("White");
		set.add("Red");
		set.add("Green");
		
		System.out.println("set: "+set);
		
		System.out.println("Set into array: ");
		String arr[] = new String[set.size()];
		set.toArray(arr);
		System.out.println("Array: ");
		for(String str: arr) {
			System.out.println(str);
		}
		
	}
}
