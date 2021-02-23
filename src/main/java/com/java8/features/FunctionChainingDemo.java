package com.java8.features;

import java.util.function.Function;

public class FunctionChainingDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> doubleIt = i -> 2*i;
		System.out.println("Double of 4 is : " + doubleIt.apply(4));
		
		Function<Integer, Integer> cubeIt = i -> i*i*i;
		System.out.println("Cube of 4 is : " + cubeIt.apply(4));
		
		// Function andThen method 
		System.out.println("First double and then cube of 4 : " + doubleIt.andThen(cubeIt).apply(4));
		
		System.out.println("First cube and then double of 4 : " + doubleIt.compose(cubeIt).apply(4));
	}

}
