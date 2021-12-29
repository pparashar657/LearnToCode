package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
//		HashMap<String, Integer> map = new HashMap<>();
//		
//		// Put
//		map.put("Pawan", 200);
//		map.put("Chirag", 2000);
//		map.put("chirag", 20);
//		map.put("cHirag", 210);
//		map.put("chiRag", 120);
//		
//		
//		
//		// Get
//		System.out.println(map.get("Pawan"));
//		System.out.println(map.get("Chirag"));
//		System.out.println(map.get("chirag"));
//		
//		// Remove
//		
//		map.remove("Pawan");
//		map.remove("a");
//		
//		// Size
//		
//		System.out.println(map.size());
//		
//		// Contains key
//		
//		System.out.println(map.containsKey("Pawan"));
//		System.out.println(map.containsKey("pawan"));
//		
//		// IS Empty
//		System.out.println(map.isEmpty());
//		
//		// Get all Keys
//		for(String key: map.keySet()) {
//			System.out.println(key + " : " + map.get(key));
//		}
//		
//		// Get all values
//		
//		for (int value: map.values()) {
//			System.out.println(value);
//		}
		
		int[] arr = {1,9,2,5,7,4,8,9};
		System.out.println(findDuplicate(arr));
	}

	private static int findDuplicate(int[] arr) {
		HashMap<Integer, Boolean> map = new HashMap<>();
		for(int num: arr) {
			if(map.containsKey(num)) {
				return num;
			} else {
				map.put(num, true);
			}
		}
		return -1;
		
	}

}
