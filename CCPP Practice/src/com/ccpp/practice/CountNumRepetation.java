/*2. Write a code for below :

int am[] = {10, 20, 50, 30, 20, 30, 50, 20, 30, 20, 30, 50}

You have to count no of repetition of each element present in the array and print the element whose
count is odd times.*/

package com.ccpp.practice;

import java.util.HashMap;
import java.util.Map;

public class CountNumRepetation {

	public static void main(String[] args) {
		int am[] = {10, 20, 50, 30, 20, 30, 50, 20, 30, 20, 30, 50,30};
		Map<Integer,Integer> nums=new HashMap<Integer,Integer>();
		int count=0;
		for(int i=0;i<am.length;i++)
		{
			for(int j=0;j<am.length;j++)
			{
				if(am[i]==am[j])
				{
					count++;
				}
			}
			if(count%2!=0)
			{
				 nums.put(am[i],am[i]);
			}
			count=0;
		}
		System.out.println(nums.keySet());
	}
}
