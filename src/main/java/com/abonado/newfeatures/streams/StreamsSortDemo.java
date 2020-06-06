package com.abonado.newfeatures.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.abonado.newfeatures.fi.model.Student;

public class StreamsSortDemo {

	public static void main(String[] args) {
		
		List<String> namesList = Arrays.asList("Cat", "Apple", "Fish", "Ball", "Dance");
		
		List<String> sortedList = namesList.stream().sorted().collect(Collectors.toList());
		
		System.out.println(sortedList);
		
		List<Student> studentList = Student.getStudentList();
		System.out.println(studentList);
		
		//sorting in the reverse order of the name
		//Comparator<Student> studentComp = (s1, s2) -> s2.getFirstName().compareTo(s1.getFirstName());
		System.out.println("sorting in the reverse order of the name");
		studentList.stream().sorted((s1, s2) -> s2.getFirstName().compareTo(s1.getFirstName())).forEach(System.out::println);
		
		
		
		System.out.println("sorting in the ascending order of the marks");
		studentList.stream().sorted((s1, s2) -> Double.valueOf(s1.getMarks()).compareTo(Double.valueOf(s2.getMarks()) ))
				                                     .forEach(System.out::println);
		
		Comparator<Student> marksComparator = (s1, s2) -> Double.valueOf(s1.getMarks()).compareTo(Double.valueOf(s2.getMarks()) );
		Double minMarks = studentList.stream().min(marksComparator).get().getMarks();
		Double maxMarks = studentList.stream().max(marksComparator).get().getMarks();
		
		System.out.println("\nMin Marks::" + minMarks + "  Max Marks:::" + maxMarks);
	}

}
