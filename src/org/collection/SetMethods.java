package org.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetMethods {
	public static void main(String[] args) {

		Set<Integer> s = new LinkedHashSet<Integer>();
		Set<Integer> s1 = new LinkedHashSet<Integer>();

		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(9);
		s.add(7);
		System.out.println(s);
		// 1.addAll Method
		s1.addAll(s);
		// 2.add Method
		s1.add(10);
		System.out.println(s1);
		// 3.Contains Method
		boolean b = s.contains(7);
		System.out.println(b);
		// 4.Hash code Method
		int code = s.hashCode();
		System.out.println(code);
		// 5.isEmpty Method
		boolean c = s.isEmpty();
		System.out.println(c);
		// 6.Iterator Method
		Iterator<Integer> iterator = s.iterator();
		while (iterator.hasNext()) {
			Integer inte = (Integer) iterator.next();
			System.out.println(inte);

		}
		// 7.Remove Method
		s1.remove(9);
		// 8.RetainAll Method
		s1.retainAll(s);
		System.out.println(s1);
		// 9.getSize
		int i = s.size();
		System.out.println(i);
        //10.removeAll
		s1.removeAll(s1);
		System.out.println(s1);

	}

}
