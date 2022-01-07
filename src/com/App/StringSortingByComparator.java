package com.App;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringSortingByComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String[] str= {"Kolkata","Mumbai","Basirhat","Peara","Champapukur","USA"};
		
		List<String> collect = Arrays.stream(str).sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		
		
		collect.forEach(s->System.out.println(s));
		
		System.out.println("*******************************");
		
		
		
		List<String> collect1 = Arrays.stream(str).sorted(Comparator.reverseOrder()).collect(Collectors.toList());


		collect1.forEach(s->System.out.println(s));
		
		
		System.out.println("*******************************");

		
		List<String> collect11 = Arrays.stream(str).sorted((o1,o2)->o1.compareToIgnoreCase(o2)).collect(Collectors.toList());

		collect11.forEach(s->System.out.println(s));
		
		
		System.out.println("*******************************");
		
		
		List<String> collect111 = Arrays.stream(str).sorted(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2) ;
			}
		}).collect(Collectors.toList());


		collect111.forEach(s->System.out.println(s));

		System.out.println("*******************************");
	}

}
