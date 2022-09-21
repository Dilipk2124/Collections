package org.collection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;


public class Ascending {

	public static void main(String[] args) {

		List<String> li = new ArrayList<String>();
		li.add("Dilip Kumar");
		li.add("Dhanush");
		li.add("Ajith Kumar");
		li.add("Rajinikanth");
		System.out.println("Before Sorting :");

		System.out.println(li);

		System.out.println("\nAfter Sorting :");
		Collections.sort(li);
		System.out.println(li);

	
	

}}
