package com.abonado.newfeatures.fi.predicates;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PrdeicateJoiningDemo {

	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(0, 5, 10, 15, 20, 25, 30);
		Predicate<Integer> evenPredicate = i -> i%2 == 0;
		Predicate<Integer> greaterThan10 = i -> i > 10;
		
		System.out.println("Even Numbers");
		testMethod(evenPredicate, intList);
		
		System.out.println("\n\nOdd Numbers");
		testMethod(evenPredicate.negate(), intList);
		
		
		System.out.println("\n\nEven Numbers that are greater than 10");
		testMethod(evenPredicate.and(greaterThan10), intList);
		
		System.out.println("\n\nEven Numbers OR Numbers greater than 10");
		testMethod(evenPredicate.or(greaterThan10), intList);
		
		
	}
	
	public static void testMethod(Predicate<Integer> predicate, List<Integer> intList) {
		for(Integer i: intList) {
			if(predicate.test(i)) {
				System.out.print(i + "  ");
			}
		}
		
	}
	
	

}
