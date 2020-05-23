package com.abonado.newfeatures.fi.model;

import java.util.Arrays;
import java.util.List;

public class Student {
	private int id;
	private String firstName;
	private double marks;
	private String grade;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public Student(int id, String firstName, double marks, String grade) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.marks = marks;
		this.grade = grade;
	}
	
	public static List<Student> getStudentList(){
		List<Student> studentList = Arrays.asList(new Student(1, "John", 80, ""),
												  new Student(2, "Mohan", 100, ""),
												  new Student(3, "Pavan", 60, ""),
												  new Student(4, "Srini", 79, ""));
		
		return studentList;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", marks=" + marks + ", grade=" + grade + "]";
	}
	
	
	
	
}
