package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Example {
	public static void main(String[] args) {
		
	List<Integer> list = new ArrayList<Integer>();
	list.add(99);
	list.add(88);
	list.add(77);
	list.add(66);
	list.add(55);
	
	list.forEach(x->System.out.println(x));
	
	
	
	}

}
