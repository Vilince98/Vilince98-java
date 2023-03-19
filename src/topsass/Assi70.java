//Write a Java program to convert a hash set to a List/Array List. 

package topsass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assi70 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Black");
		set.add("White");
		set.add("Red");
		set.add("Green");
		
		System.out.println("set: "+set);
		
		System.out.println("Set into arrayList: ");
		List<String> list = new ArrayList<String>(set);
		System.out.println("List: "+list);
	}
}
