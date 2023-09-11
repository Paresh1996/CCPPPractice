/*1. Write a program which can compute the factorial of a given numbers.

For example the input is : 7

Then, the output should be: 5040*/

package com.ccpp.practice;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of "+num+" is "+fact);
	}
}
