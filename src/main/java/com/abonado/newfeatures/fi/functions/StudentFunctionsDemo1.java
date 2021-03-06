package com.abonado.newfeatures.fi.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.abonado.newfeatures.fi.model.Student;

public class StudentFunctionsDemo1 {

	// change the student object to set the grades

	public static void main(String[] args) {

		Function<Student, Student> studentFunction = s -> {
			if (s.getMarks() >= 80)
				s.setGrade("A");
			else if (s.getMarks() >= 70)
				s.setGrade("B");
			else
				s.setGrade("C");

			return s;

		};
		studentsWithGrades(studentFunction, Student.getStudentList());

		Function<List<Student>, Double> totalMarks = slist -> {
			double total = 0;
			for (Student s : slist) {
				total = total + s.getMarks();
			}
			
			return total;
		};
		System.out.println("Total of all student marks:" + totalMarks.apply(Student.getStudentList()));

	}

	public static void studentsWithGrades(Function<Student, Student> studentFunction, List<Student> studentList) {
		for (Student s : studentList) {
			System.out.println("Before: " + s);
			studentFunction.apply(s);
			System.out.println("After: " + s);
			System.out.println();
		}

	}

}
