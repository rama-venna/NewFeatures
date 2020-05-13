package com.abonado.newfeatures.lambda.collections.util;

import java.util.ArrayList;
import java.util.List;

import com.abonado.newfeatures.lambda.collections.model.Person;

public class SortDemoWithoutLambda {

	public static void main(String[] args) {
		Person p1 = new Person(1, "John-1", "DOe-1");
		Person p2 = new Person(2, "John-2", "DOe-1");
		Person p3 = new Person(3, "John-3", "DOe-1");
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(p3);
		personList.add(p1);
		personList.add(p2);
		
		System.out.println(personList);
		personList.sort(new MyPersonComparator());
		System.out.println(personList);
		

	}

}
