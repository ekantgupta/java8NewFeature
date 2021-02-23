package com.java8.features;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<Integer, Integer> fun = i -> i*i;
		System.out.println("Square of value is : " + fun.apply(10));
	}

}
