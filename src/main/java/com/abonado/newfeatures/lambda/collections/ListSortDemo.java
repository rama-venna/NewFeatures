package com.abonado.newfeatures.lambda.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.abonado.newfeatures.lambda.collections.model.Person;

public class ListSortDemo {
	
	public static void main(String[] args) {
		Person p1 = new Person(1, "John-1", "DOe-1");
		Person p2 = new Person(2, "John-2", "DOe-1");
		Person p3 = new Person(3, "John-3", "DOe-1");
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(p3);
		personList.add(p1);
		personList.add(p2);
		
		
		//Comparator<Person> myCompartor = (person1, person2) -> person1.getId() - person2.getId();
		
		Comparator<Person> myCompartor = (person1, person2) -> person2.getFirstName().compareTo(person1.getFirstName());
		
		System.out.println(personList);
		//personList.sort(myCompartor);
		Collections.sort(personList, myCompartor);;
		System.out.println(personList);

	}

}
