package com.abonado.newfeatures.fi.consumers;

import java.util.function.Consumer;

public class ConsumersDemo {

	public static void main(String[] args) {
		Consumer<String> consumer = s -> System.out.println(s);
		consumer.accept("hello world");
		
		Consumer<String> consumer1 = s -> System.out.println(s.toUpperCase());
		Consumer<String> newLine = o -> System.out.println();
		
		newLine.andThen(consumer).andThen(newLine).andThen(consumer1).accept("and then demo");

	}

}
