package org.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethods {
	public static void main(String[] args) {
		Map<Integer, String> mp = new HashMap<Integer, String>();
		Map<Integer, String> mps = new HashMap<Integer, String>();
		// 1.Put
		mp.put(1, "Dilip");
		mp.put(2, "Vijay");
		mp.put(3, "Ajith");
		
		// 2.EntrySet
		Set<Entry<Integer, String>> set = mp.entrySet();
		
		// 3.Iterator
		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry en = (Map.Entry) it.next();
			System.out.println(en.getKey() + " " + en.getValue());
		}
		//4.size
		int i = mp.size();
		System.out.println("Size of Given Map is : " + i);
		
		//5.getKey
		String st = mp.get(2);
		System.out.println("Value of 2nd Keys is : " + st);
		
		//6.getValue
		Collection<String> values = mp.values();
		System.out.println("\nThe Entered Values are : " );
		for (String string : values) {
		System.out.println(string);
			
		}
		//7.Keyset
		Set<Integer> keySet = mp.keySet();
		System.out.println("\nThe Entered keys are : " );
		for (Integer in : keySet) {
			System.out.println(in);
			
		}
		//8.Hashcode
		int Code = mp.hashCode();
		System.out.println(Code);
		
		//9.putAll
		mps.putAll(mp);
		System.out.println(mps);
		
		//10.replace
		mps.replace(1, "Rajini");
		System.out.println(mps);
	}
}