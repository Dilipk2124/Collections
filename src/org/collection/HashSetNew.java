package org.collection;

import java.util.HashSet;

public class HashSetNew {

	public static void main(String[] args) {

		HashSet<String> s = new HashSet<String>();
		HashSet<String> s1 = new HashSet<String>();
		s.add("Selenium");
		s.add("Pl/Sql");
		s.add("Manual Testing");
		s.add("Java");
		s.add("RestApi");
		s.add("JSP");
		System.out.println("Original Hash Set: " + s);

		// 3. to clone a hash set to another hash set.

		s1 = (HashSet) s.clone();
		System.out.println("Copied Hash Set: " + s1);

		// 2.hash set is empty or not.
		boolean b = s.isEmpty();
		System.out.println(b);
		
		// 1.empty an hash set.
		s1.removeAll(s);
		s.clear();
		System.out.println(s + "\n" + s1);

	}

}
