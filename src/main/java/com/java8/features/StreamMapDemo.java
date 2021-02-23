package com.java8.features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(50);
		list.add(5);
		
		Stream<Integer> map = list.stream().map(i -> i*i);
		map.forEach(x -> System.out.println(x));
	}

}
