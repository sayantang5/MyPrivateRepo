package com.App;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MapInJava8 {
	
	
     public static void main(String [] args)	{
    	 
    	 
    	 List<Integer> intlist =Arrays.asList(1,2,3,4,5,6,7,8,9,5,6,1,2);
    	 
    	 Function<Integer,Integer> func = n->n*2;
    	 Function<Integer,Integer> func1 =n->n+2;
    	 
    	 
             List<Integer> list =	 intlist.stream().map(func.andThen(func1)).collect(Collectors.toList());
    	 
    	 
    	    List<Integer> list1 =	 intlist.stream().map(func.compose(func1)).collect(Collectors.toList());

    	    list1.forEach(System.out::println);
	
	
	
	
	
	
}	
		
	

}
