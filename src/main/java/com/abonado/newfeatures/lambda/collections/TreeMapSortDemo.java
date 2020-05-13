package com.abonado.newfeatures.lambda.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> myMap = new TreeMap<>((i1, i2) -> i2 - i1);
		myMap.put(100, "Rama");
		myMap.put(50, "Sankar");
		myMap.put(300, "Saket");
		
		System.out.println(myMap);
	}

}
