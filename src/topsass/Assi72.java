//Write a Java program to increase the size of an array list. 

package topsass;

import java.util.ArrayList;

public class Assi72 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(51);
		list.add(20);
		list.add(16);
		list.add(56);
		
		System.out.println("List: "+list);
		System.out.println("List size: "+list.size());
		System.out.println("Increasing list size..");
		list.ensureCapacity(5);
		list.add(52);
		System.out.println(list);
	}
}
