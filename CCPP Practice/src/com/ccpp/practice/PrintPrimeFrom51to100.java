/*4. Print all the prime numbers between 51 from 100.*/
package com.ccpp.practice;

public class PrintPrimeFrom51to100 {

	public static void main(String[] args) {
		int count=0;
		System.out.println("Prime numbes from 51 to 100 ");
		for(int i=51;i<=100;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.print(i+" ");
			}
			count=0;
		}
	}
}
