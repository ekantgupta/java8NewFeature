package com.java8.features;

import java.util.function.Predicate;

public class PredicateJoining {

	public static void main(String[] args) {
		
		Predicate<String> lengthCheckPred = s -> s.length() >=5;
		System.out.println("Length of the string : " + lengthCheckPred.test("Hello Ekant"));
		
		Predicate<String> checkEvenOdd = s -> s.length() %2 == 0;
		System.out.println("Even number is : " + checkEvenOdd.test("Hello Ekant"));
		
		//Predicate joinig 
		System.out.println("Final And joining : " + lengthCheckPred.and(checkEvenOdd).test("Hello Ekant"));
		
		System.out.println("Final Or joining : " + lengthCheckPred.or(checkEvenOdd).test("Hello Ekant"));
		
		System.out.println("Final And joining : " + lengthCheckPred.negate().test("Hello Ekant"));
	}

}
