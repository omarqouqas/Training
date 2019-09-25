package training;

import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hMap = new HashMap<Integer, String>();
		
		hMap.put(1, "Omar");
		hMap.put(2, "Qouqas");
		
		boolean doesIt = hMap.containsValue("Omar");
		
		System.out.println(hMap);
		
		System.out.println(hMap.size());
		
		System.out.println(doesIt);

	}

}
