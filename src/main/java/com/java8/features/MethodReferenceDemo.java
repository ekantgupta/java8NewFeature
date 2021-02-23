package com.java8.features;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		FuntionalInterfaceDemo fid = Test :: testImpl;
		fid.displayMethod();
		
		FuntionalInterfaceDemo fidLambda = () -> System.out.println("Implementation of SAM");
		fidLambda.displayMethod();
	}
}

class Test {
	public static void testImpl() {
		System.out.println("In test class implementation details");
	}
}
