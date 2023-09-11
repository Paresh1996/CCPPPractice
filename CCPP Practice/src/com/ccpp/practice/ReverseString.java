/*3. Given a String S, reverse the string without reversing its individual words. Words are separated by
dots.

Input:

S = i.like.this.program.very.much

Expected Output:

much.very.program.this.like.i*/

package com.ccpp.practice;

public class ReverseString {

	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		String parts[]=s.split("[.]");//or s.split("\\.");
		for(int i=parts.length-1;i>=0;i--)
		{
			System.out.print(parts[i]+".");
		}
	}
}
