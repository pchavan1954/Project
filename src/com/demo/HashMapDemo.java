package com.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
	Map<String,Integer> map = new HashMap<String,Integer>();
	map.put("ajay", 1);
	map.put("vijay",2);
	map.put("Sanjay",3);
	map.put("prathamesh", 4);
	map.forEach((x,y)->System.out.println(x+ " " + y));
	System.out.println("Hello velocity java batch");
	}
}
