package com.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<String> prediacte = s -> s.length() >= 5;
		System.out.println("The length of String is : " + prediacte.test("This is the test"));
		
		Predicate<List<String>> predicateSize = s -> s.size() != 0;
		System.out.println("Size is not zero : " + predicateSize.test(Arrays.asList("AAA", "BBB")));
		List<String> list = new ArrayList();
		System.out.println(PredicateUtility.checkListSize(list));
	}

}
