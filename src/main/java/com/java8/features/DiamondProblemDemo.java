package com.java8.features;

public class DiamondProblemDemo implements DiamondInterface1, DiamondInterface2{

	@Override
	public void m1() {
		//amondInterface1.super.m1();
		DiamondInterface2.super.m1();
	}
	
	public static void main(String[] args) {
		DiamondProblemDemo dp = new DiamondProblemDemo();
		dp.m1();
	}


}
