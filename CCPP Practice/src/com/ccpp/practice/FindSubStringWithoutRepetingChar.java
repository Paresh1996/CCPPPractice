/*Q4. Given a string, find the length of the longest substring without repeating characters.
Example:
The longest substring without repeating letters for “abcdabcdbc” is “abcd” which is of length 4.
For “cccccc”, the longest substring is “c” with the length of 1.*/

package com.ccpp.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindSubStringWithoutRepetingChar {
	//Using HashMap
	/*public static void main(String[] args) {
		String str="pwwkew";
		char str1[]=str.toCharArray();
		HashMap<Character, Character> lst=new HashMap<Character, Character>();
		for(int i=0;i<str1.length;i++)
		{
			lst.put(str1[i], str1[i]);
		}
		String sub=lst.toString();
		System.out.println("Length of substring is "+lst.size()+" and substring is "+sub);
		
	}*/
//	public static void main(String[] args) {
//		String str="pwwkew";
//		Set<Character> sub=new HashSet<>();
//		int i=0,j=0;
//		int maxCount=0;
//		while(i< str.length() && j< str.length())
//		{
//			if(!sub.contains(str.charAt(j)))
//			{
//				sub.add(str.charAt(j));
//				j++;
//				maxCount=Math.max(j-i, maxCount);
//			}
//			else {
//				sub.remove(str.charAt(i));
//				i++;
//			}
//		}
//		System.out.println("Length of substring is "+maxCount+" and substring is "+sub);
//	}
	
	public static void main(String[] arg)
	{
		String str="pwwkew";
		Set<Character> lst=new HashSet<>();
		int i=0,j=0;
		int maxCount=0;
		while(i< str.length() && j< str.length())
		{
			if(!lst.contains(str.charAt(j)))
			{
				lst.add(str.charAt(j));
				j++;
				maxCount=Math.max(j-i, maxCount);
			}else {
				lst.remove(str.charAt(i));
				i++;
			}
		}
		System.out.println("Length of substring is "+maxCount+" and substring is "+lst);
	}
}
