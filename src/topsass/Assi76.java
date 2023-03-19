/*Write a Java program to get a collection view of the values contained in this map.*/

package topsass;

import java.util.HashMap;
import java.util.Map;

public class Assi76 {
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Vilince");
		map.put(2, "Bittu");
		map.put(3, "Mayuri");
		map.put(4, "Vibhuti");
		
		System.out.println("HashMap Values: "+map.values());
		
	}
}
