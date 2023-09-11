package com.ccpp.practice;

import java.io.*;
import java.util.Scanner;
public class StringToken {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the String");
	     String s = scan.nextLine();
	     String arr[]=s.trim().split("[!,.?@_' ]+");
	     int count=0;
	     for(String a:arr)
	     {
	    	 if(!a.isEmpty())
	    	 {
	    		 count++;
	    	 }
	     }
	     System.out.println(count);
//	     if(s.length()==0)
//	     {
//	         System.out.println("0");
//	     }
//	     else if(arr.length==1 && s.charAt(0)==' ' && arr[0].charAt(0)==' ')
//	     {
//	       System.out.println("0");
//	     }
//	     else {
//	    	 System.out.println(arr.length);
//	     }
	     for(String a:arr)
	     {
	          System.out.println(a);
	     }
	     scan.close();
	}
}
