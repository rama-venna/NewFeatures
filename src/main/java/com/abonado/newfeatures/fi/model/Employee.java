package com.abonado.newfeatures.fi.model;

import java.util.ArrayList;
import java.util.List;

public class Employee {

	private int id;
	private String name;
	private String role;
	private int salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	public Employee(int id, String name, String role, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}
	public static List<Employee> getEmployeeData(){
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "John Doe", "Manager", 100000));
		employeeList.add(new Employee(2, "Kaushik Das", "Developer", 150000));
		employeeList.add(new Employee(3, "Sankar Dada", "Tester", 120000));
		employeeList.add(new Employee(4, "Paul Eddie", "Developer", 180000));
		employeeList.add(new Employee(5, "Caramanica John", "Director", 200000));
		
		
		return employeeList;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
	
	
}
