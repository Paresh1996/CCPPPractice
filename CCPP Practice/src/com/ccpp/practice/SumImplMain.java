package com.ccpp.practice;
import Interfaces.SumLambda;

public class SumImplMain {

	public static void main(String[] args) {
		//Using simple method to implement functional interface
		SumLambda s1= new sumLambdaimpl();
		System.out.println(s1.sum(5, 8));
		
		//Using anonymous class 
		SumLambda s2=new SumLambda() {
			@Override
			public int sum(int a, int b) {
				return a+b;
			}
		};
		System.out.println(s2.sum(9, 8));
		
		//Using lambda expression
		SumLambda s3=(a,b)->{return a+b;};
		System.out.println(s3.sum(5, 5));
	}
}
