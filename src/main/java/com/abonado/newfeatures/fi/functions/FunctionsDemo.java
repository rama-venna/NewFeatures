package com.abonado.newfeatures.fi.functions;

import java.util.function.Function;

public class FunctionsDemo {

	public static void main(String[] args) {
		
		//Write a function to find length of given input string
		Function<String, Integer> lenghtFunction = s -> s.length();
		System.out.println(lenghtFunction.apply("Test String"));
		
		//Program to remove spaces in the given string by using Function
		Function<String, String> spaceRemoveFunction = s -> s.replaceAll(" ", "");
		System.out.println(spaceRemoveFunction.apply("Rama t he jav a gu ru"));
		
		//Program to find number of spaces present in the given string by using function
		Function<String, Integer> numOfSpacesFunction = s -> s.length() - s.replaceAll(" ", "").length();
		System.out.println(numOfSpacesFunction.apply("Rama t he jav a gu ru"));
	}

}
