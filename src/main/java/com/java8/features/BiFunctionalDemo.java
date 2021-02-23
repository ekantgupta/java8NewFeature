package com.java8.features;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionalDemo {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> checkValue = (a, b) -> (a + b) >= 5;
		System.out.println("Result of 2 and 4 : " + checkValue.test(2,  4));
		
		System.out.println("Result of 1 and 2 : " + checkValue.test(1,  2));
		
		BiFunction<Integer, Integer, Integer> addValues = (i, j) -> (i + j);
		System.out.println("Addition of 2 and 5 : " + addValues.apply(2,  5));
		
		BiConsumer<Integer, Integer> multiply = (i, j) -> System.out.println("Multiply of 3, 8 is " + i*j);
		
		multiply.accept(3,  8);
		
		
	}

}
