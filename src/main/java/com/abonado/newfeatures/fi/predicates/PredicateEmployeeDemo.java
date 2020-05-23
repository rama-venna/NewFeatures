package com.abonado.newfeatures.fi.predicates;

import java.util.List;
import java.util.function.Predicate;

import com.abonado.newfeatures.fi.model.Employee;

public class PredicateEmployeeDemo {

	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeeData();
		Predicate<Employee> allDevPredicate = p -> p.getRole().equalsIgnoreCase("Developer");
		System.out.println("[All Developers----------->]");
		display(allDevPredicate, employeeList);
		
		Predicate<Employee> salaryPredicate = p-> Integer.valueOf(p.getSalary()).compareTo(160000) > 0;
		System.out.println("\n[All Employees with salaray more thank 160K----------->]");
		display(salaryPredicate, employeeList);
		
		Predicate<Employee> devAndSalPredicate = allDevPredicate.and(salaryPredicate);
		System.out.println("\n[All Developers with salaray more thank 160K----------->]");
		display(devAndSalPredicate, employeeList);
		
		

	}
	
	private static void display(Predicate<Employee> predicate, List<Employee> employeeList ) {
		
		for(Employee emp: employeeList) {
			if(predicate.test(emp)) {
				System.out.println(emp);
			}
		}
	}

}
