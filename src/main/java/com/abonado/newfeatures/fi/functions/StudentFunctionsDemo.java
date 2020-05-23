package com.abonado.newfeatures.fi.functions;

import java.util.List;
import java.util.function.Function;

import com.abonado.newfeatures.fi.model.Student;

public class StudentFunctionsDemo {
	
	//Program to find student grade by using function

	public static void main(String[] args) {
		
		Function<Student, String> gradeFunction = s -> { if(s.getMarks() > 80) return "A";
														 if(s.getMarks() > 70) return "B";
														 else return "C";
														};
		printGrades(gradeFunction, Student.getStudentList());											

	}
	
	public static void printGrades(Function<Student, String> gradeFunction, List<Student> studentList) {
		for(Student student: studentList) {
			System.out.println(student + "-->" + gradeFunction.apply(student));
		}
	}

}
