package com.java8.features;

import java.util.List;
import java.util.function.Predicate;

public class PredicateUtility {
	
	public static boolean checkListSize(List<String> list) {
		Predicate<List<String>> pList = s -> s.size() != 0;
		return pList.test(list);
	}

}
