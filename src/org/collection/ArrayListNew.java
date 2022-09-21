package org.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListNew {

	public static void main(String[] args) {
		List<String> li = new ArrayList<String>();
		li.add("Dilip");
		li.add("Kumar");
		li.add("Akshay");
		li.add("Kumar");
		li.add("Hrithik");
		System.out.println(li);
		
		//1. retrieve an element 
		String str1 = li.get(0);
		String str2 = li.get(1);
		//2. remove the third element
		li.remove(3);
		//3. update specific array element
		li.set(3, "Dhanush");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(li);

	}

}
