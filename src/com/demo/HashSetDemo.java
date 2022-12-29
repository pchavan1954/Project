package com.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("prathamesh");
		set.add("chavan");
		set.add("prafull");
		set.add("chavan");
		System.out.println(set);
	}

}
