/*5. Given character array that contains special character together with alphabates ('a' to 'z' and 'A' to 'Z'),
reverse this character array in a way that special characters are not affected. We can use ascii
comparison for matching characters.

Array should be repeated in-place and in single loop. No additional data structure allowed. No need to
print this array.

Method signature

reverseAlphabate(char arr[], int arr_size){

//your logic goes here.
}

Example 1
Input - char arr[] : a,b,$,c
reverseAlphabate(arr,4)
Output-
arr = c,b,$,a

Example 2

Input - char arr[] : A,b,c,d,e,!,$
reverseAlphabate(arr,4)
Output-
arr = e,d,c,b,A,!,$*/
package com.ccpp.practice;

public class ReverseArrayUsingSpecialChar {

	public static void main(String[] args) {
		char arr[] = {'A','b','c','d','e','!','$'};//{'a','b','$','c'}; 
		reverseAlphabate(arr,arr.length);
		for(char c:arr)
		{
			System.out.print(c+" ");
		}
	}
	private static void reverseAlphabate(char arr[], int arr_size){
		int l=0;
		int r=arr_size-1;
		System.out.println("Original Array");
		for(char c:arr)
		{
			System.out.print(c+" ");
		}
		System.out.println();
		while(l<r)
		{
			if(!Character.isAlphabetic(arr[l]))
			{
				l++;
			}
			else if(!Character.isAlphabetic(arr[r]))
			{
				r--;
			}
			else {
				char temp=arr[r];
				arr[r]=arr[l];
				arr[l]=temp;
				l++;
				r--;
			}
		}
		
		
//		int l=0;
//		int r=arr.length-1;
//		while(l<r)
//		{
//			if(!Character.isAlphabetic(arr[l]))
//			{
//				l++;
//			}
//			else if(!Character.isAlphabetic(arr[r]))
//			{
//				r--;
//			}
//			else {
//				char temp=arr[r];
//				arr[r]=arr[l];
//				arr[l]=temp;
//				l++;
//				r--;
//			}
//		}
	}
}
