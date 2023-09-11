/*Q2. Scenario based programming

Given an array of N positive integers and another number X. Determine whether or not there
exists two elements in Arr, whose sum is exactly X.
Example 1:
Input:
N=6, X=16

Arr[]= {1,4,45,6,10,8}
Output: Yes
Explanation: Arr[3]+Arr[4]=6+10=16
Example 2:
N=5,X=10
Arr[]={1,2,4,3,6}
Output: Yes
Explanation: Arr[2]+Arr[4]=4+6=10.*/
package com.ccpp.practice;

public class FindSumExactlySameorNot {

	public static void main(String[] args) {
		int arr[]={1,2,4,3,6};
		int x=10;
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==x)
				{
					System.out.println("Yes");
					System.out.println("arr["+i+"]" +" + "+ "arr["+j+"]"+" = "+x);
					flag=false;
				}
			}
		}
		if(flag)
		{
			System.out.println("there are no two elemets present having sum qual to "+x);
		}
	}
}
