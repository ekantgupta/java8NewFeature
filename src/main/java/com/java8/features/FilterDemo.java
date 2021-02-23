package com.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(5);
		
//		Stream<Integer> filter = list.stream().filter(x -> x%2 == 0);
//		filter.forEach(x -> System.out.println(x));
		
		list.stream().filter(x -> x%2 == 0).forEach(x -> System.out.println(x));

	}

}
