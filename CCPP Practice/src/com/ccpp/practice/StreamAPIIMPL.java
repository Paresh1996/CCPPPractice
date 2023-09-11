package com.ccpp.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIIMPL {

	public static void main(String[] args) {
		
		 List<Integer> num=Arrays.asList(4,7,1,9,3,2);
		 //num.stream().map(i->i*i).collect(Collectors.toList());
		 System.out.println(num.stream().map(i->i*i).collect(Collectors.toList()));
		 System.out.println(num.stream().filter(i->i%2!=0).collect(Collectors.toList()));
		 System.out.println(num.stream().sorted().collect(Collectors.toList()));
	}
}
