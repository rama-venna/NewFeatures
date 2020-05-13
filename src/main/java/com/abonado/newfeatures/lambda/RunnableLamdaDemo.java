package com.abonado.newfeatures.lambda;

public class RunnableLamdaDemo {

	public static void main(String[] args) {
		Runnable myRunnable = () -> {
										for(int i=0; i<10; i++) System.out.println("Child Thread");
									};
									
		Thread myThread = new Thread(myRunnable);
		myThread.start();
		
		for(int i=0; i<10; i++) System.out.println("Main Thread");
	}

}
