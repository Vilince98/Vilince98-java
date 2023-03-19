/*Write a Java program to print all the elements of an Array List using the position of the elements. */

package topsass;

import java.util.ArrayList;

public class Assi74 {
	public static void main(String[] args) {
		
		ArrayList<String> list = new  ArrayList<String>();
		list.add("Cricket");
		list.add("Badminton");
		list.add("Hockey");
		list.add("Foot Ball");
		
		System.out.println("List:  " +list);
		
		String arr[] = new String[list.size()];
		list.toArray(arr);
		for(int i =0; i<arr.length; i++) {
			System.out.println("Element at index "+i+" is "+arr[i]);
		}
	}
}
