package com.abonado.newfeatures.defaultmethods;


interface MyInterface{
	//default is keyword not modifier
	default void method1() {
		System.out.println("MyInterface default method");
	}
}

interface MyInterface1{
	//default is keyword not modifier
	default void method1() {
		System.out.println("MyInterface1 default method");
	}
}


public class DefaultMethodsDemo implements MyInterface, MyInterface1{

	public static void main(String[] args) {
		DefaultMethodsDemo demo = new DefaultMethodsDemo();
		demo.method1();

	}


	
	//when two interfaces have same method, provide your own implementation
	//and call the methods you need or you can have your own implementation
	@Override
	public void method1() {
		//System.out.println("My Class default method impl");
		MyInterface.super.method1();
		//MyInterface1.super.method1();
		System.out.println();
	}

}
