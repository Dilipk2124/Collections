package org.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapNew {

	public static void main(String[] args) {
		HashMap<Integer, String> mp = new HashMap<Integer, String>();
		HashMap<Integer, String> mp1 = new HashMap<Integer, String>();
		mp.put(1, "Computer");
		mp.put(2, "Science");
		mp.put(3, "Engineering");
		System.out.println(mp);

		// 2.contains key-value mappings (empty) or not
		boolean b = mp.isEmpty();
		System.out.println(b);

		// 3.copy of a HashMap instance
		mp1 = (HashMap)mp.clone();  
		System.out.println("Copied Map2 : " + mp1);
		//1. remove all of the mappings from a map
		mp.clear();
		System.out.println(mp);
	}

}
