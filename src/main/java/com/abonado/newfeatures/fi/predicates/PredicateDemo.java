package com.abonado.newfeatures.fi.predicates;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> intPred = num -> num>10;
		System.out.println(intPred.test(10));
		System.out.println(intPred.test(20));
		
		Predicate<String> strPred = s -> s.length() > 5;
		System.out.println(strPred.test("Rama"));
		System.out.println(strPred.test("LongString"));
		
		Predicate<Collection> colPred = col -> col.isEmpty();
		List<String> stringList = Arrays.asList("str1", "str2");
		System.out.println(colPred.test(stringList));
		
		
	}

}
