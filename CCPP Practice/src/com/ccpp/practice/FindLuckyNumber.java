/*Create a class LuckyNumber which checks if the input is a Lucky number. 
 * A lucky number is a number where the sum of squares of every even-positioned digit (starting from the second position) is a multiple of 9.

For e.g. 1623 = 6^2+3^2 = 45 is a multiple of 9 and hence is a Lucky number

Implement the above program using appropriate iterational and conditional control structures.
*/
package com.ccpp.practice;

public class FindLuckyNumber {

//	public static void main(String[] args) {
//		int num=1623;
//		int temp=num;
//		int count=0;
//		int sum=0;
//		while(temp!=0)
//		{
//			count++;
//			temp=temp/10;
//		}
//		temp=num;
//		int arr[]=new int[count];
//		for(int i=count-1;i>=0;i--)
//		{
//			arr[i]=num%10;
//			num=num/10;
//		}
//		for(int i=1;i<=count-1;i=i+2)
//		{
//			sum=sum+arr[i]*arr[i];
//		}
//		if(sum%9==0)
//		{
//			System.out.println(temp+" is lucky Number");
//		}
//		else {
//			System.out.println(temp+" is not lucky Number");
//		}
//	}
	
	public static void main(String args[])
	{
		int num=262;
		int temp=num;
		int rev=0;
		int evenPos=1,evenPosDigit=0;
		int sum=0;
		while(temp!=0)
		{
			rev=rev*10+temp%10;
			temp=temp/10;
		}
		while(rev!=0)
		{
			if(evenPos%2==0)
			{
				evenPosDigit=rev%10;
				sum=sum+evenPosDigit*evenPosDigit;
			}
			rev=rev/10;
			evenPos++;
		}
		if(sum%9==0)
		{
			System.out.println(num+" is lucky Number");
		}
			else {
			System.out.println(num+" is not lucky Number");
		}
		
	}
	
}
