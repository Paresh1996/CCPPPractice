//Q5. Write a code to find circular rotation of an array by K positions.
package com.ccpp.practice;

public class CircularRotationOfArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		int d=4;
		int n=d;
		System.out.println("Array before shifting :");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		while(d!=0)
		{
			int temp=arr[0];
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=temp;
			d--;
		}
		
		System.out.println("Array after shifting by "+n+" position :");
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
}
