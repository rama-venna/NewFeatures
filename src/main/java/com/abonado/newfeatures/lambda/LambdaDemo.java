package com.abonado.newfeatures.lambda;

import java.util.Comparator;

@FunctionalInterface
interface PrintInterface {
	public void print();
}

@FunctionalInterface
interface MathInterface<P1, P2> {
	public Number mathFunction(P1 p1, P2 p2);
}

@FunctionalInterface
interface MyInterface {
	public void myMethod();
}

public class LambdaDemo {

	public static void main(String[] args) {
		PrintInterface pi = () -> System.out.println("Lambda Demo");
		pi.print();

		MathInterface<Integer, Integer> mi = (a, b) -> a + b;
		System.out.println(mi.mathFunction(5, 6));

		MathInterface<Float, Float> mi1 = (a, b) -> a * b;
		System.out.println(mi1.mathFunction(5.2f, 6f));

		Comparator<String> myComparator = (String s1, String s2) -> s1.compareTo(s2);
		System.out.println(myComparator.compare("Rama", "Venna"));
		
		LambdaDemo ld = new LambdaDemo();
		ld.myLambdaMethod();
		ld.myAnonymusMethod();

	}

	int x = 1000;

	public void myLambdaMethod() {
		MyInterface myInterface = () -> {
			// int x = 786; //Lambda expression local variable can't redeclare another
			// local variable
			int y = 99;
			System.out.println("myLambdaMethod>>>>>"+this.x);
			System.out.println("myLambdaMethod>>>>>"+y);

		};
		
		myInterface.myMethod();
	}
	
	public void myAnonymusMethod() {
		MyInterface myInterface = new MyInterface() {
			int x = 786; //we can redeclard local variable of main class.
			@Override
			public void myMethod() {
				int y = 99;
				System.out.println("myAnonymusMethod>>>>>"+this.x);
				System.out.println("myAnonymusMethod>>>>>"+y); //not this.y
			}
			
		};
		
		myInterface.myMethod();
		
	}

}
