package com.App;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterOfJava8 {
	
	
	public static void main(String[] args) {
		
		
		List<Integer> intlist = Arrays.asList(20,40,50,60,70,80,90);
		
		List<Integer> Filterlist= intlist.stream().filter(s->  s>40).filter(s->s<80).collect(Collectors.toList());
		System.out.println(Filterlist);
		
		
		Predicate<Integer> p = no->no<40;
		Predicate<Integer> p1 = no->no<80;
		
		List<Integer> Filterlist1= intlist.stream().filter(p.negate().and(p1)).collect(Collectors.toList());
		System.out.println(Filterlist1);
	
	}

}
