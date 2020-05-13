package com.abonado.newfeatures.lambda.collections;

import java.util.Set;
import java.util.TreeSet;

//Tree Set have default ascending order sorting
public class TreeSetSortDemo {

	public static void main(String[] args) {
		//Create tree set with descending order
		Set<Integer> mySet = new TreeSet<Integer>((i1, i2) -> i2 - i1);
		mySet.add(5);
		mySet.add(1);
		mySet.add(10);
		
		System.out.println(mySet);
	}

}
