package com.java8.features;

@FunctionalInterface
public interface FuntionalInterfaceDemo {

	void displayMethod();
	
	default void display1() {
		System.out.println(" IN Funtional interface-- > display 1 method");
	}
	
	default void display2() {
		System.out.println(" IN Funtional interface-- > display 2 method");
	}
}
