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
	list.add(44);
	list.add(33);
	list.add(22);
	list.add(11);
	

	list.stream().forEach(x->System.out.println(x));
System.out.println("New line is added here ");
	System.out.println("hii mock A5");
	}

}
