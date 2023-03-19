/*Write a Java program to update specific array element by given element.  */

package topsass;

import java.util.ArrayList;
import java.util.List;

public class Assi53 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Vilince");
		list.add("Patel");
		list.add("8.14");
		list.add("MCA");
		list.add("Java");
		
		System.out.println("List is: "+list);
		System.out.println("Updating element Java by IOS");
		list.set(4, "IOS");
		System.out.println(list);
	}
}

