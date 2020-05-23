package com.abonado.newfeatures.fi.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateWithStringDemo {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("John Doe", "Donald Trump", "Johnson King", null, "");
		
		Predicate<String> strPredicate = s -> null != s && s.startsWith("J");
		
		System.out.print("Is my name 'Rama' starting with J?:"+strPredicate.test("Rama"));
		
		
		System.out.println("\n\nNames start with J from names List:");
		testMethod(strPredicate, names);
		
		Predicate<String> nonEmptyStrings = s -> null != s && s.trim().length() > 0;
		System.out.println("\n\nNon Empty Names from names List:");
		testMethod(nonEmptyStrings, names);

	}
	
	public static void  testMethod(Predicate<String> predicate, List<String> names) {
		System.out.println(names.stream().filter(predicate).collect(Collectors.toList()));
		
	}

}
