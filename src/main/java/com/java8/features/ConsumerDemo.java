package com.java8.features;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<Integer> squareIt = i -> System.out.println("Square of 5 is : " + i*i);
		squareIt.accept(5);
	}

}
