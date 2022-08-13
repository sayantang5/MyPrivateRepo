package com.App;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindThirdLargestOfAnArray {
	
	
	
	
	public static void main(String[] args) {
		
		
		String [] str= {"Amazon","Microsoft","Google","Facebook","Tcs","Wipro"};
		
		Optional<String> findFirst = Arrays.stream(str).sorted(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 
				int i = o1.compareTo(o2);
				return  - i;
			}
		}).skip(2).findFirst();
		
		
		//asList(str)
		
		
		System.out.println(findFirst.get());
		
		
		
		
		System.out.println("********************************************");
		
	  int[] inta = {4,5,6,7,8,9,3,2,3,1};
		
		
	  Optional<Integer>  int1 =Arrays.stream(inta).boxed().sorted().skip(2).findFirst();
	  
	  System.out.println(int1.get());
		
	}

}





//To convert from a stream of primitives to a stream of objects, these classes provide boxed()
//method that returns a Stream consisting of the elements of the given stream, each boxed to an object of the corresponding wrapper class.
