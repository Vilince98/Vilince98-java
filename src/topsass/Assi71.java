/*Write a Java program to check whether a map contains key-value mappings (empty) or not. */

package topsass;

import java.util.HashMap;
import java.util.Map;

public class Assi71 {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Vilince");
		map.put(2, "Bittu");
		map.put(3, "Mayuri");
		
		System.out.println("HashMap: "+map);
		System.out.println("Hash Map is empty or not??? " +map.isEmpty());
	}

}
