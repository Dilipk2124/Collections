package org.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListMethods {  
	public static void main(String[] args) {
		
		List<Integer>li = new ArrayList<Integer>();
		List<Integer>li1 = new ArrayList<Integer>();
		li.add(70);
		li.add(80);
		li.add(90);
		li.add(50);
		li.add(60);
		li.add(40);
		li.add(30);
		li.add(null);
		System.out.println(li);
		//1.IsEmpty Method
		boolean b = li.isEmpty();
		System.out.println(b);
		//2.Contains Method
		boolean c = li.contains(null);
		System.out.println(c);
		//3.add Method
		li.add(5, 20);
		System.out.println(li);
		//4.remove Method
		li.remove(8);
		System.out.println(li);
		//5.IndexOf Method
		int indexOf = li.indexOf(40);
		System.out.println(indexOf);
		//6.set Method
		li.set(1, 10);
		System.out.println(li);
		li1.add(90);
		//7.addAll Method
		li1.addAll(li);
		System.out.println(li1);
		//8.lastIndexOf Method
		int lastIndexOf = li1.lastIndexOf(90);
		System.out.println(lastIndexOf);
		//9.Equals Method
		boolean d = li.equals(li1);
		System.out.println(d);
		//10.Iterator Method
		ListIterator<Integer> iterator = li.listIterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer+ " ");
			
		}
		System.out.println(li);
	}

}
