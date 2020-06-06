package com.abonado.newfeatures.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo1 {

	public static void main(String[] args) {
		
		List<Integer> allInt = Arrays.asList(15, 10, 5, 0, 20, 25);
		System.out.println("All Integers");
		print(allInt);
		
		//filter the even numbers
		List<Integer> evenInt = allInt.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println("Even Integers");
		print(evenInt);
		//allInt.stream().filter(i -> i%2 == 0).forEach(System.out::print);
		
		//how many event numbers?
		long count = allInt.stream().filter(i -> i%2 == 0).count();
		System.out.println("Even number count:::"+ count);

		//double the each elements value in the allInt list
		List<Integer> doubleInt = allInt.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println("Doubled Integers");
		print(doubleInt);
		
		//convert the list of integers to Integer array
		Integer[] intArray = allInt.stream().toArray(Integer[] :: new);
		
		//Create stream with group of values
		Stream<Integer> intStream = Stream.of(10, 20, 25, 30, 50);
		System.out.println("Group of integers to stream");
		intStream.forEach(System.out::println);
		
		
		//Create stream for array
		Double[] doubleArray = {10.0, 20.0, 30.0, 40.0};
		Stream<Double> doubleStream = Stream.of(doubleArray);
		System.out.println("Group of double values to stream");
		doubleStream.forEach(System.out::println);
		
		
		
	}
	
	private static void print (List<Integer> collection) {
		collection.stream().forEach(i -> System.out.print(i + " "));
		System.out.println();
	}

}
