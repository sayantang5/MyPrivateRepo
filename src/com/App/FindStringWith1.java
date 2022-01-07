package com.App;

import java.util.Arrays;
import java.util.List;

public class FindStringWith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<Integer> intlist = Arrays.asList(15,16,23,14,15,23,58,55);
		
		intlist.stream().map(s->s+"").filter(s->s.startsWith("1")).map(i-> Integer.parseInt(i)).forEach(System.out::println);

	}

}
