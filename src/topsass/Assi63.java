/*Write a Java program to count the number of key-value (size) mappings in a map.  */

package topsass;

import java.util.HashMap;
import java.util.Map;

public class Assi63 {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Vilince");
		map.put(2, "Mayuri");
		map.put(3, "Bittu");
		map.put(4, "Vibhuti");
		
		System.out.println("HashMap:  "+map);
		System.out.println("Size of key value: "+map.size());
	}
}
