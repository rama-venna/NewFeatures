package com.abonado.newfeatures.fi.suppliers;

import java.util.function.Supplier;

public class SuppliersDemo {

	public static void main(String[] args) {
		Supplier<String> stringSupplier = () ->  "Hello Supplier";
		System.out.println(stringSupplier.get());
		
		System.out.println(Math.random() + "    " + (int) Math.random()*10);
		
		String str = "ABCDEFGH";
		Supplier<Character> charSupplier = () ->  str.charAt((int) Math.random());
		
		System.out.println(charSupplier.get());
		

	}

}
