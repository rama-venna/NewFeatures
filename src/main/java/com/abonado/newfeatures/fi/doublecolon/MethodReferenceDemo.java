package com.abonado.newfeatures.fi.doublecolon;

interface MyInterface {
	public void interfMethod();
}

public class MethodReferenceDemo {

	public static void main(String[] args) {
		MyInterface myInterface = MethodReferenceDemo::classStaticMethod;
		myInterface.interfMethod();
		
		//second example
		MethodReferenceDemo mRefDemo = new MethodReferenceDemo();
		Runnable r = mRefDemo::myClassRun;
		Thread t = new Thread(r);
		t.start();
		for(int i = 0; i<10; i++) {
			System.out.println("Main Thread:::" +i);
		}

	}
	
	public static void classStaticMethod() {
		System.out.println("interfMethod referencing classStaticMethod");
	}
	
	
	public void myClassRun() {
		for(int i = 0; i<10; i++) {
			System.out.println("Child Thread:::" +i);
		}
	}

}
