package com.ccpp.practice;

import java.util.ArrayList;
import java.util.Collections;

public class FindSmallestAndLargestInLexicographicalOrder {

	public static void main(String[] args) {
		String str="eelcometowjava";
		int subLen=3;
		System.out.println(getSmallestAndLargest(str,subLen));
	}
	
//	public static String getSmallestAndLargest(String s,int len)
//	{
//		String smallest = "";
//        String largest = "";
//        String str=s;
//        ArrayList<String> lst=new ArrayList<>();
//        int index=0;
//        for(int i=0;i<str.length();i++)
//        {
//        	index=i;
//        	String temp="";
//            for(int j=0;j<3;j++)
//            {
//            	temp=temp+str.charAt(index);
//            	if(index==str.length()-1)
//                {
//                	break;
//                }
//            	index++;
//            }
//            if(temp.length()==len)
//            {
//            	lst.add(temp);
//            }
//        }
//        Object[] name=lst.toArray();
//        int count=lst.size();
//        String temp;
//        for (int i = 0; i < count; i++) 
//        {
//            for (int j = i + 1; j < count; j++) 
//            {
//              if (((String) name[i]).compareTo((String) name[j]) > 0) 
//              {
//                temp = (String) name[i];
//                name[i] = name[j];
//                name[j] = temp;
//              }
//            }
//         }
//        smallest=(String) name[0];
//        largest=(String) name[name.length-1];
//        return smallest + "\n" + largest;
//	}
	
	public static String getSmallestAndLargest(String s,int len)
	{
		String smallest=s.substring(0,len);
		String largest="";
		String str=s;
		int sublen=len;
		String temp="";
		for(int i=0;i<str.length();i++)
		{
			if(sublen>str.length())
			{
				break;
			}
			if(smallest.compareTo(str.substring(i, sublen)) >0)
			{
				smallest=str.substring(i, sublen);
			}
			else if(largest.compareTo(str.substring(i, sublen)) <0)
			{
				largest=str.substring(i, sublen);
			}
			sublen++;
		}
		return smallest + "\n" + largest;
	}
}
