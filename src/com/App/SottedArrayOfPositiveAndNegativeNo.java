package com.App;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SottedArrayOfPositiveAndNegativeNo {
	
	
	
	public static void main(String[] args) {
		
		String[] stringarray = {"Sayan","Tukai","Ayan","Munti"};
		
		
		//Stream<String> asList = Arrays.asList(stringarray).stream()
		
		//List<String> asList2 = Arrays.asList(stringarray);
		
		
		int[] arr = {-5,5-9,8,10,-3,4,7,8,9,4,5,6};
		
		
		              List<int[]> asList = Arrays.asList(arr);//.stream().collect(Collectors.toList());
		              
		              
		          	//int[] a = asList.get(0);
					//Arrays.sort(a);//to short the array 
		          	for(int[] ant : asList)
		          	{
		          		
		          		
		          		Arrays.sort(ant);
		          	  for(int a :ant)
		          	  {
		          		System.out.print(a);
		          		  
		          	  }
		          		
		          		
		          	}
		          	
		          	
		          	System.out.println("*********************************");
		        	
		
	List<Integer> integ=	Arrays.stream(arr).boxed().collect(Collectors.toList());
		
	    Collections.sort(integ);//tp short the collection 
	integ.forEach(System.out:: print);
	
	
	}

}




//Now, use the boxed() method to return a Stream consisting of the elements of this stream, each boxed to an Integer.



//IntStream integ=	Arrays.stream(arr);
//Stream<Integer> integ=	Arrays.stream(arr).boxed();
//List<Integer> integ=	Arrays.stream(arr).boxed().collect(Collectors.toList());