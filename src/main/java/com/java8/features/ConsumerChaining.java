package com.java8.features;

import java.util.function.Consumer;

public class ConsumerChaining {

	public static void main(String[] args) {
		Consumer<Integer> squareMe = i -> System.out.println("Square of 5 is : " + i*i);
		squareMe.accept(5);
		
		Consumer<Integer> doubleMe = i -> System.out.println("Double of 5 is : " + 2*i);
		doubleMe.accept(5);
		
		squareMe.andThen(doubleMe).accept(5);

	}

}
