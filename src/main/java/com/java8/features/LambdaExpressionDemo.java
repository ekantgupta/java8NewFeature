package com.java8.features;

import java.util.function.BiConsumer;

public class LambdaExpressionDemo {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> bi = (a, b) -> System.out.println(a + b);
		bi.accept(10,  15);
		
		CalculateAddtion cal = (a, b) -> System.out.println(a + b);
		cal.add(100, 200);
	}

}
