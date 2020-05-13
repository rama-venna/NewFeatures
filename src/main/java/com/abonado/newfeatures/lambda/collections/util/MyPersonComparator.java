package com.abonado.newfeatures.lambda.collections.util;

import java.util.Comparator;

import com.abonado.newfeatures.lambda.collections.model.Person;

public class MyPersonComparator implements Comparator<Person>{

	@Override
	public int compare(Person p1, Person p2) {
		return p1.getId() - p2.getId();
	}
	

}
